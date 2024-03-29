package Concurrent_DataStructure;

import Thread_Syncronization.Adder_Subtractor.Count;

import java.util.concurrent.atomic.AtomicInteger;

public class Subtractor implements Runnable {
    AtomicInteger ai;
    public Subtractor(AtomicInteger ai)
    {
        this.ai=ai;
    }

    @Override
    public void run() {
        for(int i=0;i<5000;i++)
        {
            ai.decrementAndGet();
        }
    }
}
