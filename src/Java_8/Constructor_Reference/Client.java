package Java_8.Constructor_Reference;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Client {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("Sanju","mohan","Lohith");
        List<Student> student=names.stream().map(x->new Student(x)).collect(Collectors.toList());
        System.out.println(student);
        //or
        List<Student> student1=names.stream().map(Student::new).collect(Collectors.toList());
        System.out.println(student1);
    }
}
