package Patika1_2Week;

import javax.security.sasl.SaslClient;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Burçlar {
/* Koç Burcu : 21 Mart - 20 Nisan   Boğa Burcu : 21 Nisan - 21 Mayıs   İkizler Burcu : 22 Mayıs - 22 Haziran

Yengeç Burcu : 23 Haziran - 22 Temmuz    Aslan Burcu : 23 Temmuz - 22 Ağustos   Başak Burcu : 23 Ağustos - 22 Eylül

Terazi Burcu : 23 Eylül - 22 Ekim    Akrep Burcu : 23 Ekim - 21 Kasım    Yay Burcu : 22 Kasım - 21 Aralık

Oğlak Burcu : 22 Aralık - 21 Ocak   Kova Burcu : 22 Ocak - 19 Şubat   Balık Burcu : 20 Şubat - 20 Mart*/

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int day;
        String month;
        List<String> months = new ArrayList<>();
        Collections.addAll(months, "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec");
        System.out.println("Please enter your birth month as number (1,2...) or name (Jan,Feb...) : ");
        month = scanner.next();
        System.out.println("Pleas enter your birth day : ");
        Scanner scanner01 = new Scanner(System.in);
        day = scanner01.nextInt();
        month = month.trim().replaceAll("[^a-zA-Z0-9]", "");
        if (month.length() == 1 || month.length() == 3) {
            if (month.length() == 1) {
                int monthh = Integer.parseInt(month);
                if (monthh == 1) {
                    if (day < 22) {
                        System.out.println("Your Zodiac is Capricorn!");
                    } else {
                        System.out.println("Your Zodiac is Aquarius!");
                    }
                } else if (monthh == 2) {
                    if (day < 20) {
                        System.out.println("Your Zodiac is Aquarius!");
                    } else {
                        System.out.println("Your Zodiac is Aries!");
                    }
                } else if (monthh == 3) {
                    if (day < 21) {
                        System.out.println("Your Zodiac is Aries!");
                    } else {
                        System.out.println("Your Zodiac is Taurus!");
                    }
                }
                else if (monthh == 4) {
                    if (day < 21) {
                        System.out.println("Your Zodiac is Taurus!");
                    } else {
                        System.out.println("Your Zodiac is Gemini!");
                    }
                }
                else if (monthh == 5) {
                    if (day < 22) {
                        System.out.println("Your Zodiac is Gemini!");
                    } else {
                        System.out.println("Your Zodiac is Cancer!");
                    }
                }
                else if (monthh == 6) {
                    if (day < 22) {
                        System.out.println("Your Zodiac is Cancer!");
                    } else {
                        System.out.println("Your Zodiac is Leo!");
                    }
                }
                else if (monthh == 7) {
                    if (day < 23) {
                        System.out.println("Your Zodiac is Leo!");
                    } else {
                        System.out.println("Your Zodiac is virgo!");
                    }
                }
                else if (monthh == 8) {
                    if (day < 23) {
                        System.out.println("Your Zodiac is virgo!");
                    } else {
                        System.out.println("Your Zodiac is Libra!");
                    }
                }
                else if (monthh == 9) {
                    if (day < 23) {
                        System.out.println("Your Zodiac is Libra!");
                    } else {
                        System.out.println("Your Zodiac is Scorpio!");
                    }
                }
                else if (monthh == 10) {
                    if (day < 21) {
                        System.out.println("Your Zodiac is Scorpio!");
                    } else {
                        System.out.println("Your Zodiac is Sagittarius!");
                    }
                }
                else if (monthh == 11) {
                    if (day < 21) {
                        System.out.println("Your Zodiac is Sagittarius!");
                    } else {
                        System.out.println("Your Zodiac is Aquarius!");
                    }
                }
                else if (monthh == 12) {
                    if (day < 21) {
                        System.out.println("Your Zodiac is Aquarius!");
                    } else {
                        System.out.println("Your Zodiac is Pisces!");
                    }
                }
            }
            else if(month.length() == 3) {
                if (months.indexOf(month) == 1) {
                    if (day < 22) {
                        System.out.println("Your Zodiac is Capricorn!");
                    } else {
                        System.out.println("Your Zodiac is Aquarius!");
                    }
                } else if (months.indexOf(month) == 2) {
                    if (day < 20) {
                        System.out.println("Your Zodiac is Aquarius!");
                    } else {
                        System.out.println("Your Zodiac is Aries!");
                    }
                } else if (months.indexOf(month) == 3) {
                    if (day < 21) {
                        System.out.println("Your Zodiac is Aries!");
                    } else {
                        System.out.println("Your Zodiac is Taurus!");
                    }
                }
                else if (months.indexOf(month) == 4) {
                    if (day < 21) {
                        System.out.println("Your Zodiac is Taurus!");
                    } else {
                        System.out.println("Your Zodiac is Gemini!");
                    }
                }
                else if (months.indexOf(month) == 5) {
                    if (day < 22) {
                        System.out.println("Your Zodiac is Gemini!");
                    } else {
                        System.out.println("Your Zodiac is Cancer!");
                    }
                }
                else if (months.indexOf(month) == 6) {
                    if (day < 22) {
                        System.out.println("Your Zodiac is Cancer!");
                    } else {
                        System.out.println("Your Zodiac is Leo!");
                    }
                }
                else if (months.indexOf(month) == 7) {
                    if (day < 23) {
                        System.out.println("Your Zodiac is Leo!");
                    } else {
                        System.out.println("Your Zodiac is virgo!");
                    }
                }
                else if (months.indexOf(month) == 8) {
                    if (day < 23) {
                        System.out.println("Your Zodiac is virgo!");
                    } else {
                        System.out.println("Your Zodiac is Libra!");
                    }
                }
                else if (months.indexOf(month) == 9) {
                    if (day < 23) {
                        System.out.println("Your Zodiac is Libra!");
                    } else {
                        System.out.println("Your Zodiac is Scorpio!");
                    }
                }
                else if (months.indexOf(month) == 10) {
                    if (day < 21) {
                        System.out.println("Your Zodiac is Scorpio!");
                    } else {
                        System.out.println("Your Zodiac is Sagittarius!");
                    }
                }
                else if (months.indexOf(month) == 11) {
                    if (day < 21) {
                        System.out.println("Your Zodiac is Sagittarius!");
                    } else {
                        System.out.println("Your Zodiac is Aquarius!");
                    }
                }
                else if (months.indexOf(month) == 12) {
                    if (day < 21) {
                        System.out.println("Your Zodiac is Aquarius!");
                    } else {
                        System.out.println("Your Zodiac is Pisces!");
                    }
                }
            }
        }
    }
}

