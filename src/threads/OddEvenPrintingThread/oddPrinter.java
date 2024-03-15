package threads.OddEvenPrintingThread;

public class oddPrinter implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<20;i++)
        {
            if(i%2!=0)
            {
                System.out.println("I am odd: "+i);
            }
        }
    }
}
