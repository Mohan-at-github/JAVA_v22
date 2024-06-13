package Lambdas;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class printlistOfString {
    public static void main(String[] args) {
        List<String> stringList=new ArrayList<>();
        stringList.add("Spring");
        stringList.add("Spring Boot");
        stringList.add("API");
        stringList.add("Microservices");
        stringList.add("AWS");
        stringList.add("PCF");
        stringList.add("Azure");
        stringList.add("Docker");
        stringList.add("Kubernetes");

        //traditional method
        System.out.println("traditional method");
        for(String str:stringList){
            System.out.println(str);
        }
        System.out.println();

        //using functional programming
        System.out.println("printing using streams");
        stringList.stream()
                .forEach(System.out::println);
        System.out.println();

        //print courses containing the word "Spring"
        System.out.println("print course with Spring");
        stringList.stream().filter(string->string.contains("Spring"))
                .forEach(System.out::println);
        System.out.println();

        //print course which has at least 4 character
        System.out.println("course which has atleast 4 character");
        stringList.stream()
                .filter(course -> course.length()>=4)
                .forEach(System.out::println);

        //print number of character in each course name
        System.out.println("print number of character in each course name");
        stringList.stream()
                .map(course->course+" "+course.length())
                .forEach(System.out::println);
    }


}
