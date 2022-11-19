package Patika1_2Week;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserSign_In {
/*Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun, eğer kullanıcı
 sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip ,
  şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        I use HashMap for keep user data
        Map<String,String> user = new HashMap<>();
        user.put("username","hello");
        user.put("password","123World!");
//        ı use while loop for if user enters wrong username
        System.out.println("Please enter your username");
        while (true){
            String username = scanner.nextLine();
            if (!username.equals(user.get("username"))) {
                System.out.println("Enter your valid username");
            }
            else{
                    break;
            }
        }

        System.out.println("Please enter your password");
        String password = scanner.nextLine();
//        first if user enter wrong password ı asked user if he/she wants to enter new password or done the process
        if (!password.equals(user.get("password"))){
            System.out.println("Do you want to change your password? Because you entered wrong password (yes/no)");
            String changePasswordAnswer = scanner.next().toLowerCase();

            if (changePasswordAnswer.equals("yes")){
                System.out.println("Enter your new password");
                Scanner scanner01 = new Scanner(System.in);
                String newPassword = scanner01.nextLine();
//            then ı asked for new password and if it is equals the new password ı warned user for entering new password
//             ı used while loop for if user insist on old password for change
                if (newPassword.equals(user.get("password"))){
                    while (true) {
                        Scanner scanner02 = new Scanner(System.in);
                        System.out.println("Please enter your new password from different than older password");
                        String newPasswordAnswer = scanner02.nextLine();
//             finally if user enters new password ı accept it
                        if (!newPasswordAnswer.equals(user.get("password"))) {
                            System.out.println("Your new password is created as"+newPasswordAnswer);
                            user.put("password", newPasswordAnswer);
                            System.out.println(user);
                            break;
                        }
                    }
                }
//              if user enters new password different from older we can reach directly here
                else {
                    System.out.println("Your new password is created as"+newPassword);
                    user.put("password", newPassword);
                    System.out.println(user);
                }
            }
        }
//if user enters correct username and password ı congratulate him/her
        else {
            System.out.println("You entered successfully!");
        }
    }

}
