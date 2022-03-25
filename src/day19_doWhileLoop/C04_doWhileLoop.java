package day19_doWhileLoop;

import java.util.Scanner;

public class C04_doWhileLoop {

   /* Kullanicidan toplamak uzere pozitif sayilar isteyin,
      islemi bitirmek icin 0’a basmasini soyleyin.
    Kullanici yanlislikla negative sayi girerse o sayiyi dikkate almayin ve “Negatif sayi giremezsiniz” yazdirip basa donun
    Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini, yanlislikla kac negative sayi girdigini ve
    girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.
    */
   public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);
       int sayi = 10000;
       int toplam=0;


       do {
           System.out.println("Lutfen pozitif bir tam sayi girin \nbitirmek icin 0'a basin");
           sayi = scan.nextInt();
           if (sayi < 0) {
               System.out.println("negatif sayi giremezsiniz");
           } else if (sayi > 0) {
               toplam += sayi;
           }
       } while (sayi !=0);

       System.out.println("girilen sayilarin toplami : "+toplam);


   }


}