package threads.usingExtends;
import java.lang.*;
public class MyThreadClass extends Thread {
    public void run() //this method should be always public becz shld be available outside this class also
    {
        System.out.println("Hello world");
    }
}

