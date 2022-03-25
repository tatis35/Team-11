package day20_scope_Arrays;

public class C02_StaticVariables {

    /* intance variable lar obje ye bagimlidir ve her obje farkli degerler alabilir ogrenci notlari veya ogretmen branslari gibi
    bir objeye ait bir variable'in son degerini bulmak icin sadece o objeyi dikkate aliriz

    Ststic variabler ise class variable
     */

    static String okulIsmi = "Yildiz Koleji";
    static int okulNo;
    static boolean okulAcikMi;

    public static void main(String[] args) {
        System.out.println(okulIsmi);//Yildiz Koleji
        System.out.println(okulNo);//0
        okulNo = 102;
        System.out.println(okulNo);//102
        System.out.println(okulAcikMi);//false
    }

    public static void staticMethod() {
        okulNo = 200;
        System.out.println(okulNo);

    }
}