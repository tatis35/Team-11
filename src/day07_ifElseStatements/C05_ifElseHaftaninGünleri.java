package day07_ifElseStatements;

import java.util.Locale;
import java.util.Scanner;

public class C05_ifElseHaftaninGünleri {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen Bir Haftanin Gününü Giriniz.");

        String haftaninGünü=scan.next().toUpperCase();

        if (haftaninGünü.equals("PAZAR") || haftaninGünü.equals("CUMARTESI")){

            System.out.println("Girdiginiz Gün haftasonu ");}

    }
}
