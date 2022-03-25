package day07_ifElseStatements;

import java.util.Scanner;

public class C07_ifElseIf {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen gun ismini yaziniz");

        String gunIsmi = scan.next().toLowerCase();
        if (gunIsmi.equals("pazar") || gunIsmi.equals("cumartesi")) {
            System.out.println("Girdiginiz gün haftasonu");
        } else if (gunIsmi.equals("pazartesi") || gunIsmi.equals("sali") || gunIsmi.equals("carsamba") || gunIsmi.equals("persembe")
                || gunIsmi.equals("cuma")) {
            System.out.println("girdiginiz gun haftaici");
        } else {
            System.out.println("lütfen ciddi olunuz");
        }

    }
}

