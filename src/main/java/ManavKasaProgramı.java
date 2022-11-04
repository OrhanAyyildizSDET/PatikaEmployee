import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class ManavKasaProgramı {
    private static String[] listOfFruits;
    private static int[] listOfPrice;
    private static int[] listOfKg;
    public static void main(String[] args) {
        listOfFruits = new String[]{"armut","elma","muz","şeftali","domates","salatalık","üzüm"};
        listOfPrice = new int[]{9,6,22,12,6,8,13};
        listOfKg = new int[]{0,0,0,0,0,0,0};
//        purchase();
        purchase2();
    }
    public static void purchase(){
        Map<String, Integer> bill = new HashMap<>();
        for (var i = 0; i < listOfFruits.length;i++){
            bill.put(listOfFruits[i], listOfKg[i]);
        }
        int totalPrice = 0;
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        while (true) {
            System.out.println("Which fruit do you want to purchase? Please type the name of fruit\n" +
                    "armut : 9 TL\n" +
                    "elma : 6TL\n" +
                    "muz : 22 TL\n" +
                    "şeftali : 12 TL\n" +
                    "domates : 6 TL\n" +
                    "salatalık : 8 TL\n" +
                    "üzüm : 13 TL\n");
            String answer = scanner.nextLine().toLowerCase();
            System.out.println("How much kg do you want to purchase");
            int kg = scanner1.nextInt();
            switch (answer){
                case "armut":
                 totalPrice+=kg*listOfPrice[0];
                 bill.put("armut",bill.get("armut")+kg);
                 break;
                case "elma":
                totalPrice+=kg*listOfPrice[1];
                bill.put("elma",bill.get("elma")+kg);
                break;
                case "muz":
                totalPrice+=kg*listOfPrice[2];
                bill.put("muz",bill.get("muz")+kg);
                break;
                case "şeftali":
                totalPrice+=kg*listOfPrice[3];
                bill.put("şeftali",bill.get("şeftali")+kg);
                break;
                case "domates":
                totalPrice+=kg*listOfPrice[4];
                bill.put("domates",bill.get("domates")+kg);
                break;
                case "salatalık":
                totalPrice+=kg*listOfPrice[5];
                bill.put("salatalık",bill.get("salatalık")+kg);
                break;
                case "üzüm":
                totalPrice+=kg*listOfPrice[6];
                bill.put("üzüm",bill.get("üzüm")+kg);
                break;
            }
            System.out.println("=======================================================================================");
            System.out.println("Total bill : "+bill);
            System.out.println("=======================================================================================");
            System.out.println("Total Price : "+totalPrice);
            System.out.println("=======================================================================================");
            System.out.println("Do you want to keep purchase? yes or no");
            String keepAnswers = scanner.nextLine().toLowerCase();
            if (keepAnswers.equals("no")){
                break;
            }
        }
    }
    public static void purchase2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Armut : 9 TL\n" +
                "Elma : 6TL\n" +
                "Muz : 22 TL\n" +
                "Şeftali : 12 TL\n" +
                "Domates : 6 TL\n" +
                "Salatalık : 8 TL\n" +
                "Üzüm : 13 TL\n");
        System.out.println("Lütfen almak istediğiniz miktarları sırası ile yazınız");

        System.out.print("Armut kaç kilo? : ");
        int armut = scanner.nextInt();
        System.out.print("Elma kaç kilo? : ");
        int elma = scanner.nextInt();
        System.out.print("Muz kaç kilo? : ");
        int muz = scanner.nextInt();
        System.out.print("Şeftali kaç kilo? : ");
        int şeftali = scanner.nextInt();
        System.out.print("Domates kaç kilo? : ");
        int domates = scanner.nextInt();
        System.out.print("Salatalık kaç kilo? : ");
        int salatalık = scanner.nextInt();
        System.out.print("Üzüm kaç kilo? : ");
        int üzüm = scanner.nextInt();
        System.out.println();
        System.out.println("===============================================================");
        int total = listOfPrice[0]*armut+listOfPrice[1]*elma+listOfPrice[2]*muz+listOfPrice[3]*şeftali+listOfPrice[4]*domates+
                listOfPrice[5]*salatalık+listOfPrice[6]*üzüm;
        System.out.println("Toplam tutar : "+total+" TL");
    }

}
