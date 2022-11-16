import java.util.Scanner;

public class TekSayıToplamı {
    public static void main(String[] args) {
        int total = 0;
        String numbers = "";
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter a number: ");
            int number = scanner.nextInt();
            System.out.println();
            if (number%2 != 0){
                break;
            }
            else {
                if (number%4 == 0) {
                    total += number;
                    numbers+=number+" - ";
                }
            }
        }
        System.out.println("Numbers are : "+numbers.substring(0,numbers.length()-3));
        System.out.println("Total of number which can be divided by 4 is : "+total);
    }
}
