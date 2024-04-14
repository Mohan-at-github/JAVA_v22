package Static;

public class PrintdoubleQoute {
    public static void main(String[] args) {
        System.out.println("\"hello world\"");
        System.out.println("\" \" hello world \" \"");

        int x=5;
        double y=4;
        int z=x+(int)y; //high to low (explicit casting) -> double to int
        double ans=x+y;//low to high java does for us(implicit casting) -> int to double
    }
}
