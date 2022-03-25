package day16_MethodCreation;

public class C04_forLoop {
    public static void main(String[] args) {
        // verilen string'i tersten yazdiran bir kod yaziniz
        String str = "Java cok zevkli";
        for (int i = str.length()-1 ; i >=0 ; i--) {
            System.out.print(str.substring(i,i+1));
        }
    }
}
