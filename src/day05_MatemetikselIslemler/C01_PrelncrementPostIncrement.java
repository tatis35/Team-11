package day05_MatemetikselIslemler;

public class C01_PrelncrementPostIncrement {

    public static void main(String[] args) {

        int sayi=10;

        sayi++;
        System.out.println(sayi);

        sayi++;
        System.out.println(sayi);

        System.out.println("pre-increment satirinda" + ++sayi);
        System.out.println("pre-increment sonra"+sayi);
        System.out.println("pre-increment sonra"+sayi++); // önce yazdirdigi icin sonra artirir alt satirda artirir bu satir 13 alt satir 14
        System.out.println("pre-increment satirindan sonra"+ sayi );
    }
}
