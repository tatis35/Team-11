package day09_ternary_Switch;

import java.util.Scanner;

public class C05_ternary {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        int sayi= scan.nextInt();

        System.out.println( sayi > 100 ? sayi*sayi : " sayi 100 den büyük olmali");



    }
}
