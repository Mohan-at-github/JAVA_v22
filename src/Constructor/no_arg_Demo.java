package Constructor;
public class no_arg_Demo {
    public static class student {
        int ID;
        String name;
        String email;
        float age;
        Boolean active;
        char PSP;
    public student() //this is no_arg_constructor which is used to set the default value during obj creation
        {
            this.ID=5;
            this.name="Mohan";
            this.email="mohan@gmail.com";
            this.age=10;
            this.active=false;
            this.PSP='H';
        }
        public void printdetails() {
        }
    }
    public static void main(String[] args) {
        no_arg_Demo.student s2=new no_arg_Demo.student();
        System.out.println(s2.ID);
        System.out.println(s2.name);
        System.out.println(s2.email);
        System.out.println(s2.age);
        System.out.println(s2.active);
        System.out.println(s2.PSP);
        s2.ID=01;
        System.out.println(s2.ID);
    }

}

