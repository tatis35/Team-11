package day09_ternary_Switch;

import java.util.Scanner;

public class C06_ternaryOperator {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        int sayi= scan.nextInt();

        System.out.println(sayi >= 0 ? sayi : ((-1) * sayi));


    }
}
