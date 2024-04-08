package Lambdas.Diff_way_Impl;

public class Main {
    public static void main(String[] args) {
        noArgInterface obj=() -> System.out.println("Hii I dont need any argument so no curly bracket");
        obj.noarg();
        obj.print();
        noArgInterface.show();

        ArgInterface obj1= x -> System.out.println(x+2 +" and Even I dont want curly bracket");
        obj1.print(5);

        withCurlyBracket obj2= (x,y) -> { //use curly brackets when you have more than one statement.
          int z=x+y;
            return z;
        };

        /*
        or
        withCurlyBracket obj2= (x,y) ->x+y;
         */
        System.out.println(obj2.print(2,3));
    }
}
