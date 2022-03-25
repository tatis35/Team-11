package day12_StringManipilation;

public class C02_lastindexOf {

// sondan arama yapar bu index..ff
    public static void main(String[] args) {
         // Kullanicidan bir cumle ve kelime isteyin, kelimeni cumledeki kullanimina bakarak aratin.
        //       - Girilen kelime cumlede kullanilmamis-
        //       - Girilen kelime cumlede 1 kere kullanilmis.
        //        -Girilen kelime cumlede 1'den fazla kullanilmis.


        String cumle="Java ogren,yeni program ile yeni bir sayfa ac";

        String kelime="Java";

        int ilkKullanim=cumle.indexOf(kelime); // -1 veya index

        int sonKullanim=cumle.lastIndexOf(kelime); // -1 veya index

        if (ilkKullanim==(-1)) {
            System.out.println("Girilen kelime cumlede kullanilmamis");
        } else if(ilkKullanim==sonKullanim){
            System.out.println("Girilen kelime cumlede 1 kere kullanilmis");
        } else {
            System.out.println("Girilen kelime 1 den fazla kullanilmistir");
        }

        String  str="Eclipse";
        System.out.println(str.lastIndexOf("p",4));

        }

    }

