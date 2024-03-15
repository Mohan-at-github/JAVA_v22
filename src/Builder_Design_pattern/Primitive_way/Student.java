package Builder_Design_pattern.Primitive_way;

import Builder_Design_pattern.Primitive_way.Builder;

public class Student {
    String name;
    String email;
    String phone;
    int age;
public Student(Builder builder) throws Exception {
    if(builder.age<18)
    {
        throw new Exception("Age cannot be <18");
    }
    this.age= builder.age;
    this.name= builder.name;
    this.email= builder.email;
    this.phone= builder.phone;
}
}
