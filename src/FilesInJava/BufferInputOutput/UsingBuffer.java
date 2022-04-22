package FilesInJava.BufferInputOutput;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UsingBuffer {
    public static void main(String[] args) {
        try{
            List<String> rreshtat = new ArrayList<>();
            BufferedReader reader = new BufferedReader(new FileReader("informacion.txt"));
            String line = reader.readLine();

            //derisa rreshti qe ne lexojme do jete e ndryshme nga null
            // do runnojme cilklin while
            while(line != null){
                rreshtat.add(line);
                System.out.println("Rreshti " + rreshtat.size()
                        +" tek file informacion eshte :  " + line);
                line = reader.readLine();
            }

            String maxLength = gjejMAxLengthTeArray(rreshtat);
            System.out.println("String me gjatesine me te madhe eshte: ");
            System.out.println(gjejMAxLengthTeArray(rreshtat));
            gjejMAxTeFjales(maxLength);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void gjejMAxTeFjales(String maxLength) {
        String fjalet[] = maxLength.split(" ");
        System.out.println("Fjale eshte : " +gjejMAxLengthTeArray(Arrays.asList(fjalet)));

    }

    private static String gjejMAxLengthTeArray(List<String> rreshtat) {
        Integer max = rreshtat.get(0).length();
        int poz = 0;
        for(int i = 1; i < rreshtat.size(); i++){

            if(max < rreshtat.get(i).length()){
                max = rreshtat.get(i).length();
                poz = i;
            }
        }

        return rreshtat.get(poz);
    }

}
