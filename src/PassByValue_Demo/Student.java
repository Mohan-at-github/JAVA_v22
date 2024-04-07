package PassByValue_Demo;
//java is pass by reference
// primitive : java copies the value shares to other
// object : java copies the reference(heap address) of the object and shares to other
// even though in object its copying reference
// but that reference is also a value so java is considered as pass by value
public class Student {
    String name;
    int id;
    float marks;
    public static void main(String[] args) {
        //pass by value for primitive data type
        int a=100; //4 bytes of memory is allocated in stack in the name of a(variable).
        // memory is filled with value 100.
        System.out.println("a : "+ a);
        int b;  //4 bytes of memory is allocated in stack in the name of b(variable).
        b=a;//  copy of value(100) present in a variable is shared to b.
        System.out.println("b : "+ b);
        b=200; // value present in the b named memory is changed from 100 to 200.
        // this will not affect in a.
        System.out.println("b : "+ b);

        //pass by reference demo
        Student s1=new Student();
        //s1 is present is stack which has the reference(address) of student object which is present in heap.
        s1.name="Mohan";
        s1.id=1;
        s1.marks=18.2f;
        System.out.println(s1);//output Student@9807454
        System.out.println(s1.name);
        System.out.println(s1.id);
        System.out.println(s1.marks);

        Student s2; //just a memory is allocated in stack with name s2
        s2=s1;//here value present in s1 memory is copied to s2
        //still both s1 and s2 have value(which is address of same object present in heap)
        System.out.println(s2);//Student@9807454

        s2.name="Lohith";
        s2.marks=25f;
        s2.id=2;
        System.out.println("hey I am s2");
        System.out.println(s2.name);
        System.out.println(s2.id);
        System.out.println(s2.marks);

        System.out.println("hey I am s1");
        System.out.println(s1.name);
        System.out.println(s1.id);
        System.out.println(s1.marks);

        //due to changes made in s2 it will affect s1 also because we are sharing reference of object not copy of object

    }


}
