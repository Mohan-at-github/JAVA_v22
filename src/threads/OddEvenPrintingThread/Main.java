package threads.OddEvenPrintingThread;

import java.util.OptionalDouble;

public class Main {
    public static void main(String[] args) {
        EvenPrinter evenobj=new EvenPrinter();
        oddPrinter oddobj=new oddPrinter();
        Thread t1=new Thread(evenobj);
        Thread t2=new Thread(oddobj);
        t1.start();
        t2.start();
    }
}
//here t1 and t2 threads are running independently,
// and its CPU scheduling(round robin technique) is done OS and its completely Random