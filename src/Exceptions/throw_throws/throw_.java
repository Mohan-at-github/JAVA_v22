package Exceptions.throw_throws;

import java.util.Scanner;

public class throw_ {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age ");
        int age = sc.nextInt();
        if (age < 18) {
           // System.out.println("You are not eligible");
            //to make user more alert we use throw key word
            throw new RuntimeException("You are not eligible");
        }
        else
            System.out.println("You are eligible for vote");


    }
}
