package JavaPractice;

import java.util.Scanner;

public class C02_ {
    static String duzenliStr="";

    public static void main(String[] args) {
        // Kullanicidan main method icinde ayri ayri isim ve soyismini alin
        // Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
        //isim bosluk soyisim seklinde bize donduren bir method olusturun

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen adinizi giriniz");
        String name = scan.nextLine();
        System.out.println();
        System.out.println("Lutfen soyadinizi giriniz: ");

        String surname = scan.nextLine();
        System.out.println(isimSoyIsimYazdir(name, surname));
    }



    public static String isimSoyIsimYazdir(String name, String surname) {
        name=name.toUpperCase().charAt(0)+name.substring(1).toLowerCase();
        surname=surname.toUpperCase().charAt(0)+surname.substring(1).toLowerCase();


        duzenliStr=name+" "+surname;
        return duzenliStr;

    }
}