package Patika1_2Week;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KümeKombinasyonu {
    /*C(n,r) = n! / (r! * (n-r)!)*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        List<Integer> numbers01 = new ArrayList<>();
        System.out.println("Please enter the limit for sets 1");
        int limit = scanner.nextInt();
        System.out.println("Please enter the limit for sets 2");
        int limit01 = scanner.nextInt();

        int factoriyel = 1;
        int factoriyel01 = 1;
        int limit_limit01_factoriyel = 1;

        for (var i = 1; i < limit+1 ; i++) {
            factoriyel*=i;
        }
        for (var i = 1; i < limit01+1 ; i++) {
            factoriyel01*=i;
        }

        for (var i = 1; i < (limit-limit01>0?limit-limit01:limit01-limit)+1 ; i++) {
            limit_limit01_factoriyel*=i;
        }

        int combination = factoriyel/(factoriyel01*limit_limit01_factoriyel);
        System.out.println("Combination: " + combination);

//        for (var i = 0; i < limit; i++) {
//            Scanner scanner01 = new Scanner(System.in);
//            System.out.println("Please enter the numbers for sets 1");
//            int number = scanner01.nextInt();
//            numbers.add(number);
//        }
//
//        for (var i = 0; i < limit; i++) {
//            Scanner scanner01 = new Scanner(System.in);
//            System.out.println("Please enter the numbers for sets 2");
//            int number = scanner01.nextInt();
//            numbers01.add(number);
//        }


    }
}
