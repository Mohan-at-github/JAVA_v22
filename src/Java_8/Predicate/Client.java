package Java_8.Predicate;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

public class Client {
    public static void main(String[] args) {
        //test is a SAM
        Predicate<Integer> isEven=x->x%2==0; //test method impl
        System.out.println(isEven.test(5));
        System.out.println(isEven.test(4));

        //sum of even numbers
        List<Integer> numbers= Arrays.asList(2,7,5,4,3,9,7,2,4);
        int evenSum=numbers.stream().filter(x->x%2==0).mapToInt(x->x).sum();
        System.out.println(evenSum);

        //sum of odd numbers
        int oddSum=numbers.stream().filter(x->x%2!=0).mapToInt(x->x).sum();
        System.out.println(oddSum);

        //Print even number and no duplicate
        Set<Integer> evenSet=new HashSet<>();
        for(Integer i:numbers){

            if(isEven.test(i)){
                evenSet.add(i);
            }
        }
        System.out.println(evenSet.toString());

        //Is the first Character of String V
        Predicate<String> isFrstCharV=x->x.toUpperCase().charAt(0)=='V';
        System.out.println(isFrstCharV.test("Mohan"));
        System.out.println(isFrstCharV.test("Veeresh"));

        Predicate<String> endsWithH=x->x.toUpperCase().charAt(x.length()-1)=='H';
        System.out.println(endsWithH.test("Veeresh"));

        //Default method
        //1.AND
        Predicate<String> strwthV_endwthH=isFrstCharV.and(endsWithH);
        System.out.println(strwthV_endwthH.test("Veeresh"));
        System.out.println(strwthV_endwthH.test("VOMSHI"));

        //2.OR
        Predicate<String> OR=isFrstCharV.or(endsWithH);
        System.out.println(OR.test("Veeresh"));
        System.out.println(OR.test("vOMSHI"));
        System.out.println(OR.test("sOMSHI"));

        //3.Negate
        Predicate<String> EndWithN=x->x.toLowerCase().charAt(x.length()-1)=='n';
        System.out.println(EndWithN.negate().test("mohaN"));
        System.out.println(EndWithN.negate().test("LoHith"));

        //Static method: is accessed using interface name
        //IsEqual
       //when ever you want to check equality of two objects etc use isEqual
        Student s1=new Student(1,"mohan");
        Student s2=new Student(1,"mohan");
        Student s3=new Student(2,"mohan");
        Student s4=new Student(3,"RAM");
       Predicate<Student> predicate= Predicate.isEqual(s2);
        System.out.println("IsEqual");
        System.out.println(predicate.test(s1));

    }
        public static class Student{
        int id;
        String name;
        public Student(int id, String name){
            this.id=id;
            this.name=name;
        }
    }
}
