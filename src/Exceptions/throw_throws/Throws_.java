package Exceptions.throw_throws;

public class Throws_ {
    public static void division(int dividend, int divisor) throws ArithmeticException {
        double answer = dividend/divisor;
        System.out.println(answer);
    }
    public static void main(String[] args) {
        division(5, 0);

    }
}
