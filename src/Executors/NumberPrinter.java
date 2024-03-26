package Executors;

public class NumberPrinter implements Runnable{
    @Override
    public void run() {
        System.out.println("Hii I am a new task "+Thread.currentThread().getName());
        for(int i=0;i<100;i++)
        {
            System.out.println("i= "+i+ ", "+Thread.currentThread().getName());
        }
    }
}
