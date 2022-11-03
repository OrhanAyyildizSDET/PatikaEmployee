import java.util.Scanner;

public class Vücut_Kitle_Indeksi {

    public static void main(String[] args) {
        measureChoice();
    }
    public static void measureChoice(){
        Scanner scanner = new Scanner(System.in);
        double resultIndex;
        while (true) {
            System.out.printf("Which measure type do you want to enter?\n1.Kg and Cm\n2.Ft and Pound%n");
            int select = scanner.nextInt();
            if (select == 1) {
                resultIndex = bodyIndexWithKgCm();

            } else {
                resultIndex = bodyIndexFtPound();
            }
            if (resultIndex < 18.5){
                System.out.println("You need to eat a little more" +
                        "\nYour body-weight index is : "+resultIndex+"\nYour body-weight index must be between 18.5-25");
            } else if (resultIndex<25) {
                System.out.println("You are fit and have well health\nYour body-weight index is : "+resultIndex);
            } else if (resultIndex<30) {
                System.out.println("You need to take care of yourself and what you are eating" +
                        "\nYour body-weight index is : "+resultIndex+"\nYour body-weight index must be between 18.5-25");
            }else {
                System.out.println("Please immediately start a diet program" +
                        "\nYour body-weight index is : "+resultIndex+"\nYour body-weight index must be between 18.5-25");
            }
            scanner.nextLine();
            System.out.println("If you want to keep going please enter yes if you don't want enter no ");
            String answer = scanner.nextLine().toLowerCase();
            if (answer.equals("no")) {

                break;

            }
        }
    }
    public static double bodyIndexWithKgCm() {
        Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter your height as cm example:180");
            double height = scanner.nextDouble();
            System.out.println("Please enter your weight as kg example:82");
            double weight = scanner.nextDouble();
            return indexCalculate(height, weight,1);

        }
    public static double bodyIndexFtPound() {
        Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter your height as feet example:6.2");
            double height = scanner.nextDouble();
            System.out.println("Please enter your weight as pound example:178");
            double weight = scanner.nextDouble();
            return indexCalculate(height, weight,2);
    }
    public static double indexCalculate(double height, double weight,int flag){
        double indexResult;
//        0.032808  0.453
        if (flag == 1 ){
            indexResult = weight/(height/100*height/100);
        }
        else {
            indexResult = weight*0.453/(height/100/0.032808*height/100/0.032808);
        }

        return indexResult;
    }
}
