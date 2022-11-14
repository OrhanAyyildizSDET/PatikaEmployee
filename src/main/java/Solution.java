import java.io.*;
import java.util.*;

public class Solution {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        System.out.println("Please enter number of numbers");
        int n = scanner.nextInt();
        for (int i = 0; i < n;i++) {
            System.out.println("Please enter the number");
            long number = scanner.nextLong();
            if(number>-127&&number<128)
                System.out.println(number+" can be fitted in :"+
                        "\n* byte\n* short\n* int\n* long");
            else if(number<32767&&number>-32768)
                System.out.println(number+" can be fitted in :"+
                        "\n* short\n* int\n* long");
            else if(number<2147483647&&number>-2147483648)
                System.out.println(number+" can be fitted in :"+
                        "\n* int\n* long");
            else if(number<9223372036854775807L&&number>-9223372036854775808L)
                System.out.println(number+" can be fitted in :"+
                        "\n* long");
            else
                System.out.println(number+" can not be fitted anywhere");}

    }
}