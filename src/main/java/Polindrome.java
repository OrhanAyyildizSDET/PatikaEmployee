import java.util.Arrays;
import java.util.Scanner;

public class Polindrome {
    public static void main(String[] args) {
//        these are prerequisites ı used string scanner for using 1. and 2. ways if ı need 3. ways only ı can use int scanner
        Scanner scanner = new Scanner(System.in);
        String str;
        while (true) {
            System.out.println("Please enter a number : ");
            str = scanner.nextLine().trim().replace(" ","");
            if (str.replaceAll("\\d","").length() != 0) {
            System.out.println("Please enter a valid number");
            }
            else {
                break;
            }
        }
//1. way ı used 2 arrays for add the second array from 1. array
        String[] words = str.split("");        
        String reverseWord = "";
        for (var i = str.length()-1; i >= 0; i--){
            reverseWord += str.charAt(i);
        }
        System.out.println(reverseWord.equals(str)?"Polindrome": "is not palindrome");



//2. way ı used for loops and started the end of the array
        String[] phrase = new String[words.length];
        var count = 0;
        for (var i = words.length - 1; i >= 0; i--) {
            phrase[count] = words[i];
            count++;
        }
        System.out.println(Arrays.toString(words));
        System.out.println(Arrays.toString(phrase));
        System.out.println(Arrays.equals(words, phrase) ?"Polindrome": "is not palindrome");


//    3. way with recursive method

        int number = Integer.parseInt(str);
        int reverseNumber = 0;
        int finalNumber = isPalindrome(number,reverseNumber);
        System.out.println(finalNumber);
        System.out.println(finalNumber == number?"Polindrome":"is not palindrome");

    }
    public static int isPalindrome(int number,int reverseNumber) {
        int modNumber = 0;
        if (number != 0) {
            modNumber = number%10;
            reverseNumber = (reverseNumber*10)+modNumber;
            number = number/10;
        }
        else {
            return reverseNumber;
        }

        return isPalindrome(number,reverseNumber);
    }
}
