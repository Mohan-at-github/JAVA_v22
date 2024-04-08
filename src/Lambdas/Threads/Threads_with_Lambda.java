package Lambdas.Threads;

public class Threads_with_Lambda {
    public static void main(String[] args) {
        Runnable rLambda=() ->{
            System.out.println("thread "+Thread.currentThread().getName());
        };
        /*
        or
           Runnable r=() ->System.out.println("thread "+Thread.currentThread().getName());
         */
        Thread t1=new Thread(rLambda);
        t1.start();
    }
}
