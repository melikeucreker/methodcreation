package JavaPractice;

import java.util.Scanner;

public class C05_ {
    /*
     Kullanicidan main method icinde bir tamsayi alin. Girilen sayinin pozitif tam
     bolenlerin toplamini  bulup bize donduren bir method olusturun.

   */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfn pozitif bir tamsayi giriniz.");
        int sayi = scan.nextInt();
        System.out.println(pozitifTamBolenleriniBul(sayi));


    }

    public static int pozitifTamBolenleriniBul(int sayi) {
        int toplam = 0;
        for (int i = 1; i <= sayi; i++) {
            if (sayi % i == 0) {
                toplam += i;
            }

        }

        return toplam;
    }

}
