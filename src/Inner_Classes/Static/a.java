package Inner_Classes.Static;

public abstract class a { //outer class can't be static it can be abstracted, final, public.
    public void print(){
        System.out.println("Hii I am from A");
    }
    public static class b{ //inner class can be static
        public void print(){
            System.out.println("Hii I am from B");
        }
    }
}
