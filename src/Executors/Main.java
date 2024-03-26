package Executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        NumberPrinter obj1=new NumberPrinter();
       // Thread t1=new Thread(obj1);
        //t1.run(); should not use it is a direct call to main thread and main thread will start executing
        //t1.start(); //a new thread will be created from main thread for 100 times.
        //ExecutorService executorService= Executors.newFixedThreadPool(2); //static method class_name.method_name
        ExecutorService executorService = Executors.newCachedThreadPool();
        /*
        Creates a thread pool that creates new threads as needed,
        but will reuse previously constructed threads when they are available.
         These pools will typically improve the performance of programs that execute
         many short-lived asynchronous tasks. Calls to execute will reuse previously
         constructed threads if available. If no existing thread is available,
         a new thread will be created and added to the pool. Threads that have not
         been used for sixty seconds are terminated and removed from the cache.
         Thus, a pool that remains idle for long enough will not consume any resources.
         Note that pools with similar properties but different details
         (for example, timeout parameters) may be created using ThreadPoolExecutor
         constructors.
Returns:
the newly created thread pool
         */
        for(int i=0;i<10;i++) //total 5 task given and will be present in Queue worker
        {
            executorService.execute(obj1);

        }
        executorService.shutdown();
    }

}
