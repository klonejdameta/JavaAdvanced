package IteratingArrayList;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListIteratind {
    public static void main(String[] args) {

        List<String> value = Arrays.asList("Kloi", "Dhimbo", "SweetHearts");

       /* //iterating the ArrayList with a simple for loop

        for (int i = 0; i < value.size(); i++) {
            //System.out.println(value.get(i));
        }

        //using for each

        for (String x : value) {

        }*/
           //using Iterator class
        for (Iterator<String> iterator = value.iterator(); iterator.hasNext(););

    }
}
