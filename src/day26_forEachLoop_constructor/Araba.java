package day26_forEachLoop_constructor;

public class Araba {

    // Jaava'da her class olusturdugumuzda
  //  Java o class'dan ileride objeler uretmek gerekecegini bilir
    // ve bo öyellikle belirtmesek de Java
    // her olusturdugu class'a bir constructor koyar


    // Java'nin class olsutururken class'a koydugu constructor'a
    // DEFAULT CONSTRUCTOR denir ve bu constructor görünmez

    // eger biz görünür constructor'imiz olsun istersek
    // default constructor ile ayno görevi yapan bir construktor olusturabiliriz
    // veya istersek ayni kaliotan farkli desenlerde objeler olusturmak
    // icin farkli özelliklerde construktorlar da olusturabiliriy

    // construktor'lari birbirinden farklilastiran tek ayricalik kullanilan
    // parametre sayisi ve parametre turudur


    public Araba(){
        System.out.println("Parametresiz Constructor calisti");

    }

    // bir kod blogunun method veya construcktor olmasindan emin olmak istiyorsaniz
    // iki seye dikkat etmelisiniz
    // 1- Constructorlar'in ismi class ismi ile ayni olmak zorundadir
    // yani büyük harfle baslar
    // 2- Construktor'larin return tyoe'i olmaz


    // özetle : constructorlarin adi class adi ile ayni olmali ve return type'i olmamali
public Araba(String renk) {
    System.out.println(renk+ "  renkli bir araba üretildi");
}
public Araba(int yil){
    System.out.println(yil+" model bir araba üretildi");
}
public  Araba(double vites){
    System.out.println(vites+ " vites arabaniz");
}
public  Araba(int yil,String renk,double vites) {
    System.out.println(yil+" model "+renk+ " renginde araba üretildi "+ vites+ " vites arabaniz");
}

}