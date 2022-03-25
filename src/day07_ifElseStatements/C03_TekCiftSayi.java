package day07_ifElseStatements;

import java.util.Scanner;

public class C03_TekCiftSayi {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen Bir Tam sayi Giriniz.");

        int sayi=scan.nextInt();

        if (sayi%2 == 0){
            System.out.println("Girilen Sayi Cifttir.");

        }

        if (sayi%2 != 0){
            System.out.println("girilen sayi tektir");

            if (sayi%2 == 0){

                System.out.println("girdiginiz sayi cift sayidir");
            } else {
                System.out.println("Girdiginiz sayi tek sayidir");
            }

        }
    }
}
