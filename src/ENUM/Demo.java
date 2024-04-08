package ENUM;
enum status{ //enum contains named constants, instead of using strings or constants
    Running,
    Failed,
    Pending,
    Success;
}
public class Demo {
    public static void main(String[] args) {
        status s=status.Success;
        System.out.println(s);
    }
}
//we cannot extend enum class
//