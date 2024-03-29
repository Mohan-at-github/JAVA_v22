package Thread_Syncronization.Lock_Demo;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable {
    private Count count;
    Lock lock;
    public Adder(Count count,Lock lock) {
        this.count = count;
        this.lock=lock;
    }

    @Override
    public void run() {
        for(int i=0;i<5000;i++)
        {
            lock.lock();
            count.num++; //just one operation
            /*
            behind the scene (3 operation)
            1. int x=count.num;
            2. x=x+1;
            3. count.num=x;
             */
            lock.unlock();

        }
    }
}
/*
now Its is like
lock
add 1 to num
unlock
        lock
sub 1 from num
unlock
 */