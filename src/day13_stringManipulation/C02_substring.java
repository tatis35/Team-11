package day13_stringManipulation;

public class C02_substring {

    public static void main(String[] args) {


        //1-48 of results for "Nutella"
        // bu arama sonucundaki bulunan sonuc sayisi 100'den cok ise super
        //az ise "az sonuc bulundu"

        String str="1-48 of over 104 results for \"nutella\"";

        int ilkSpace= str.indexOf(" ");
        int ikincispace= str.indexOf(" ",ilkSpace+1);
        int ucuncuSpace=str.indexOf(" ",ikincispace+1);
        int dortSpace=str.indexOf(" ",ucuncuSpace+1);

        String aramaSonucSayisiStr=str.substring(ucuncuSpace+1,dortSpace);

        System.out.println(aramaSonucSayisiStr);
        int aramaSonucSayisiInt=Integer.valueOf(aramaSonucSayisiStr);

        if (aramaSonucSayisiInt>100) {

            System.out.println("super");
        } else {
            System.out.println(aramaSonucSayisiStr+" az sonuc bulundu");
        }


    }
}
