package day19_doWhileLoop;

public class C05_Scope {

    //1-Bir method icersinde olusturulan variable'lar sadece olusturduklari
    // method'da kuklanilabilirler, baska methodlara kullanilamazlar
    //2- Tüm methodlarin kullanabilmesini istedigimiz variablelari
    // classs levelda olustururuz
    // class levelda olusturdugumz variable'i static yaparsak tum methodlar kullanabilir
    //---static olmaz ise (instance) o zaman sadece static olmayan methodlar kullanilabilir
    // 3- LOoop icinde olusuturulan variablelear loop icerisinde kullanilabilir
    // ama loop'un disinda kullanilmaz



    static String kurs="Java";
    int level=10;


    public static void main(String[] args) {
        int sayi=10;
      //  isim="Vali Yan";
        System.out.println(kurs);
    //    System.out.println(level);
        for (int i=0; i<0; i++) {

            System.out.println(i);
            int loopSayi=10;
        }
       // System.out.println(i);
        // loopSayi=10;


    }
        public static  void method1(){
       // sayi=20;
        // String isim="Ali Can";
            System.out.println(kurs);
           // System.out.println(level);

        }
        public  void method2() {
     //   sayi=20;
       //  isim="Ali";
            System.out.println(kurs);
            System.out.println(level);
        }

}
