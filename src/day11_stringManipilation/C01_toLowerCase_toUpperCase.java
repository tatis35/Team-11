package day11_stringManipilation;

import java.util.Locale;

public class C01_toLowerCase_toUpperCase {
    public static void main(String[] args) {


        String str="Java Guzeldir";

        System.out.println (str.toLowerCase().charAt(5));

        System.out.println(str.toUpperCase(Locale.forLanguageTag("tr")));

        System.out.println(str.toUpperCase(Locale.forLanguageTag("fr")));



        //Biz string method'larini arka arkaya kullanabiliriz
        //mesela ikinci kelimenin ilk harfini kucuk olarak yazdiralim






    }
}
