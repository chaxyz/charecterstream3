package charecterstream3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LAB1 {
    public static void main(String[] args) {
        try {
            FileWriter output = new FileWriter("data.txt");
            output.write("Hello world");
            output.write("Welcome to java");
            output.close();
        }

        catch (IOException ex) {
            System.out.println("");
        }
        try {
            FileReader input = new FileReader("data.txt");
            int ch;
            while ((ch = input.read()) != -1) {
                System.out.println((char) ch);
            }

        } catch (FileNotFoundException r) {
            System.out.println("v");
        } catch (IOException ex) {
            System.out.println("");

        }
    }
}