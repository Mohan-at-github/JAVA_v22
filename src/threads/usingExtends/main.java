package threads.usingExtends;

public class main {
    public static void main(String[] args) {
        MyThreadClass obj=new MyThreadClass();
//        Thread t1=new Thread(obj);
//        t1.start();
        obj.start();
    }
}
