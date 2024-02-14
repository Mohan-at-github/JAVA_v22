package Class_Obj_into;
import Access_Modifiers.package_01.car;

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

        //access modifiers demo for public in different package
        car c3=new car();
        //c3.car_id=10; //private attribute is not accessible outside the class
        //c3.car_colour="black"; //default attribute is not accessible outside the package
        //c3.car_model="High_Rider"; //protected attribute is not accessible outside the package
        c3.power_transmission="Gear";
        c3.car_details_display();
        //c3.car_colour(); //protected method not accessible outside the package
        //c3.car_types(); //private method not accessible outside the class
        //c3.car_ids(); //default method not accessible outside the package

    }
}
