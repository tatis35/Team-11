package day11_stringManipilation;

import java.util.Scanner;

public class  C03_equalsIgoreCase {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println( "Derse katilmak ister misiniz ? \n Evet veya Hayir yaziniz");

        String cevap=scan.next();




        if (cevap.equalsIgnoreCase("evet")) {
            System.out.println("cevabiniz : "+cevap+"\nderse katiliminiz onaylanmistir");

        } else if (cevap.equalsIgnoreCase("hayir")) {
            System.out.println("cevabiniz : "+cevap+"\nSonraki derslerimize bekleriz");
        } else {
            System.out.println("lütfen evet veya hayir yaziniz");
        }

    }
}
