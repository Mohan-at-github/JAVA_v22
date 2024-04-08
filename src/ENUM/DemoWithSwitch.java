package ENUM;

public class DemoWithSwitch {
    public static void main(String[] args) {
        status s=status.Failed;
        switch(s){
            case Running:
                System.out.println("its all good");
                break;
            case Failed:
                System.out.println("not working");
                break;
            case Pending:
                System.out.println("uder progress");
                break;
            default:
                System.out.println("all done ");
                break;
        }
    }
}
