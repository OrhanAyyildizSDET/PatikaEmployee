import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LoopAritmetic {
    public static void main(String[] args) {
        Scanner scanner =   new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = scanner.nextInt();
        int total = 0;
        int flag = 0;
        List<Integer> numbers = new ArrayList<>();
//Here ı accumulate the numbers without looking positive or negatice
        if(number>0){
            for (int i = 1; i < number; i++) {
                if (i%3 == 0 && i%4 == 0) {
                    total += i;
                    flag++;
                    numbers.add(i);
                }
            }
        }
        else{
            for (int i = number;i<0; i++) {
                if (i%3 == 0 && i%4 == 0) {
                    total += i;
                    flag++;
                    numbers.add(i);
                }
            }
        }
        System.out.println("The number which can be divided by 3 and 4 are : " + numbers);
        System.out.println("The average of numbers which divide by 3 and 4 is : " + total/flag);
    }
}
