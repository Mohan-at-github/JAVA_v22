package Thread_Syncronization.Adder_Subtractor;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Count count=new Count(0);
        Adder adder=new Adder(count);
        Subtractor subtractor=new Subtractor(count);

        Thread t1=new Thread(adder);
        Thread t2=new Thread(subtractor);
        t1.start();
        t2.start();

        //if we not use join here,
        // main thread will not wait for t1 and t2
        // to complete their execution it will die soon
        //and it will give output without considering outputs from t1 and t2.
        t1.join();
        t2.join();

        System.out.println(count.num);
    }
}
