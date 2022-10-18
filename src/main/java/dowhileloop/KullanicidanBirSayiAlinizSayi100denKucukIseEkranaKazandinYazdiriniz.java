package dowhileloop;

import java.util.Scanner;

public class KullanicidanBirSayiAlinizSayi100denKucukIseEkranaKazandinYazdiriniz {
    public static void main(String[] args) {

        //Example 1: kullanicidan bir sayi aliniz, sayi 100'den kucuk ise ekrana "Kazandin!" yazdiriniz.
        //           Aksi halde ekrana "Kaybettin!" yazdiriniz.
        //           Kullanici kazandikca oyun devam etmeli.

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 100'den kucuk bir sayi giriniz");
        int sayi =0;

        do {
            System.out.println("Bir sayi giriniz");
            sayi = input.nextInt();

            if (sayi<100) {
                System.out.println("Kazandin!");
            }

        } while (sayi<100);
            System.out.println("Kaybettin!");

    }
}
