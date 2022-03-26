package GetKeyValueFromUserMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GetKey {
    public static void main(String[] args) {
        Map<Integer,String>  val = new HashMap<>();
        Scanner scanner=new Scanner(System.in);

        val.put(1,"Val1");
        val.put(2,"Val2");
        val.put(3,"Val3");
        System.out.println("Pleas input a key to get value ");
                scanner.nextInt();
        System.out.println("Value of inputet key is "+val.get(scanner.nextInt()));
        boolean key=val.containsKey(scanner.nextInt());

        if (key){
            System.out.println("Value is " + val.get(scanner.nextInt()));
        }else{
            System.out.println("Key does not exist ");
        }
    }
}
