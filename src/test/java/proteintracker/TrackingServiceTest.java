package proteintracker;


import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;


import static org.junit.Assert.assertEquals;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.matchers.JUnitMatchers.*;

public class TrackingServiceTest {

    private TrackingService service= new TrackingService();


//    @BeforeClass
//    public static void  before(){
//        System.out.println("before class");
//    }
//
//    @AfterClass
//    public static void afterClass(){
//        System.out.println("after class");
//    }


    /**
     * cette methode permet d"executer cette methode a chaque fois qu'un test est executé
     * cela permet d'initialiser a chaque fosi le service pour que les doublons ne passent pas
     */
    @Before
    public void setUp(){
        System.out.println("@Before");
        service= new TrackingService();
    }
//
//    @After
//    public void after(){
//        System.out.println("after");
//    }


    /**
     * Rule time-out permet de definir le temps d'execution du test
     */

    @Rule
    public Timeout timeout= new Timeout(30);

    @Category(GoodTestCategory.class)
    @Test
    public void  newTrackingServiceTestTotalIsZero(){

        assertEquals("traking service total was not zeor", 0,service.getTotal());
    }

    @Test
    @Category({GoodTestCategory.class,BadCategory.class})
    public void addProtein() {

        service.addProtein(10);

            Assert.assertThat(service.getTotal(),is(10)  );


        assertEquals("protein amount is not correct", 10, service.getTotal());
    }

    @Test
    public void removeProtein() {
    }

    @Test
    public void getTotal() {
    }


//    @Rule
//    public ExpectedException thrown= ExpectedException.none();
//    @Test(expected = InvalidGoalException.class)
//    public void setGoal() throws InvalidGoalException {
//
//
//
//        thrown.expect(InvalidGoalException.class);
//        thrown.expectMessage("goal was less than 0");
//        service.setGoal(-5);
//
//    }





    @Test
    public void isGoalMet() {
    }

    @Test
    public void getHistory() {
    }

//    @Test(timeout = 200)
//    public void badTest(){
//        for(int i=0; i<100000000; i++){
//            service.addProtein(1);
//        }
//    }
}