package Patika1_2Week;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number for harmonic result");
        double number = scanner.nextDouble();
        int a = 1;
        double total = 0;
        for (double i = 1; i < number+1; i++) {
            if (i<number){
                System.out.print(String.format("%.3f",a/i)+" + ");
                total += a/i;
            }else {
                System.out.print(String.format("%.3f",a/i)+" = ");
                total += a/i;
            }
        }
        System.out.println(String.format("%.3f",total));
    }
}
