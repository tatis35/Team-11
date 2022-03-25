package day27_Constructor;

public class ToyataRunner {
    public static void main(String[] args) {

        Toyata t1 = new Toyata();

        System.out.println(t1.marka); // Toyota
        System.out.println(t1.tekerAdedi); // 4
        System.out.println(t1.model);// null

        t1.model = "Corolla";
        t1.yakit = "Benzin";
        t1.yil = 2022;
        t1.maxHiz();

        System.out.println("T1 model: " + t1.model + ", yakit: " + t1.yakit + ", yil: " + t1.yil);

        Toyata t2 = new Toyata();
        System.out.println(t2.marka); // Toyota
        System.out.println(t2.tekerAdedi); // 4
        System.out.println(t2.model);// null

        t2.model = "Corolla";
        t2.yakit = "Benzin";
        t2.yil = 2022;
        System.out.println("T2 model: " + t2.model + ", yakit: " + t2.yakit + ", yil: " + t2.yil);
        t2.renkTercihleri();
    }
}