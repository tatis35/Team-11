package day17_forLoop;

import java.util.Scanner;

public class C06_ForLoop {

    public static void main(String[] args) {
    // verilen iki harf ve aralarindaki harfleri yazdiran
    // bir kod yaziniz
    char ilkHarf='m';
    char sonHarf='t';
    for (char i = ilkHarf; i <=sonHarf ; i++) {
        System.out.print(i + " ");
    }
    double baslangic=10;
    double bitis=20;
    double artis= 0.2;
    // baslangic ve bitis sayilari arasinda artis miktari ile olusacak
    // tum sayilari yazdirin
    for (double i = baslangic; i <=bitis ; i+=artis) {
        System.out.print(i + " ");
    }


    Scanner scan= new Scanner(System.in);

    char harf=scan.next().charAt(0);

    if ((harf>='A'&& harf<='Z') || (harf>='a' && harf<='z')) {

            System.out.println("Haata");
        } else {


    }
}
}
