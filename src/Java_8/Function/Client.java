package Java_8.Function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Client {
    public static void main(String[] args) {
        Function<Integer,Integer> add=x->x+2;
        System.out.println(add.apply(10));

        Function<String,Integer> strLen=x->x.length();
        System.out.println(strLen.apply("Mohan"));

        Function<String,String> subString=x->x.substring(0,3);
        System.out.println(subString.apply("mohanRaj"));

        Function<String,String> toUpper=x->x.toUpperCase();

        //Default methods
        //andthen
        Function<String,String> andthen=toUpper.andThen(subString);
        System.out.println(andthen.apply("mohan"));
        System.out.println(toUpper.andThen(subString).apply("rajashekar"));


        //compose
        Function<Integer,Integer> function1=x->x*2;
        Function<Integer,Integer> function2=x->x*x*x;
        System.out.println(function1.andThen(function2).apply(3)); //216
        System.out.println(function2.andThen(function1).apply(3)); //54
        //first function2 then function1 we can do this using compose also
        System.out.println(function1.compose(function2).apply(3));//54

        //Static method
        //whatever you give as input same will be return as output
        Function<String,String> identityFunction=Function.identity();
        System.out.println(identityFunction.apply("mohan"));

        //apply() method with Studnt object
        Function<List<Student>, List<Student>> StudentprfWithVip=li->{
            List<Student> result=new ArrayList<>();
            for(Student s:li){
                if(subString.apply(s.getName()).equalsIgnoreCase("VIP")){
                    result.add(s);
                }
            }
            return result;
        };

        Student s1=new Student(1, "mohan");
        Student s2=new Student(2, "Vipula");
        Student s3=new Student(3, "Vipramesh");
        List<Student> students= Arrays.asList(s1,s2,s3);
        List<Student> apply=StudentprfWithVip.apply(students);
        System.out.println(apply);
    }
    public static class Student{
        private int id;
        private String name;

        public Student(int id,String name) {
            this.id = id;
            this.name=name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }

        }
    }

