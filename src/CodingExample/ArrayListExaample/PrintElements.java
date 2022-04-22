package CodingExample.ArrayListExaample;

import java.util.*;

public class PrintElements {

    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(1);
        num.add(5);
        num.add(1);
        num.add(1);
        num.add(3);

        Map<Integer, Integer> map = new HashMap<>();
        for (Integer i : num) {
            if (map.containsKey(i)) {
                int value = map.get(i);
                value += 1;
                map.put(i, value);
            } else {
                map.put(i, 0); //fusim elementet e listes ne Map,elementet si key dhe frekuencen si value
            }
        }
        System.out.println(map);
    }
}
//frequency of elements