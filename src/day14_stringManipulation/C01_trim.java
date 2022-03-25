package day14_stringManipulation;
import java.util.Locale;
public class C01_trim {
// trim= kenar bosluklarini yok eder


        public static void main(String[] args) {
            String str= "   Siz ne derseniz deyin, Java bildigini okur.   ";
            str.trim(); // atama yapilmadigi icin eski hali ile devam eder
            System.out.println(str); //    Siz ne derseniz deyin, Java bildigini okur.   bosluklu
            System.out.println(str.length()); // 49


            str=str.trim();
            System.out.println(str); //Siz ne derseniz deyin, Java bildigini okur. bosluksuz
            System.out.println(str.length()); // 43
        }


}
