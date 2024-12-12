package Java_8.Comparator;

import java.util.Comparator;

public class ComparatorImpl implements Comparator<Integer> {

    @Override
    public int compare(Integer a, Integer b) {
        //return a-b; ASC
        return b-a; //DESC
    }
}
