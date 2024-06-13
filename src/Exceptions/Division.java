package Exceptions;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        int arr[]=new int[5];
       try{
           arr[6]=a/b;

       }
//       catch(ArithmeticException e){
//           System.out.println(e.getMessage());
//       }
//       catch(ArrayIndexOutOfBoundsException e){
//           System.out.println(e.getMessage());
//       }
    catch(Throwable e)  //Throwable->Exception->RuntimeException->Arithmetic exception
    {
        System.out.println(e.getMessage());
    }
    }
}
