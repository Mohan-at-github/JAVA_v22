package Java_8.Comparator.Custom_Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Student st1=new Student(1, "Mohan");
        Student st2=new Student(2, "Lohith");
        Student st3=new Student(3, "Suhas");
        List<Student> list=new ArrayList<>();
        list.add(st1);
        list.add(st2);
        list.add(st3);

        //ID
        //DESC
        Collections.sort(list,(a,b)->b.id-a.id);
        System.out.println(list);
        //ASC
        list.sort((a, b) -> a.id - b.id);
        System.out.println(list);

        //NAME
        //ASC
        list.sort(Comparator.comparing(Student::getName));
        System.out.println(list);
        //DESC
        list.sort(Comparator.comparing(Student::getName).reversed());
        System.out.println(list);
    }
}
