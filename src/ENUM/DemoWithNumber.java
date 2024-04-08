package ENUM;

public class DemoWithNumber {
    public static void main(String[] args) {
        status S=status.Success;
        System.out.println(S.ordinal()); //prints the number, in java enum numbering starts from 0
        status[] ss=status.values(); //array of all status
        for(status s: ss){
            System.out.println(s+" "+s.ordinal());
        }

    }
}
