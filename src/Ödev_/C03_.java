package Ödev_;

public class C03_ {

    public static void main(String[] args) {
        /* TASK :
        Girilen bir stringdeki a harfi sayısını bulunuz.
        ama  c harfine  gelirse döngüden çıkılsın
        Bugün hava oldukca güzel.-> 2
         str.CharAt(0)
         */
        String str = "Bugün  hava oldukca güzel";
        int count = 0;
        for (int i = 0; i<=str.indexOf('c'); i++) {
            if (str.charAt(i) == 'a') {
                count++;
            }
        }
        System.out.println("String'deki 'a' harfi sayiyi : " + count);

    }
}

