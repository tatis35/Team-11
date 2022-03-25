package day14_stringManipulation;


import java.util.Scanner;

public class C04_IsimGizleme {
    public static void main(String[] args) {

        //Soru7 Kullanicidan ismini, soyismini ve kredi karti bilgilerini isteyin ve asagidaki gibi yazdirin
        // isim-soyisim : M***** B*****
        // kart no: **** **** **** 1234

        Scanner scan = new Scanner(System.in);
        String isim = scan.nextLine();
        String soyisim = scan.nextLine();
        String kKNo=scan.nextLine();




        String yeniIsim=isim.substring(0,1).toUpperCase()+
                isim.substring(1).replaceAll("\\S","*");

        String yeniSoyisim=soyisim.substring(0,1).toUpperCase()+
                soyisim.substring(1).replaceAll("\\S","*");
        String yeniKKNo="**** **** **** "+ kKNo.substring(12);




        System.out.println("isim-soyisim :"+yeniIsim+ " "+yeniSoyisim+"\nkart no :"+ yeniKKNo);







    }
}
