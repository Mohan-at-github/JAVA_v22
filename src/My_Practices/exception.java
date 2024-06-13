package My_Practices;

public class exception {
    public static void main(String[] args) {
        try{
            int[] a={};
            System.out.println(a[0]);
        }
        catch(Exception e)
        {
            System.out.println("your array is empty");
        }
        System.out.println("hello world");
    }
}
