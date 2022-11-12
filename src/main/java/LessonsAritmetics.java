import java.util.Scanner;

public class LessonsAritmetics {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter Math note");
        int math = scanner.nextInt();
        System.out.println("Please enter Physics note");
        int physics = scanner.nextInt();
        System.out.println("Please enter Chemical note");
        int chemical = scanner.nextInt();
        System.out.println("Please enter Turkish note");
        int turkish = scanner.nextInt();
        System.out.println("Please enter History note");
        int history = scanner.nextInt();
        System.out.println("Please enter music note");
        int music = scanner.nextInt();

        //we called here calculate function
        double noteAverage = noteCalculator(math, physics,chemical,turkish,history,music);

        //with ternary statement
        System.out.println(noteAverage<60?"Maalesef Geçemediniz":"Congratulations! You passed!");

        //with switch statement if average divide 60 is bigger or equal than "1" it returns us default statement
        switch ((int) noteAverage/60) {
            //it rolled down result which is smaller than "1"
            case 0:
                System.out.println(noteAverage/60);
            System.out.println("Ortalama Notunuz : "+noteAverage);
                System.out.println("Maalesef Geçemediniz");
                break;
            default:
                System.out.println("Ortalama Notunuz : "+noteAverage);
                System.out.println("Congratulations! You passed!");
        }
    }
//we use var args here because there are too many variable for using şn method
    public static double noteCalculator(int... a){
        double average = 0;
        for (int i:a){
            average+=i;
        }
        average/=a.length;
        return average;
    }
}
