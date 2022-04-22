package ArrayListAndHashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayToMap {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(30);
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(1);
        list.add(1);
        list.add(4);
        list.add(1);
        list.add(2);
        list.add(6);
        list.add(1);
        list.add(2);
        list.add(6);
        list.add(1);
        list.add(2);
        list.add(9);
        list.add(1);
        list.add(3);
        list.add(10);
        list.add(1);
        list.add(3);
        list.add(1);
        System.out.println("List elements are " + list);

        Map<Integer, Integer> map = new HashMap<>();
        for (Integer i : list) {
            if (map.containsKey(i)) {
                int value = map.get(i);
                value += 1;
                map.put(i, value);
            } else {
                map.put(i, 0);//shtojme ne fillim vlerat sepse Map eshte bosh
            }
        }

        System.out.println(map);
    }
}
//na del nje vlere me pak sepse numrin qe kemi e mbajme edhe do gjejme vetem sa here te tjera perseritet
//Integer ka value null ndersa int ka 0