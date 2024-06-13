package Strings;
public class A {
    public static void main(String[] args) {
        String A;
        A="Mohan";
        String B = A;
        System.out.println(A);
        System.out.println(B);
        B="Lohith";
        System.out.println(B); // here old B is not edit instead a new string is created in string constant loop of heap

        String s="Sachin";
        s.concat(" Tendulkar");//concat() method appends the string at the end
        System.out.println(s);//will print Sachin because strings are immutable objects
    }
}
//address
//here A and B are diff string present in string constant pool in heap even though A and B has same value