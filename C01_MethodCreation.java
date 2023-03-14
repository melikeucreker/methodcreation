package JavaPractice;

import java.util.Scanner;

public class C01_MethodCreation {
    static String output="";

    public static void main(String[] args) {
        /*Kullanicidan input olarak verilen bir String, baslangic ve bitis indexlerine gore
        baslangic index'i dahil, bitis index'i haric olacak sekilde aradaki harfleri yazdiran
        bir method olusturun.
                - kullanici baslangic degeri olarak, bitis degerinden buyuk bir sayi girerse, hata
        mesaji verin
        - kullanici str'da olan index'lerden daha buyuk bir index girerse hata mesaji
        yazdirin

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen string bir ifade giriniz.");
        String input =scan.nextLine();

        stringdekiHarfleriYazdir(input,1,8);

    }

    public static void stringdekiHarfleriYazdir(String input, int baslangic, int bitis) {

        if (baslangic>bitis){
            System.out.println("Hata:Baslngıc degeri,bitisten buyuk olamaz!");

        }
        if (baslangic>input.length()-1 || bitis>input.length()-1){
            System.out.println("Hata:girilen deger stringin sınırları dısında bir degerdir.");

        }
            input = input.replace(" ", "");
            for (int i = baslangic; i < bitis; i++) {
                output += input.charAt(i) + " , ";

            }
            System.out.println(output);

        }
    }

