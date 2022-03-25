package day11_stringManipilation;


import java.util.Scanner;

public class C05_indexOf {

    public static void main(String[] args) {

        String str1="Java bir baska guzel valla cok guzel";
        // istersek char olarak verdigimiz bir harfin indexini bize döndürür

        System.out.println(str1.indexOf('J'));// 0
          // istersek char olarak verdigimiz bir harfin indexini bize döndürür

        System.out.println(str1.indexOf('l')); // 19


        System.out.println(str1.length()-1); //35
        System.out.println(str1.indexOf("aska")); //10

        // ayni harften birden fazla varsa?


        System.out.println(str1.indexOf("b")); // 5 buldugu ilk dogru eslesmenin indexini döndürür


        System.out.println(str1.indexOf('b', 5));
        // bu method'da java aramaya fromIndex olarak yazdigimiz index'den baslar
        // (inclusive)

        //verilen String'deki 2.a harfinin index'ini bulalim


        int ilkIndex = str1.indexOf('a'); // 1


        System.out.println(str1.indexOf('a', ilkIndex+1)); // 3

        // verilen String'deki 2.a harfinin index'ini bulalim

        int ilkbindex = str1.indexOf("b"); // 5
        System.out.println(str1.indexOf("b" , ilkIndex+1)); // 9

        // 20. index'ten sonra guzel aratalim

        System.out.println(str1.indexOf("guzel",20)); //31

        System.out.println(str1.indexOf("y")); // y yok demesi layim ama return type'i index
        // yok demenin sayisal karsiligi olarak java-1 döndürmeyi tercih etmistir

        // kullanicidan mail adresini isteyin @ isareti icermiyorsa gecersiz yazdirin
        // iceriyorsa mailiniz kabul edildi


      Scanner scan= new Scanner(System.in);

        System.out.println("lutfen mailinizi yaziniz");

        String mail= scan.next();

        if (mail.indexOf("@")==(-1)) {

            System.out.println("gecersiz mail");
        } else {
            System.out.println("mailiniz kabul edildi");
        }


        // OZET: indexof methodun icerisine yazilan String veya char in
        // metinde hangi index'de oldugu bize döndürür
        //eger aradiginiz metin veya char yoksa, olmadiginin delili olarak
        // bize -1 döndürür








    }
}
