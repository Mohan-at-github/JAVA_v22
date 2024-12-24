package Java_8.Method_reference;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;

public class Client {
    //Static method reference
    public static void print(String string){
        System.out.println(string);
    }
    //Non-Static method reference
    private void print1(String s){
        System.out.println(s);
    }
    public static void main(String[] args) {
        List<String> student= Arrays.asList("Mohan","Suhas", "Lohith");
        student.forEach(x-> System.out.println(x));
        System.out.println("Method references");
        student.forEach(Client::print);
        System.out.println();
        //non-Static
        System.out.println("non_static");
        Client client=new Client();
        student.forEach(client::print1);



    }
}
