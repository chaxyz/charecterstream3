package charecterstream3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class LAB3 {
    public static void main(String[] args) {
        try {
            PrintWriter outout = new PrintWriter("data.txt");
            outout.println("Harry Potter");
            outout.println(19);
            outout.println(60.5);
            outout.println(175.0);
            outout.close();

        } catch (FileNotFoundException e) {
            
            e.printStackTrace();
        }
        try {
            FileReader file = new FileReader("data.txt");
            BufferedReader input = new BufferedReader(file);
            String string;
            while((string =input.readLine())!= null){
                System.out.println(string);
            }

        } catch (FileNotFoundException r) {
            System.out.println("v");
        } catch (IOException ex) {
            System.out.println("");

        }
    }
}
