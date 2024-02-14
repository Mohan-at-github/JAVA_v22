package Class_Obj_into;

public class student {
    int age;
    int id;
    String name;
    String email;
    int psp;
    public void print_Student_details()
    {
        System.out.println(this.name);
        System.out.println(this.id);
        System.out.println(this.age);
        System.out.println(this.email);
        System.out.println(this.psp);
    }

    public void change_batch()
    {
        if(this.psp>50 & this.psp<70)
        {
            System.out.println(this.name+" is changing the batch" );
        }
    }

    public void course_pause()
    {
        if(this.psp<50)
        {
            System.out.println(this.name+" is pausing the course" );
        }
    }

}
