package threads.usingInterface;

public class Main {
    public static void main(String[] args) {
        MythreadClass obj=new MythreadClass();
        System.out.println("Main thread: "+Thread.currentThread().getName());
        Thread t=new Thread(obj);
        t.start();
        Thread t1=new Thread(obj);
        t1.start();
    }
}
