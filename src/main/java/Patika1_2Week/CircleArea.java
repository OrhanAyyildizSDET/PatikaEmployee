package Patika1_2Week;

import java.util.Scanner;

public class CircleArea {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter your r for circle");
        int r = scanner.nextInt();
        System.out.println("Please enter the degree");
        double a = scanner.nextDouble();
        //if user enters invalid degree it asks the user for entering new degree until it will be valid
        if (a<0 || a>360)
            while (true){
                System.out.println("Please enter valid degree");
                double b = scanner.nextDouble();
                if (b>0 || b<361)
                    a = b;
                    break;
            }
        double pi = 3.14;
        int rsquare = r*r;
        double circleArea = rsquare*a*pi/360;
        System.out.println("Circle area is :" + circleArea);
    }
}
