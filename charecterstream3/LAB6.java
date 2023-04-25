package charecterstream3;

import java.util.Scanner;

public class LAB6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        System.out.println(scanner.nextLine());
        System.out.print("Enter age: ");
        System.out.println(scanner.nextInt());
        System.out.print("Enter hright: ");
        System.out.println(scanner.nextDouble());
    }
}