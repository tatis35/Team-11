package day13_stringManipulation;

public class C01_substrings {
    public static void main(String[] args) {


        String str = "Java ile IT cok guzel";

        System.out.println(str.substring(5));

        // yukaridaki String'i Mehmet Hoca ile It cok guzel

        System.out.println(str.replace("java","Mehmet Hoca" ));

        System.out.println("Mehmet Hoca"+str.substring(5));


        System.out.println(str.substring(0,5));
        System.out.println(str.substring(0,1));
        String harf=str.substring(5,6);
        System.out.println(harf);

        str="Java gun gectikce guzellesiyor";

        System.out.println(str.substring(7,7)); // hiclik döndurur

        System.out.println(str.substring(str.length()-1));

        System.out.println(str.substring(str.length()-5));

        System.out.println(str.substring(str.length()));







    }
}