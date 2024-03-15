package threads.usingInterface;

public class MythreadClass implements Runnable{
    @Override
    public void run() {
        System.out.println("hello");
        System.out.println("I am new thread: "+Thread.currentThread().getName());
    }
}
