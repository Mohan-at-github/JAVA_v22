package Thread_Syncronization.Lock_Demo;

import java.util.concurrent.locks.Lock;

public class Subtractor implements Runnable {
    Count count;
    Lock lock;
    public  Subtractor(Count count, Lock lock)
    {
        this.count=count;
        this.lock=lock;
    }

    @Override
    public void run() {
        for(int i=0;i<5000;i++)
        {
            lock.lock();
            count.num--;
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