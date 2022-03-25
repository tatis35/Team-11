package day12_StringManipilation;

public class
C05_replace {

    public static void main(String[] args) {

        String str="Bugun ne cok sey ogrendik";

        // Bu cümlede bosluk disindaki karakter sayisini bulunuz

        System.out.println(""+str.replace( " ","").length());

        System.out.println(str.length());

        str=str.replace("Bugun","Yarin");

        str=str.replace("ogrendik","ogrenecegiz");

        System.out.println("kalici degisiklikten sonra"+str);

        str.replace("ne cok","ne az");

        System.out.println();


    }
}
