package Builder_Design_pattern.Effective_way;

public class Clients {
    public static void main(String[] args) throws Exception {
        //git rid of two class and have a single class
        //I can be done suing inner class
        //student->outer class and Builder ->inner
        //1.Static class (static becz, when we create obj of inner class, only the constructor of inner class is called instead of both constructor)
        //2.create a static method in student, call this method as getbuilder which return object of builder to client we can get rid of new key word
        //Students.Builder sb= new Students.Builder();
        /*sb.setAge(20);
        sb.setName("mohan");
        sb.setEmail("mohan@gmail");
        sb.setPhone("1234567");
        Students s=new Students(sb);*/
        //even now client can know there is builder as inner class to get get rid from this we use chaining on intermediate steps (did in streams)
        //4. can be achived above chaining by changing setter return type from void to builder type
        //5. we will create build method inside Builder
        Students s=Students.getBuilder()
                .setAge(23)
                .setEmail("mohan@gmail")
                .setName("Mohan")
                .setPhone("123456")
                .build();

    }
}
