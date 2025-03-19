package Collections.Map;

import java.lang.ref.WeakReference;

public class GC {
    public static void main(String[] args) {
        Phone phone = new Phone("Iphone", "16 Pro Max");//phone obj created in heap and its a strong reference
        System.out.println(phone);
        phone=null; //we are making phone reference Null
        System.out.println(phone);
        // now phone obj in the heap is not used anymore
        // so need to remove this unused object
        //now JVM will destroy this heap memory which was not used

        //weak Reference, if are not using this obj then JVM will automatically do GC no need to make its reference null
        WeakReference<Phone> phoneWeakReference=new WeakReference<>(new Phone("Nokia","Basic"));
        System.out.println(phoneWeakReference.get());
        System.gc();
        try{
            Thread.sleep(10000);
        }catch (Exception ignored){

        }
        System.out.println(phoneWeakReference.get());
    }
}
    class Phone{
        String brand;
        String Model;

        public Phone(String brand, String model) {
            this.brand = brand;
            Model = model;
        }

        @Override
        public String toString() {
            return "Phone{" +
                    "brand='" + brand + '\'' +
                    ", Model='" + Model + '\'' +
                    '}';
        }
    }

