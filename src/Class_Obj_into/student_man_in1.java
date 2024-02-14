package Class_Obj_into;

public class student_man_in1 {
    public static class student {
        int age;
        int id;
        String name;
        String email;
        int psp;

        public void print_Student_details() {
            System.out.println(this.name);
            System.out.println(this.id);
            System.out.println(this.age);
            System.out.println(this.email);
            System.out.println(this.psp);
        }

        public void change_batch() {
            if (this.psp > 50 & this.psp < 70) {
                System.out.println(this.name + " is changing the batch");
            }
        }

        public void course_pause() {
            if (this.psp < 50) {
                System.out.println(this.name + " is pausing the course");
            }
        }

    }
    public static void main(String[] args) {
        Class_Obj_into.student s1=new Class_Obj_into.student();
        s1.name="mohan";
        s1.id=1;
        s1.age=25;
        s1.psp=84;
        s1.email="mohan@gmail.com";
        s1.print_Student_details();
        s1.course_pause();
        s1.change_batch();
        System.out.println();
        Class_Obj_into.student s2=new Class_Obj_into.student();
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

