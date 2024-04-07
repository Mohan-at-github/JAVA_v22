package ComparatorAndComparable;

import java.util.Arrays;
import java.util.Comparator;

class employee implements Comparable<employee> {
    int id;
    String name;

    public employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(employee o) {
        return this.id-o.id;
       // if current employee id(this.id) is = o.id parameter of compareTo method returns 0
        // if current employee id(this.id) is > o.id parameter of compareTo method returns +
        // if current employee id(this.id) is > o.id parameter of compareTo method returns -

    }
}
public class Intro {

    public static void main(String[] args) {
        int[] arr={10, 3, 20, 17, 4};
        System.out.println(arr);//output : [I@12edcd21 // it prints the address
        // because all these values are stored in heap and that address is shared to arr
        System.out.println("before sorting: "+Arrays.toString(arr)); // to print our array we need to convert that in to string

        // lets sort our primitive type array
        Arrays.sort(arr);
        System.out.println("After sorting: "+Arrays.toString(arr));

        //lets sort custom objects
        employee[] empArr=new employee[5];
        empArr[0]=new employee(1,"mohan");
        empArr[1]=new employee(2, "suhas");
        empArr[2]=new employee(3, "lohith");
        empArr[3]=new employee(4, "raju");
        empArr[4]=new employee(5, "shashu");
        System.out.println("before sorting: "+Arrays.toString(empArr));
        Arrays.sort(empArr);
        for(employee e:empArr){
            System.out.println("After sorting: "+e.toString());
        }

        //run time error
        //Exception in thread "main" java.lang.ClassCastException
        //so we cannot sort our custom object using Arrays.sort method
        //we can solve this using comparable and comparator interfaces.
    }
}
