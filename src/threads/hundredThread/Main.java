package threads.hundredThread;

import threads.usingInterface.MythreadClass;

public class Main {
    public static void main(String[] args) {

        for(int i=0;i<=100;i++)
        {
            MyThread obj=new MyThread(i);
            Thread t=new Thread(obj);
            t.start();
        }
    }
}
