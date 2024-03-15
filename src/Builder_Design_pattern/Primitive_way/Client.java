package Builder_Design_pattern.Primitive_way;

public class Client {
    public static void main(String[] args) throws Exception {
        Builder builder=new Builder();
        builder.setAge(20);
        builder.setEmail("mohan@gmail.com");
        builder.setName("mohan");
        builder.setPhone("7899359948");
        Student s=new Student(builder);
        System.out.println("DEBUG");
    }
}
