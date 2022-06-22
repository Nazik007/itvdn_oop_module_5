package itvdn_lists_4;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Numbers {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);

        ListIterator<Integer> integerList = numbers.listIterator();
        while (integerList.hasNext()){
            Integer integer = integerList.next();
            System.out.println(integer);
        }



    }
}
