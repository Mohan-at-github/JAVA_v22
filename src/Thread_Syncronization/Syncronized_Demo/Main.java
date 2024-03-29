package Thread_Syncronization.Syncronized_Demo;

import java.util.Objects;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Object lock=new Object();
        Count count=new Count(0);
        Adder adder=new Adder(count, lock);
        Subtractor subtractor=new Subtractor(count,lock);

        Thread t1=new Thread(adder);
        Thread t2=new Thread(subtractor);
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println(count.num);
    }
}
