package Patika1_2Week;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MinAndMaxValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many number do you want to enter?");
        int count = scanner.nextInt();
        int[] numbers = new int[count];

        int a = 0;
        while (a<count){
            System.out.print("Enter a number "+(a+1)+" : ");
            int number = scanner.nextInt();
            numbers[a] = number;
            a++;
        }

        Arrays.sort(numbers);
        System.out.println("The biggest number is "+numbers[numbers.length-1]);
        System.out.println("The smallest number is "+numbers[0]);
        System.out.println("The second biggest number is "+numbers[numbers.length-2]);
        System.out.println("The second smallest number is "+numbers[1]);

        int smallestCompare = 0;
        int biggestCompare = 0;
        int addNumberForCompare = scanner.nextInt();
        for (var i=0; i<numbers.length; i++){
            if (numbers[i]<addNumberForCompare){
                smallestCompare = numbers[i];
            }
            else {
                biggestCompare = numbers[i];
            }
        }
        System.out.println("Biggest after "+addNumberForCompare+" is "+biggestCompare );
        System.out.println("Smallest after "+addNumberForCompare+" is "+smallestCompare);
    }
}
