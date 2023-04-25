package charecterstream3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharrecterStream3{
    public static void main(String[] args) {
        try {
            FileWriter file = new FileWriter("data.txt");
            BufferedWriter output = new BufferedWriter(file);
            output.write("Hello world");
            output.write("Welcome to java");
            output.close();
        } catch (IOException e) {
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