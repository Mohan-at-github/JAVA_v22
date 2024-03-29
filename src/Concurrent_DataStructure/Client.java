package Concurrent_DataStructure;

import java.util.concurrent.atomic.AtomicInteger;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        AtomicInteger ai=new AtomicInteger(0);
        Adder adder=new Adder(ai);
        Subtractor subtractor=new Subtractor(ai);
        Thread t1=new Thread(adder);
        Thread t2=new Thread(subtractor);
        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("output "+ ai.get());
    }
}
