package day28_Constructor;

public class StaticKeyword {

    static int sayi1;
    int sayi2;

    public  static void main(String[] args) {

        // Static variable'lar direk class'a baglidir.
        // class icerisinde yapilan her türlü degisiklik static variable'larda kalici olur.


        // Intance variable'lar ise obje'ye baglidir
        // intance variable'lara sadece obje üzerinden erisilebilir.
        // ve bir obje uzerinden erisilerek yapilan degisiklik
        // intance variable'in degerini tüm objeler icin kalici olarak degistirmez.
        // sadece o obje icin intance variable degerini kalici olarak degistirir.


        System.out.println("sayi1 : "+sayi1);
       // System.out.println("sayi2 : "+sayi2); static olmadigi icin main method'dan direk kullanilamaz

        StaticKeyword obj1 = new StaticKeyword();
        System.out.println(obj1.sayi2); //0

        sayi1++;
        obj1.sayi2++;
        System.out.println("sayi1 : "+sayi1); // 1
        System.out.println(obj1.sayi2); //1
        System.out.println(obj1.sayi1);// 1

        StaticKeyword obj2 = new StaticKeyword();

        System.out.println(obj2.sayi2);  // 0
        System.out.println(obj2.sayi1); //  1

        obj2.sayi1++;
        obj2.sayi2++;

        System.out.println(obj2.sayi2);  // 1
        System.out.println(obj2.sayi1); //  2

        obj1.sayi1++;
        obj1.sayi2++;

        System.out.println(obj1.sayi2);  // 1
        System.out.println(obj1.sayi1); //  2

        System.out.println(obj2.sayi2);  // 1
        System.out.println(obj2.sayi1); //  3
    }
}
