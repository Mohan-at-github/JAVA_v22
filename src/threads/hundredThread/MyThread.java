package threads.hundredThread;

public class MyThread extends Thread {
    int no=0;
    public MyThread(int num)
    {
        no=num;
    }
    public void run()
    {
        System.out.println(no+ " Print by Thread : "+Thread.currentThread().getName());
    }
}
