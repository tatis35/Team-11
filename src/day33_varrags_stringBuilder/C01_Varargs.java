package day33_varrags_stringBuilder;

public class C01_Varrags {

    public static void main(String[] args) {

        // kac tane String verilirse verilsin
        // iclerinden en uzun olani yazdiran bir method olusturun


        String str="Ali";
        String str2="Veli";
        String str3="Oguzhan";
        String str4="Samet";

        enUzunKelime(str3,str2);
    }

    private static void enUzunKelime(String... str) {

        String enUzunStr="";

        for (String each: str){
            if (each.length()>enUzunStr.length()){
                enUzunStr=each;}

        }
        System.out.println("En uzun kelime : "+enUzunStr);


    }
}
