package dersNotlari;

public class D01 {

   /*
    package day11_stringManipulation;
import java.util.Locale;
    public class C01_toLowerCase_toUpperCase {
        public static void main(String[] args) {
            String str= "Java Guzeldir";
            // Biz string method'larini arka arkaya kullanabiliriz
            // mesela ikinci kelimenin ilk gharfini kucuk olarak yazdiralim
            // str.charAt(5); boyle yazdigimizda sonuc artik String degil char olacaktir
            // dolayisiyla String'de yapmak istegimiz tum degisiklikleri
            // once yapip sonra charAt() method'unu kullanmaliyiz
            System.out.println(str.toLowerCase().charAt(5));
            System.out.println(str.toUpperCase(Locale.forLanguageTag("tr"))); // JAVA GUZELDİR
            System.out.println(str.toUpperCase(Locale.forLanguageTag("fr"))); // JAVA GUZELDIR
        }
    }
    Collapse



8:21
    Untitled
package day11_stringManipulation;
    public class C02_Equals {
        public static void main(String[] args) {
            String str1= "Ali Can";
            String str2= "Ali" + " Can";
            System.out.println("str1 : " + str1);
            System.out.println("str2 : " + str2);
            System.out.println("== ile karsilastir : " + (str1==str2));
            System.out.println("equals ile karsilastir : " + str1.equals(str2));
            String str3= str1+"";
            System.out.println("str3 : " + str3);
            System.out.println("== ile karsilastir : " + (str3==str2));
            System.out.println("equals ile karsilastir : " + str3.equals(str2));
            // String'de == herzaman dogru sonuc vermez
            // bunun icin emin oldugumuz equals method'unu kullanmayi tercih ederiz
            String str5= "hasan";
            String str6 = "HASAN";
            System.out.println(str5.equals(str6)); // false
            System.out.println(str5.toUpperCase().equals(str6)); // true
        }
    }
    Collapse




    Mehmet Bulutluoz  9:27 PM
            Untitled
package day11_stringManipulation;
import java.util.Scanner;
    public class C03_equalsIgnoreCase {
        public static void main(String[] args) {
            // kullaniciya derse katili katilmak istemedigini sorun
            // evet derse, cevabini ve  "derse katiliminiz onaylanmistir" yazdirin
            // hayir derse cevabini ve "Sonraki derslerimize bekleriz" yazdirin
            Scanner scan= new Scanner(System.in);
            System.out.println("Derse katilmak ister misiniz ? \nEvet veya Hayir yaziniz");
            String cevap=scan.next();
            if (cevap.equalsIgnoreCase("evet")){
                System.out.println("cevabiniz : " + cevap + " derse katilimizniz onaylanmistir" );
            } else if (cevap.equalsIgnoreCase("hayir")){
                System.out.println("cevabiniz : " + cevap + " Sonraki derslerimize bekleriz" );
            } else {
                System.out.println("lutfen evet veya hayir yaziniz");
            }
        }
    }
    Collapse



9:27
    Untitled
package day11_stringManipulation;
import java.util.Locale;
import java.util.Scanner;
    public class C04_length {
        public static void main(String[] args) {
            // Kullanicidan ismini alip basharfini ve son harfini Buyuk harflerle yazdirin
            Scanner scan = new Scanner(System.in);
            System.out.println("Lutfen isminizi giriniz");
            String isim= scan.nextLine();
            System.out.println("ilk Harf : " + isim.toUpperCase(Locale.forLanguageTag("tr")).charAt(0));
            System.out.println("son harf : " + isim.toUpperCase(Locale.forLanguageTag("tr")).charAt(isim.length()-1));
            String str1="";
            System.out.println(str1.length()); // 0
            String str2=null;
            System.out.println(str2);
            // System.out.println(str2.length()); // calistirildiginda hata verir
            String str3;
            // System.out.println(str3);
            // str3 ile str2'ye deger atanmamistir
            // str2 null pointer ile isaretlendiginden java durumun kontrol altinda oldugu bilir
            // ve geriye kalan kodun calismasina engel olmaz
            // ancak str3' e bir deger atamasi olmayinca java altini kirmizi cizer
            // ve bu durum duzeltilinceye kadar kodun geriye kalaninin calismasinada izin vermez
        }
    }
    Collapse














    Send a message to code_sharing








    Shift + Enter to add a new line
}*/
}