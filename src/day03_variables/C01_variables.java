package day03_variables;

import java.util.Scanner;

public class C01_variables {

    public static void main(String[] args) {

        /* 1- Farkli 3 data turunde variable olusturun ve bunlari yazdirin
        2- isim ve soyisim icin iki variable olusturun ve bunlari

        isminiz : Mehmet
        soyisminiz : Bulutluoz

         seklinde yazdirin*/
         char ilkHarf;
         ilkHarf='H';

        System.out.println(ilkHarf);
        int sayi1=10, sayi2=20;
        System.out.println(sayi1+sayi2);

       // Scanner scan=new Scanner(System.in);



        String isim="Nezir";
        String soyisim= "Yildiz";
        System.out.println("isminiz : "+isim);
        System.out.println("soyisminiz : "+ soyisim);


        //3- Iki farkli tamsayi data turunde

        short sayi3=20;
        double sayi4=30;
        System.out.println("iki sayinin toplami : "+(sayi3+sayi4));


        // 2 variable olusturun bunlarin toplamini yazdirin
        //4- Bir tamsayi ve bir ondalikli variable olusturun ve bunlarin toplamini yazdirin
        //5 – char data turunde bir variable olusturun ve yazdirin
        char ozelKarakter='#';
        System.out.println(ozelKarakter);

        //6- Bir tamsayi, bir de char degisken olusturun ve bunlarin toplamini yazdirin
        // ASCII sembol kontrol tablosu


        int sayi5=20;
        char harf='a';
        System.out.println(sayi5+harf);

        int sayi6='a';
        System.out.println(sayi6);
       /*1- Verilen sayi1 ve sayi2 variable’larinin degerlerini degistiren (SWAP) bir program yaziniz
       Orn  : sayi1=10 ve sayi2=20;
       kod calistiktan sonra
     sayi1=20 ve sayi2=10*/






    }
}
