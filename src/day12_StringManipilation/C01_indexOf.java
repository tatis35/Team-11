package day12_StringManipilation;

public class C01_indexOf {

    public static void main(String[] args) {

        // Kullanicidan bir cumle ve kelime isteyin, kelimeni cumledeki kullanimina bakarak aratin.
        // - Girilen kelime cumlede kullanilmamis-
        // - Girilen kelime cumlede 1 kere kullanilmis.
        // -Girilen kelime cumlede 1'den fazla kullanilmis.

        String cumle="Java ogren,yeni program ile yeni bir sayfa ac";

        String kelime="bahadir";

        int ilkKullanim=cumle.indexOf(kelime); // -1 veya index

        int ikinciKullanim=cumle.indexOf(kelime,ilkKullanim+1);

        if (ilkKullanim==(-1)) {
            System.out.println("Girilen kelime cumlede kullanilmamis");
        }  else if(ikinciKullanim==(-1)){
            System.out.println("Istenen kelime cumlede bir kere kullanilmis");

        } else {
            System.out.println("Girilen kelime 1 den fayla kullanilmis");}


    }
}
