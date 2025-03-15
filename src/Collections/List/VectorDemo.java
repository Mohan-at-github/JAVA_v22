package Collections.List;

import java.util.ArrayList;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> vector=new Vector<>();
        System.out.println(vector.capacity());

        Vector<Integer> vector1=new Vector<>(100);
        System.out.println(vector1.capacity());

        Vector<Integer> vector3=new Vector<>(11,3);
        System.out.println(vector3.capacity());
        System.out.println(vector.size());
        System.out.println(vector1.size());
        System.out.println(vector3.size());

        vector.add(1);
        vector.add(2);
        vector.add(10);
        vector.add(99);
        vector.add(94);
        vector.add(1);
        System.out.println(vector);
        System.out.println(vector.size());


        //ArrayList Not Synchronized
        //2 threads try to but only one will be successful
        ArrayList<Integer> list=new ArrayList<>();
        Thread thread1=new Thread(()->{
            for(int i=0;i<1000;i++){
                list.add(i);
            }
        });

        Thread thread2=new Thread(()->{
            for(int i=0;i<1000;i++){
                list.add(i);
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Size of the list "+list.size());


        //vector Synchronized
        Vector<Integer> vector2=new Vector<>();
        Thread t1=new Thread(()->{
            for(int i=0;i<1000;i++){
                vector2.add(i);
            }
        });

        Thread t2=new Thread(()->{
            for(int i=0;i<1000;i++){
                vector2.add(i);
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Size of the vector "+vector2.size());
    }
}
