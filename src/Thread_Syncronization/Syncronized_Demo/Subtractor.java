package Thread_Syncronization.Syncronized_Demo;

import java.util.concurrent.locks.Lock;

public class Subtractor implements Runnable {
    private Count count;
    private Object lock;
    public  Subtractor(Count count, Object lock)
    {
        this.count=count;
        this.lock=lock;
    }

    @Override
    public void run() {
        for(int i=0;i<5000;i++) {

            synchronized (lock) {
                count.num--; //just one operation
            }
            /*
            behind the scene (3 operation)
            1. int x=count.num;
            2. x=x+1;
            3. count.num=x;
             */
        }
    }
}
