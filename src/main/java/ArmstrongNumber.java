import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();
        int basamak = number.length();
        int number01 = Integer.valueOf(number);

//        here ı write codes which shows the armstrong number or not
        int total = 0;
        for (var i = number01 ; i >0; ) {
            int mod = i % 10;
//            here ı used math library and power
            total += Math.pow(mod,basamak);
            System.out.println(total);
            i=i/10;
        }
        System.out.println(total == number01 ? "ArmstrongNumber": "is not ArmstrongNumber");

//here ı typed codes which show the digits and total digits
        List<Integer> list = new ArrayList<>();
        for (var i = number01 ; i>0;){
            int mod = i % 10;
            list.add(mod);
            i = i/10;
        }
//first ı create list and put my digits into it with the help of the mod
        System.out.println("Your numbers digits total is : ");
        int total01 = 0;
//        then ı used for loop which starts from the end for number order
        for (var i = list.size()-1 ; i >=0;i--){
            if (i != 0){
                System.out.print(list.get(i)+" + ");
            }
            else {
                System.out.print(list.get(i)+" = ");
            }
            total01 += list.get(i);
        }
        System.out.println(total01);
    }
}