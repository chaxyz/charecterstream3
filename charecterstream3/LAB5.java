package charecterstream3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LAB5 {
    public static void main(String[] args) {
        // read data from keyboard
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(in);
        
        try {
            System.out.print("Enter text : ");
            String s = input.readLine();
            System.out.println(s);
            System.out.print("Enter age : ");
            String age = input.readLine();
            System.out.println(age);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
