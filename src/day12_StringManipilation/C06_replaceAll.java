package day12_StringManipilation;

import java.util.Scanner;

public class C06_replaceAll {

    public static void main(String[] args) {

        // Kullanicidan isim-soyisim bilgisini alip
        // butun harfleri '*' yapalim

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen isminizi ve soyisminizi yaziniz");

        String isimSoyisim=scanner.nextLine();
        System.out.println(isimSoyisim.replaceAll("\\S","*")); // youtube (2sa.40.dk) 12 StringMaipulation


    }
}
