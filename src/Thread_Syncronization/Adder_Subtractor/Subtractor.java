package Thread_Syncronization.Adder_Subtractor;

public class Subtractor implements Runnable {
    Count count;
    public  Subtractor(Count count)
    {
        this.count=count;
    }

    @Override
    public void run() {
        for(int i=0;i<5000;i++)
        {
            count.num--;
        }
    }
}
