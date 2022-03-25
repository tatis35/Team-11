package day19_doWhileLoop;

public class C01_WhileLoop {

   // Kullanicidan bir sayi alin ve bu sayiyi tam bolen sayilari ve toplam kac tane olduklarini ekranda yazdirin

    public static void main(String[] args) {


        int input=20;

        // for loop ile de yapabilir miyiz
        // While loop ile yapalim


        int bolen=1;
        int sayac=0;

        while (bolen<=input) {

            if (input% bolen == 0){
                System.out.println(bolen+ " ");
                sayac++;
            }
            bolen++;

        }
        System.out.println("");
        System.out.println(input+" sayini bolen"+ sayac+ " adet sayi vardir");
    }

}
