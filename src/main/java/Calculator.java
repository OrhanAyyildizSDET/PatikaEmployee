import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Which math operation do you want? \n" +
                    "1.Multiply 2.Subtract 3.Divide 4.Addition   please write the number");
            int choice = scanner.nextInt();
            System.out.println("Please enter the first number");
            int number1 = scanner.nextInt();
            System.out.println("Please enter the second number");
            int number2 = scanner.nextInt();
//            I call the method and put the method result into result container
            double result = calculator(number1, number2,choice);
            System.out.println(result);
            Scanner scanner01 = new Scanner(System.in);
            System.out.println("Do you want to continue?  (yes) (no) please write the answer");

//            we need new scanner or we need to go to the next line with scanner.nextLine();
            String answer = scanner01.nextLine().toLowerCase();
//            I used while loop for continuous movement of calculator and if user enter 'NO or No or no' (it doesnt matter) it breaks the loop
            if (answer.equals("no")){
                break;
            }
        }

    }
    public static double calculator(int x, int y,int choice) {
        int result = 0;
        switch (choice) {
            case 1:
                result = x*y;
                break;
            case 2:
                result = x-y;
                break;
            case 3:
                result = x/y;
                break;
            case 4 :
                result = x+y;
                break;
//                I used default for if user dont use 1-2-3-4 for math operations
            default:
                System.out.println("You must enter valid choice");
        }
        return result;
    }
}
