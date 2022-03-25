package day07_ifElseStatements;

import java.util.Locale;
import java.util.Scanner;

public class C04_haftaiciHaftasonu {


    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen Bir Haftanin Gününü Giriniz.");

        String haftaninGünü=scan.next().toLowerCase();
        if (haftaninGünü.equals("pazar") || haftaninGünü.equals("cumartesi")){

            System.out.println("Girdiginiz Gün haftasonu ");


        }

        if (haftaninGünü.equals("pazartesi") ||haftaninGünü.equals("sali") ||
        haftaninGünü.equals("carsamba")|| haftaninGünü.equals("persembe") || haftaninGünü.equals("cuma")){

            System.out.println("Girdiginiz Gün Haftaici");
        }

    }
}
