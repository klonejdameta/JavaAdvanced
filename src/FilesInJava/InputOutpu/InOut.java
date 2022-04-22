package FilesInJava.InputOutpu;

import java.io.*;
import java.util.Scanner;

public class InOut {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Shkruani fjaline: ");
        String s = scanner.nextLine();
        try {
            FileWriter out = new FileWriter("string.txt");
            out.append(s);
            out.flush();
            out.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        System.out.println("Fjalia u ruajt me sukses");
    }
}
