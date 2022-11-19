package Patika1_2Week;

import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number : ");
        int number = scanner.nextInt();
        System.out.println("Please enter the power : ");
        int power = scanner.nextInt();
        int a = 1;
        int b = 0;
        while (b<power+1){
            System.out.println(number+" sayısının "+b+" . kuvveti = "+a);
            a *= number;
            b++;
        }
        System.out.println("=================================================");
        int c = 1;
        for (var i=0; i<power+1; i++){
            System.out.println(number+" sayısının "+i+" . kuvveti = "+c);
            c *= number;
        }
    }
}
