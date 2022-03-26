package Collections;

import java.security.Security;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayListNumAndStr {
    public static void main(String[] args) {

        //findValue(1);
       // findMax();
printValues();

    }

    public static Integer findMax() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(6);
        numbers.add(9);
        int max = -999;
        for (int i : numbers) {
            if (numbers.get(i) > max) {
                max = numbers.get(i);
            }
        }
        System.out.println("Max is " + max);

        return 0;
    }

    public static Integer findValue(int a) {
        List<Integer> number = new ArrayList<>();
        number.add(3);
        number.add(6);
        number.add(9);
        for (int i : number) {
            if (number.get(i) == a) {

            }
        }
        System.out.println("It contains value " + " " + a);
        return 0;
    }

    public static void printValues() {
        List<String> names = new ArrayList<>();
        names.add("Kloi");
        names.add("Meta");
        names.add("Metaverse");

        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).length() > 4) {
                System.out.println(names.get(i));
            }
        }

    }
}