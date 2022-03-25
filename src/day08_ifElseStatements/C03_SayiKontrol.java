package day08_ifElseStatements;

import java.util.Scanner;

public class C03_SayiKontrol {

    public static void main(String[] args) {


        //Soru 6) Kullanicidan iki sayi isteyin, sayilarin ikisi de pozitif ise sayilarin toplamini yazdirin,
        //sayilarin ikisi de negative ise sayilarin carpimini yazdirin, sayilarin ikisi farkli
        //isaretlere sahipse "farkli isaretlerde sayilarla islem yapamazsin" yazdirin,
        //sayilardan sifira esit olan varsa "sifir carpmaya gore yutan elemandir" yazdirin


        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen 1. sayiyi giriniz");

        double sayi1 = scan.nextDouble();

        System.out.println("lutfen 2.sayiyi giriniz");

        double sayi2 = scan.nextDouble();

        if (sayi1 > 0 && sayi2 > 0) {
            System.out.println("Girdiginiz iki sayi da pozitif oldugundan toplamlari = " +
                    (sayi1 + sayi2));
        } else if (sayi1 < 0 && sayi2 < 0) {
            System.out.println(" Girdiginiz iki syida negatif oldugundan carpimlar = " +
                    (sayi1 * sayi2));

        } else if (sayi1 * sayi2 < 0) {
            System.out.println("Sayilarin ikisi farkli isaretlere sahipse farkli isaretlerde sayi yazdiramazsin");


        } else {
            System.out.println("sayilardan sifira esit olan varsa sifir carpmaya gore yutan elemandir");

        }
    }
}
