package Access_Modifiers.package_01;

public class Main {
    public static void main(String[] args) {
        car c1=new car();
        //c1.car_id=10; //private attribute is not accessible outside the class
        c1.car_colour="white";
        c1.car_model="XUV_700_L1";
        c1.power_transmission="Auto";
        c1.car_details_display();
        c1.car_colour();
        //c1.car_types(); //private method not accessible outside the class
        c1.car_ids();
    }
}
