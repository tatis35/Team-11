package day09_ternary_Switch;

import java.util.Scanner;

public class C04_NestedTernary {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir sayi giriniz");


        int sayi =scan.nextInt();


        if (sayi >= 0) {
            if (sayi % 2 == 0) {
                System.out.println("sayi pozitif");

            } else {
                System.out.println("sayi pozitif tek sayi");
            }
            if (sayi <= -100) {
                System.out.println("sayi -100 den kücük negatif sayi");

            } else {
                System.out.println("sayi -100 den büyük negatif sayi");
            }

        }

        String sonuc=sayi>=0 ?
                                (sayi%2==0 ? "Pozitif cift sayi" : "Pozitif tek sayi" ):
                                 (sayi<-100 ? "-100 den kücük negatif sayi" : "-100 den büyük negatif sayi" );

    }
}
