package day08_ifElseStatements;

import java.util.Scanner;

public class C02_NotuHarfCevirme {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen Notunuzu giriniz");


        double not = scan.nextDouble();

        if (not<0 || not>100) {
            System.out.println("Lütfen gecerli bir not giriniz!!");
        } else if (not <= 50) {
            System.out.println("Notunuz : D");

        } else if (not <= 60) {
            System.out.println("Notunuz : C");
        } else if (not <= 80) {
            System.out.println("Notunuz : B");

        } else if (not <= 100) {
            System.out.println("Notunuz : A");
        }
    }
}
