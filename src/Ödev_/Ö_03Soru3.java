package Ödev_;

import java.util.Scanner;

public class Ö_03Soru3 {

    public static void main(String[] args) {

        // Kullanicidan bir ucgenin uc kenar uzunlugunu alin eger uc kenar uzunlugu
        //birbirine esit ise ekrana “Eskenar ucgen” yazdirin. Diger durumlarda ekrana
        //“Eskenar degil” yazdirin.


        Scanner scan=new Scanner(System.in);

        System.out.println("lutfen 1. kenar uzunlugu yazin");

        int kenar1= scan.nextInt();

        System.out.println("lütfen 2. kenar uzunlugu yaziniz.");

        int kenar2= scan.nextInt();

        System.out.println("lütfen 3. kenar uzunlugu yaziniz");

        int kenar3= scan.nextInt();

        if ((kenar1==kenar2) && (kenar1==kenar3)) {

            System.out.println("Girdiginiz degerler Eskenarücgene aittir");

        } else {
            System.out.println("Eskenarücgen kenar uzunluklari girmedinz");
        }
    }
}
