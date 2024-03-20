package Inheritance.attributes_Demo;

public class attribute_Inherit_Demo {
    public static class father{
        int paisa=20;
        String surname="raj"; //by default parent attribute is inherited

    }

    public static class child extends father{
        int paisa=30; //overriding parent's attribute
        public void print(){
            System.out.println(super.paisa); //getting parent attribute even if its is present is child
        }
        int psp=60;
    }

    public static void main(String[] args) {
        child baby1=new child();
        child baby2=new child();
        System.out.println(baby1.paisa); //30 baby1 is inheriting father paisa
        baby2.print();
        System.out.println(baby2); //Inheritance.example$child@3feba861 baby2 is child of father but yet to inherit father's property
        System.out.println(baby2.surname); //raj baby2 is inheriting father surname
        father f1=new father();
        //System.out.println(f1.psp); //psp attribute belongs to child class, so parent class cannot access
    }
}
