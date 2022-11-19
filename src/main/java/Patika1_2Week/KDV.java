package Patika1_2Week;

import java.util.Scanner;

public class KDV {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter the total cost");
        int cost = scanner.nextInt();
        double kdv;
        if (cost<1000)
            kdv = cost*0.08;
        else
            kdv = cost*0.18;

        System.out.println("Without Patika1_2Week.KDV : "+cost);
        //ı want to show only 3 decimal part here
        System.out.println("Your Patika1_2Week.KDV is : "+String.format("%.3f", kdv));
        //this is the original result
        System.out.println(kdv);
        System.out.println("With Patika1_2Week.KDV total cost : "+String.format("%.3f",(cost+kdv)));
    }
}
