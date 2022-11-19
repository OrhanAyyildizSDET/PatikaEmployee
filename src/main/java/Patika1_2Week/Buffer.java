package Patika1_2Week;

import java.io.*;
import java.util.*;

public class Buffer {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Patika1_2Week.Solution. */
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        for(var i = 1;i<c+1;i++){
            int result = a+b*1;
            for(var j = 1;j<i*2;j*=2) {
                result += b * j * 2;
            }
            System.out.println(result);
        }
    }
}