package Constructor;
//A constructor in Java is a special method that is used to initialize objects.
// The constructor is called when an object of a class is created.
// It can be used to set initial values for object attributes
public class Default_demo {
    public static class student{
        int ID;
        String name;
        String email;
        float age;
        Boolean active;
        char PSP;
        public void printdetails()
        {

        }
    }

    public static void main(String[] args) {
        student s1=new student();
        System.out.println(s1.ID);
        System.out.println(s1.name);
        System.out.println(s1.email);
        System.out.println(s1.age);
        System.out.println(s1.active);
        System.out.println(s1.PSP);
    }
}
