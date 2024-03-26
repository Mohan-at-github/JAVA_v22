package CallableDemo;

import java.util.Random;
import java.util.concurrent.Callable;

public class RandomNumberGenerator implements Callable {
    @Override
    public Integer call() throws Exception {
        Random random = new Random();
        System.out.println("I am in a new thread");
        return random.nextInt();
    }
}
