package Java_8.Threads;
//Defining the thread
public class RunnableImpl implements Runnable{
    @Override
    //Defining Job of the thread
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("hello : "+i);
        }
    }
}
