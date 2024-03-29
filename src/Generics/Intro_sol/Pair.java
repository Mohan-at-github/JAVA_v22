package Generics.Intro_sol;

public class Pair<U,V>{
    U first;
    V second;
//here U & V may be any data type no matter
// eg (Integer, String) or (double, String) etc
    public Pair(U first, V second) {
        this.first = first;
        this.second = second;
    }

    public U getFirst() {
        return first;
    }

    public void setFirst(U first) {
        this.first = first;
    }

    public V getSecond() {
        return second;
    }

    public void setSecond(V second) {
        this.second = second;
    }
}
