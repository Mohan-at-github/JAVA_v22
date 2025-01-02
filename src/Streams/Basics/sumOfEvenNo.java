package Streams.Basics;

import java.util.Arrays;

public class sumOfEvenNo {
    public static void main(String[] args) {
        //sum of even number
        //imperative approach
        int[] array={1,4,5,7,54,65,79};
        int sum=0;
        for(int i=0;i< array.length;i++){
            if(array[i]%2==0){
                sum+=array[i];
            }
        }
        System.out.println(sum);

        //Declarative Approach
        int sum1=Arrays.stream(array).filter(x->x%2==0).sum();
        System.out.println(sum1);
    }
}
