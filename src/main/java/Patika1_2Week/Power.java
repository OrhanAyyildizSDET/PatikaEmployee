package Patika1_2Week;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the last number for the limit");
        int limit = scanner.nextInt();
        int pwrOf4 = 1;
        int pwrOf5 = 1;
//        ı printed 0 power of numbers here
        System.out.println("The 0 power of 4 is "+pwrOf4);
        System.out.println("The 0 power of 5 is "+pwrOf5);
//        then ı instantiate the flag for the write power number
        int flag = 1;

        for (int i = 1; i < limit; i++) {
            for (int j = 1; j < i+1; j++) {
                if (pwrOf5*5<limit) {
                    pwrOf5 *= 5;
                    pwrOf4 *= 4;
                }else if (pwrOf4*4<limit){
                    pwrOf4 *= 4;
                }
                else {
                    break;
                }
//                all the conditions are met and in the end ı write my powered number
                System.out.println("The "+flag+" power of 4  is "+pwrOf4);
                System.out.println("The "+flag+" power of 5 is "+pwrOf5);
                flag++;
            }
        }
    }
}
