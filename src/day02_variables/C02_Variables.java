package day02_variables;

public class C02_Variables {

    public static void main(String[] args) {

// Java calismaya main method'dan baslar
        // sonra yukaridan asagi, soldan saga dogru calisir
        // eger istersek bir variable'i once declare edip sonra deger atayabiliriz

        // Java deger atamasi yapmadigimiz bir variable olusturmamiza itiraz etmez
        // ancak deger atamasi yapincaya kadar o variable'i kullanmamiza izin vermez

        String okulIsmi;
        okulIsmi="Yildizkoleji";
        System.out.println("Yildiz Koleji");
        okulIsmi="StarKoleji";
        System.out.println(okulIsmi);
        // println ile print arasindaki fark
        //println dediginizde yazdirma isleminden sonra alt satira gecerken
        // sadece print dedigimizde yazdirma isleminden sonra alt satira gecmez
        okulIsmi="Java Koleji";
        System.out.println(okulIsmi);

    }
}
