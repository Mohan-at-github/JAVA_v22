package Streams.Basics;

import java.util.List;
import java.util.stream.Stream;

public class ParallelStreams {
    //A type of stream that enables parallel processing of element
    //allowing multiple threads to process parts of the stream simultaneously
    //this can significantly improve performance for large set data
    //work load will divide among different threads
    //stream operation should be stateless(one ele not dependent on others)
    //parallel stream convert a stream in to multiple sub Stream
    public static void main(String[] args) {
        //using normal stream
        long starttime=System.currentTimeMillis();
        List<Integer> list= Stream.iterate(1, x->x+1).limit(20000).toList();
        List<Long> list1=list.stream().map(ParallelStreams::factorial).toList();
        long endTime=System.currentTimeMillis();
        System.out.println("time taken: "+ (endTime-starttime)+ "ms");

        //Parallel stream
        long starttimes=System.currentTimeMillis();
        List<Integer> list3= Stream.iterate(1, x->x+1).limit(20000).toList();
        List<Long> list2=list.parallelStream().map(ParallelStreams::factorial).toList();
        long endTimes=System.currentTimeMillis();
        System.out.println(STR."time taken: \{endTimes - starttimes}ms");
    }
    private static long factorial(int x){
        long res=1;
        for(int i=1;i<=x;i++){
            res*=i;
        }
        return res;
    }
    //Parallel streams are most effective for CPU-intensive or large datasets where tasks are independent
    //they may add overhead for simple tasks or small datasets

    //Parallel streams will not work for dependent data set
    //eg: cumulative sum where one element depends on sum of previous elements

    //sequential() to convert parallel streams in to sequence
}
