package day03_variables;

import java.util.Scanner;

public class C05_Scanner2 {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen cemberin yari capini giriniz.");

        double yaricap=scan.nextDouble();


        System.out.println("girdiginiz yari cap : "+yaricap);
        System.out.println("cemberin cevresi : "+ (2*3.14*yaricap));
        System.out.println("dairenin alani : "+ 3.14*yaricap);





    }
}
