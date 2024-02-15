package Constructor;

public class copy_demo {
    public static class student{
        int id;
        String name;
        String email;
        int psp;
        public student(int ID,String NAME,String EMAIL,int PSP) //parameterized constructor
        {
            id=ID;
            name=NAME;
            email=EMAIL;
            psp=PSP;
        }
        public student(student ref) //copy constructor
        {
            id=ref.id;
            name=ref.name;
            email=ref.email;
            psp=ref.psp;
        }
        public void printDetails(){
            System.out.println(this.id);
            System.out.println(this.name);
            System.out.println(this.email);
            System.out.println(this.psp);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        student s1=new student(01,"Mohan","mohan@gmail.com",80);
        student s2=s1; //shallow copy s1 ans s2 have same address of heap
        student s3=new student(s1); //deep copy by new key word a new memory is created for s3 in heap and its independent from s1 ans s2.
        s1.printDetails();
        s2.printDetails();
        s3.printDetails();
        s1.id=2; //s1 and s2 referring same obj in heap
        s2.id=3;
        s3.id=4; //separate obj in heap
        s1.printDetails();
        s2.printDetails();
        s3.printDetails();

    }
}
