import java.util.Scanner;

public class DiamondInTheSky {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the line number for diamond : ");
        int line = scanner.nextInt();
//ı used two nested for loops because when the first one finish the second one is started
        for (var i = 0; i < line; i++) {
            for (var k = line - 1 -i; k >= 0; k--){
                System.out.print(" ");
            }
            for (var j = 0; j < i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
//when the loop which above executed then below loop started but line number need to be minus 1 considering above loop for not to see
//        repetitive middle stars
        for (var i = 0; i < line-1; i++) {
            for (var j = 0; j < i+2; j++) {
                System.out.print(" ");
            }
            for (var k = line - 2 -i; k >= 0; k--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
