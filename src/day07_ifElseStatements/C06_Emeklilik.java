package day07_ifElseStatements;

import java.util.Scanner;

public class C06_Emeklilik {

    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);

        System.out.println("lutfen yasinizi Giriniz");

        int emekliYasi=scan.nextInt();

        if (emekliYasi >= 65){
            System.out.println("Emekli olabilirsin");

    } else {
            System.out.println("Emekli olabilirsin");
            System.out.println(65-emekliYasi + " sene daha calismalisin" );}

        }
}
