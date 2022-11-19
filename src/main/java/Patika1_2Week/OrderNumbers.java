package Patika1_2Week;

import java.util.*;

public class OrderNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
//        I put my inputs directly into list
        System.out.println("Please enter the first number");
        numbers.add(scanner.nextInt());
        System.out.println("Please enter the second number");
        numbers.add(scanner.nextInt());
        System.out.println("Please enter the third number");
        numbers.add(scanner.nextInt());
        System.out.println("Please enter the fourth number");
        numbers.add(scanner.nextInt());
        System.out.println("Please enter the fifth number");
        numbers.add(scanner.nextInt());
//I used here nested for loops and temperory variable for switch the numbers
        int tempVar;
        for (int i = 0; i < numbers.size() - 1; i++) {
            for (int j = i+1; j < numbers.size() - 1; j++) {
                {
                    if (numbers.get(i) > numbers.get(j)||numbers.get(i) == numbers.get(j)) {
                        {
                            tempVar = numbers.get(j);
                            numbers.set(j , numbers.get(i));
                            numbers.set(i, tempVar);
                        }
                    }
                }
            }
        }
        System.out.println(numbers);

//        This is the short way with using "Collections Interface"
//        Collections.sort(numbers, Comparator.naturalOrder());
//        System.out.println(numbers);
    }
}

