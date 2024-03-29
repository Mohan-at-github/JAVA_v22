package Thread_Syncronization.Adder_Subtractor;

public class Adder implements Runnable {
    private Count count;

    public Adder(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for(int i=0;i<5000;i++)
        {
           count.num++;

        }
    }
}
