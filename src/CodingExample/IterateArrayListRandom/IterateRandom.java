package CodingExample.IterateArrayListRandom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IterateRandom {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(5);
        num.add(6);
        num.add(3);
        num.add(3);
        System.out.println("Values in order as inputed " + num);

        Collections.shuffle(num);
        System.out.println("Ranodm numbers are " + num);

    }
}
