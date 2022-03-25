package day11_stringManipilation;

public class C02_Equals {

    public static void main(String[] args) {

        // String te olan degerleri karsilastiran bir method " equals"


        String str1="Ali Can";
        String str2="Ali Can";

        System.out.println("str1 : "+ str1);
        System.out.println("str2 : "+ str2);

        System.out.println("== ile karsilastir : " + (str1==str2) );
        System.out.println("equals ile karsilastir : "+ str1.equals(str2));

        String str3=str1+"";
        System.out.println("== ile karsilastir : "+ (str3==str2));
        System.out.println("equals ile karsilastir : "+ str3.equals(str2));

        // Strind'de == herzaman dogru sonuc vermez
        // bunun icin emin oldugumuz equals metgod'unu kullanmayi tercih ederiz

        String str5="hasan";
        String str6="HASAN";


        System.out.println(str5.equals(str6));
        System.out.println(str5.toUpperCase().equals(str6));






    }
}
