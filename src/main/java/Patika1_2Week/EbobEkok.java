package Patika1_2Week;

import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number01 : ");
        int a = scanner.nextInt();
        System.out.print("Please enter the number02 : ");
        int b = scanner.nextInt();

        int c = 1;
        int ebob = 0;
//ı used MAth.min for limitation
        while (c<(Math.min(a, b))){
//            if a and b mod c is equal the 0 ı equal the c to  new value and increase c
            if (a%c == 0 && b%c == 0){
                ebob = c;
            }
            c++;
        }
//here ı used the formula
        int ekok = a*b/ebob;

        System.out.println("The ebob of "+a+" and "+b+" is "+ebob+" and ekok is "+ekok);

    }
}
