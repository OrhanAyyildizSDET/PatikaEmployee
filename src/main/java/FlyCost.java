import java.util.Scanner;

public class FlyCost {
    /*Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi
    (Tek Yön, Gidiş-Dönüş) bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın
     ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.

İpucu
Normal Tutar = Mesafe * 0.10 = 1500 * 0.10 = 150 TL
Yaş İndirimi = Normal Tutar * Yaş İndirim Oranı = 150 * 0.10= 15 TL
İndirimli Tutar = Normal Tutar – Yaş İndirimi = 150 – 15 = 135 TL
Gidiş Dönüş Bilet İndirimi = İndirimli Tutar * 0.20 = 135 * 0.20 = 27 TL
Toplam Tutar = (135-27)* 2 = 216 TL
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age,km,kindofJourney;
        //I used while loop if user enter invalid credentials
        while (true){System.out.println("Please enter your age ");
            age = scanner.nextInt();
            if (age>=0&&age<100){
                break;
            }
            else {
                System.out.println("Enter valid age");
            }
        }
        //I used while loop if user enter invalid credentials
        while (true){
            System.out.println("Please enter how many km will you go? ");
            km = scanner.nextInt();
            if (km>0&&km< 15344 ){
                break;
            }
            else {
                System.out.println("Enter valid km value");
            }
        }
        //I used while loop if user enter invalid credentials
        while (true){
            System.out.println("Please enter do you want 1.round trip or 2.one-way? (1) or (2) ");
            kindofJourney = scanner.nextInt();
            if (kindofJourney==1||kindofJourney==2){
                break;
            }
            else{
                System.out.println("Enter valid trip");
            }
        }

        double kmCost = 0.1;

        System.out.println("Your total cost is : "+flyCost(age,km,kindofJourney,kmCost)+" TL");

    }
//    ı used if statements considering 12-24 and 65 age
    public static double flyCost(int age,int km,int kindofJourney,double perKmCost){
        double normalCost = km*perKmCost;
        if (age<12){
            normalCost/=2;
            if (kindofJourney==2){
                normalCost*=0.8;
            }
        }
        else if (age<24) {
            normalCost=normalCost*0.9;
            if (kindofJourney==2){
                normalCost*=0.8;
            }
        }
        else if (age>65){
            normalCost=normalCost*0.7;
            if (kindofJourney==2){
                normalCost*=0.8;
            }
        }
        else {
            if (kindofJourney==2){
                normalCost*=0.8;
            }
        }
        return normalCost;
    }
}
