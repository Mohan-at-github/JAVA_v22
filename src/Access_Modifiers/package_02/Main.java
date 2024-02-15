package Access_Modifiers.package_02;
import Access_Modifiers.package_01.car;

public class Main extends car {
    public static void main(String[] args) {
        car c2 = new car();
        //c1.car_id=10; //private attribute is not accessible outside the class
        //c2.car_colour = "white"; //default attribute is not accessible outside the package
        c2.car_model = "XUV_700_L1"; //protected attribute is accessible outside the package but only in its child class
        c2.power_transmission = "Auto";
        System.out.println(car_model); //after making it car_model static its working
        //c1.car_types(); //private method not accessible outside the class
       // c1.car_ids(); //default method is accessible only within the package

         // c2.car_colour(); //protected method is accessible because main class inherited the car class

        c2.car_details_display(); //public method
    }
}
