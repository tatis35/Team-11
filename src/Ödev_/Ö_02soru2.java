package Ödev_;
import java.util.Scanner;
public class Ö_02soru2 {

        public static void main(String[] args) {


        /*Kullanicidan dikdortgenin kenar uzunluklarini isteyin ve dikdortgenin kare olup
        olmadigini yazdirin*/

            Scanner scan = new Scanner(System.in);

            System.out.println("Lütfen 1. Kenar Uzunlugu yaziniz");

            int kenarUzunlugu1 = scan.nextInt();

            System.out.println("Lütfen 2. Kenar Uzunlugunu yaziniz");

            int kenarUzunlugu2 = scan.nextInt();

            int kenaruzunlugu3 = kenarUzunlugu1;
            int kenarUzunlugu4 = kenarUzunlugu2;


            if (kenarUzunlugu1 != kenarUzunlugu2) {
                System.out.println("Yazdiginiz Kenar Uzunluklari Dikdörtgendir");
            } else {
                System.out.println("Yazdiginiz Kenar Uzunluklari Karedir");
            }


        }
}















