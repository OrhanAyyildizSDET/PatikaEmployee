import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int j = 2;
        prime(number,j);
    }
    public static void prime(int number,int j) {
        if (number != j){
            if (number%j != 0){
                j++;
                prime(number,j);
            }else {
                System.out.println(number+" is not a prime number");
            }
        }
        else {
            System.out.println(number+" is a prime number");
        }
    }
}
