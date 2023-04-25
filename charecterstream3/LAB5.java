package charecterstream3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LAB5 {
    public static void main(String[] args) {
        // read data from keyboard
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(in);
        System.out.print("Enter text : ");
        try {
            String s = input.readLine();
            System.out.println(s);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
