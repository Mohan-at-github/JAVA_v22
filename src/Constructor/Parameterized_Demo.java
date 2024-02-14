package Constructor;

public class Parameterized_Demo {
    public static class student{
        int ID;
        String name;
        String email;
        float age;
        Boolean active;
        char PSP;
        public student(int ID,String name,String email,int age,Boolean active,char psp)
        {
            this.ID=ID;
            this.name=name;
            this.email=email;
            this.age=age;
            this.active=active;
            this.PSP=psp;
        }
        public student(int ID,String name,int age,Boolean active)
        {
            this.ID=ID;
            this.name=name;
            this.age=age;
            this.active=active;
        }
        public void printdetails()
        {

        }
    }

    public static void main(String[] args) {
        Parameterized_Demo.student s1=new Parameterized_Demo.student(2,"suhas","suhas@gmail.com",24,false,'L');
        System.out.println(s1.ID);
        System.out.println(s1.name);
        System.out.println(s1.email);
        System.out.println(s1.age);
        System.out.println(s1.active);
        System.out.println(s1.PSP);
        System.out.println();
        Parameterized_Demo.student s2=new Parameterized_Demo.student(3,"lohith",24,false);
        System.out.println(s2.ID);
        System.out.println(s2.name);
        System.out.println(s2.email);
        System.out.println(s2.age);
        System.out.println(s2.active);
        System.out.println(s2.PSP);
    }
}
