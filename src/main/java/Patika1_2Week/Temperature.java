package Patika1_2Week;

import java.util.Scanner;
/*Koşullar :

        Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
        Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
        Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
        Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
        Ödev
        Aynı örnek üzerinden if koşulları başka hangi şekilde oluşturulabilirdi farklı çözüm yolları bulunuz.
*/
public class Temperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temperature = scanner.nextInt();
//        here ı used nested ternary statement
        System.out.println(temperature<5?"Kayak sporu yapmalısın":
                            (temperature<15?"Arkadaşlarınla sinemaya gidebilirsin":
                                (temperature<25?"Ailenle beraber pikniğe gidebilirsin":"Yüzme sporu sana iyi gelecektir")));
    }
}
