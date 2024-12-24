package Java_8.Supplier;

import java.util.function.Supplier;

public class Client {
    public static void main(String[] args) {
        Supplier<Integer> supplier=()->1;
        System.out.println(supplier.get());
    }
}
