package Patika1_2Week;

import java.util.Scanner;

public class ChinaZodiac {
/* Doğum Tarihi %12 = 0 ➜ Maymun   Doğum Tarihi %12 = 1 ➜ Horoz

Doğum Tarihi %12 = 2 ➜ Köpek  Doğum Tarihi %12 = 3 ➜ Domuz

Doğum Tarihi %12 = 4 ➜ Fare  Doğum Tarihi %12 = 5 ➜ Öküz

Doğum Tarihi %12 = 6 ➜ Kaplan   Doğum Tarihi %12 = 7 ➜ Tavşan

Doğum Tarihi %12 = 8 ➜ Ejderha   Doğum Tarihi %12 = 9 ➜ Yılan

Doğum Tarihi %12 = 10 ➜ At   Doğum Tarihi %12 = 11 ➜ Koyun*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        while (true){
            System.out.println("Please enter your birth year : ");
            year = scanner.nextInt();
            if (year>1900&&year<2022){
                break;
            }
            else {
                System.out.println("Please enter valid year");
            }
        }
        int zodiac = year%12;
        switch (zodiac){
            case 0:
                System.out.println("Your zodiac is Maymun");
                break;
            case 1:
                System.out.println("Your zodiac is Horoz");
                break;
            case 2:
                System.out.println("Your zodiac is Köpek");
                break;
            case 3:
                System.out.println("Your zodiac is Domuz");
                break;
            case 4:
                System.out.println("Your zodiac is Fare");
                break;
            case 5:
                System.out.println("Your zodiac is Öküz");
                break;
            case 6:
                System.out.println("Your zodiac is Kaplan");
                break;
            case 7:
                System.out.println("Your zodiac is Tavşan");
                break;
            case 8:
                System.out.println("Your zodiac is Ejderha");
                break;
            case 9:
                System.out.println("Your zodiac is Yılan");
                break;
            case 10:
                System.out.println("Your zodiac is At");
                break;
            case 11:
                System.out.println("Your zodiac is Koyun");
                break;
            default:
                System.out.println("Good bye!"); //No need default in this case
        }
    }
}
