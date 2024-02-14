package class_obj_into;

public class main {
    public static void main(String[] args) {
        student s1=new student();
        s1.name="mohan";
        s1.id=1;
        s1.age=25;
        s1.psp=84;
        s1.email="mohan@gmail.com";
        s1.print_Student_details();
        s1.course_pause();
        s1.change_batch();
        System.out.println();
        student s2=new student();
        s2.name="suhas";
        s2.id=2;
        s2.age=25;
        s2.psp=57;
        s2.email="suhas@gmail.com";
        s2.print_Student_details();
        s2.course_pause();
        s2.change_batch();
    }
}
