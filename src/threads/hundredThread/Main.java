package threads.hundredThread;

import threads.usingInterface.MythreadClass;

public class Main {
    public static void main(String[] args) {
        MyThread obj=new MyThread();
        for(int i=1;i<=100;i++)
        {

            Thread t=new Thread(obj);
            t.start();
        }
    }
}
