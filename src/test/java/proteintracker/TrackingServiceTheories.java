package proteintracker;

import org.junit.Assume;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;


import static org.junit.Assert.assertTrue;

@RunWith(Theories.class)
public class TrackingServiceTheories {

    @DataPoints
    public static int[] data(){
        return new int[]{
                1,5,10,50,20,-4
        };
    }

    @Theory
    public void postitifValuesShoulsAlwaysHavePositiveTotals(int value){
        TrackingService service= new TrackingService();
        service.addProtein(value);
        Assume.assumeTrue(value>0);
        assertTrue(service.getTotal()>0);

    }
}
