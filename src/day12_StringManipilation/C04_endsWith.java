package day12_StringManipilation;

public class   C04_endsWith {

    public static void main(String[] args) {


        String email="mehmet@gmail.com";
        String arananMetin="@gmail.com";

        if (!email.contains(arananMetin)){
            System.out.println("lutfen gmail adresinizi giriniz");

        } else if (email.endsWith(email)){

            System.out.println("Email adresiniz kaydedildi");
        } else {
            System.out.println("lütfen yazimi kontrol ediniz");
        }

    }
}
