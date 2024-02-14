package Access_Modifiers.package_01;

public class car {
    private int car_id; //private attribute
    String car_colour;//default attribute
    protected static String car_model="L"; //protected attribute
    public String power_transmission; //public attribute

   private void car_types() //private method
    {
            System.out.println(this.car_model+" is "+this.power_transmission);
    }
    void car_ids() //default method
    {
        System.out.println("ID of thee car is "+this.car_id);
    }
    protected void car_colour() //protected method
    {
        System.out.println("colour of the car is "+this.car_colour);
    }

    public void car_details_display() //public method
    {
        System.out.println(this.car_colour);
        System.out.println(this.car_id);
        System.out.println(this.car_model);
        System.out.println(this.power_transmission);
    }
}
