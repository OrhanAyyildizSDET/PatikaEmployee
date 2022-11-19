package Patika1_2Week;

import java.util.Scanner;

public class Hipotenüs {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter the first line of triangular");
        int a = scanner.nextInt();
        System.out.println("Please enter the second line of triangular");
        int b = scanner.nextInt();
        double c = Math.sqrt(a * a + b * b);
        System.out.println("Hypotenuse is : "+String.format("%.3f",c));
    }
}
