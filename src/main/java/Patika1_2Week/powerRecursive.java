package Patika1_2Week;

import java.util.Scanner;

public class powerRecursive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("Please enter the number  ");
            int a = scanner.nextInt();
            System.out.print("Please enter the power  ");
            int b = scanner.nextInt();
            int result = 1;
            System.out.println(a+" power "+b+" is "+power(a,b,result));

            System.out.println("Do you want to continue with new values?  (yes)  (no)");
            String value = scanner.next().trim().toLowerCase();
            if(!value.equals("yes")){
                break;
            }
        }

    }
    static int power(int a, int b,int result) {
        if (b == 0){
                return result;
            }
        else {
            result *= a;
            return power(a,b-1,result);
        }

    }
}
