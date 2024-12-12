package Abstract;

public class Main {
    public static abstract class car{ //abstract class
        public abstract void Drive(); //abstract method :only method declaration
        public void Music(){ //concrete method: method declaration and definition
            System.out.println("playing music");
        }
    }
    public static class BMW extends car{ //concrete class: must implement abstract method or else this also becomes an abstract class

        @Override
        public void Drive() { //defining car's abstract method
            System.out.println("BMW driving...");
        }
    }

    public static void main(String[] args) {
        BMW obj = new BMW();
        obj.Drive();
        obj.Music();

    }
}
