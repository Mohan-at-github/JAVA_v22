package Java_8.Threads;

public class Client {
    public static void main(String[] args) {
        //without JAVA-8
        RunnableImpl runnable=new RunnableImpl();
        //here we are giving impl class of runnable interface to thread constructor
        Thread thread=new Thread(runnable);
        thread.run();

        //With JAVA-8
        Runnable runnable1=()->{
            for(int i=0;i<10;i++){
                System.out.println("hello : "+i);
            }
        };
        //runnable1.run();
        Thread childThread=new Thread(runnable1);
        childThread.run();
    }

}
