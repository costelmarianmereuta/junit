package fibonaci;

public class App {

    public static void main(String[] args) {

        int sum=0;
        int t1=0;
        int t2=1;

        for (int i=1 ; i<10;i++){

            sum=t1+t2;

            t1=t2;

          //  System.out.println(t1);

            t2=sum;
            System.out.println("sum "+t2);
        }

    }
}
