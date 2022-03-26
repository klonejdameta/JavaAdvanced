package MapExample;

import java.util.HashMap;
import java.util.Map;

public class MapExp {
    public static void main(String[] args) {

        Map<String, Integer> student = new HashMap<>();
        student.put("Kloi",24);
        student.put("Klo",2);
        student.put("Koi",4);
        student.put("Kloim",23);
        student.put("Kloik",20);
        for (Map.Entry<String, Integer> pairs : student.entrySet()){
            System.out.println(pairs);

        }


    }
}