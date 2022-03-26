package HashMapExample;

import java.util.Map;
import java.util.Scanner;

public class HashMap {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Map<Integer, String> values = new java.util.HashMap<>();
        System.out.println("Please input a key and a value");

            values.put(scanner.nextInt(), scanner.nextLine());
            values.put(scanner.nextInt(), scanner.nextLine());
            values.put(scanner.nextInt(), scanner.nextLine());

        System.out.println("Please input a key");
     Integer nr =  scanner.nextInt();

            if (values.containsKey(nr)){ //nuk ka nevoje per cikel for e ben vete bredhjen,sepse ruajme tipe te ndryshme value dhe key
                System.out.println("EUREKA");

            }
            else {
                System.out.println("Protik");
            }
            }
        }


