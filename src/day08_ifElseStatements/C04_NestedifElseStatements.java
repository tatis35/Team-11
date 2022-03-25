package day08_ifElseStatements;


import java.util.Scanner;

public class C04_NestedifElseStatements {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println(" Lütfen cinsiyetinizi giriniz" +
                "\nKadin icin K \nErkek icin E harfini giriniz");

        char cinsiyet = scan.next().toUpperCase().charAt(0);

        System.out.println("Lütfen yasinizi giriniz");

        double yas = scan.nextDouble();


        if (cinsiyet == 'K') ;
        {
            if (yas < 0 || yas > 120) {
                System.out.println("Lütfen girdiginiz yas grubunu kontrol edin");

            } else if (yas < 60) {
                System.out.println("emekli olamazsin \n" + (60 - yas) + " yil calisman gerekiyor");

            } else {
                System.out.println("Emekli olabilirsin. Keyfini cikar :) ");

            }
        }
            if (cinsiyet == 'E') {
                if (yas < 0 || yas > 120) {
                    System.out.println("Lütfen girdiginiz yas grubunu kontrol edin");

                } else if (yas < 65) {
                    System.out.println("emekli olamazsin \n" + (65 - yas) + " yil calisman gerekiyor");

                }
                else if (yas > 65) {
                    System.out.println("Emekli olabilirsin. Keyfini cikar :) ");

                }


            }
        }
    }


