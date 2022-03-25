package day22_Arrays;

public class C05_BirnarySearch {

    public static void main(String[] args) {
        // Verilen array'de istenen bir elementin var olup olmadigini tree/false yazdirarak
        // gösteren bir method

        int arr[]= {3,5,6,1,9,45,25,4,9,0};
        int istenenSayi=1;

        istenenElemanVarMi(arr,istenenSayi);

    }

    private static void istenenElemanVarMi(int[] arr, int istenenSayi) {

        boolean sonuc=false;


        for ( int i = 0; i <arr.length ; i++) {
            if (arr[i] == istenenSayi){
                sonuc=true;
                break;

            } else {
                System.out.println("Böyle birsey yok");
                break;

            }
        }

        System.out.println(sonuc);

    }
}
