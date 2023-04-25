package charecterstream3;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LAB4 {
   public static void main(String[] args) {
    try {
        FileReader file = new FileReader("data.txt");
        Scanner input = new Scanner(file);// อ่านบรรทัดที่ 1 ที่เป็น string
        String name = input.nextLine();
        System.out.println(name); 
        System.out.println(input.nextLine());
        System.out.println(input.nextLine());
        int age = input.nextInt();
        System.out.println(age); // อ่านบรรทัดที่ 4 ที่เป็น int
        double weight = input.nextDouble();
        System.out.println(weight);
        double height = input.nextDouble(); 
        System.out.println(height); 
    } catch (FileNotFoundException r) {
        System.out.println("v");
    } catch (IOException ex) {
        System.out.println("");

}
   }
    
}
