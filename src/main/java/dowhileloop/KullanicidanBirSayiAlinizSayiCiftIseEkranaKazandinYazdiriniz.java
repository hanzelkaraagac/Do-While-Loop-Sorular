package dowhileloop;

import java.util.Scanner;

public class KullanicidanBirSayiAlinizSayiCiftIseEkranaKazandinYazdiriniz {
    public static void main(String[] args) {

        //Example 1: kullanicidan bir sayi aliniz, sayi Cift ise ekrana "Kazandin!" yazdiriniz.
        //           Aksi halde ekrana "Kaybettin!" yazdiriniz.
        //           Kullanici kazandikca oyun devam etmeli.

        Scanner input = new Scanner(System.in);
        System.out.println("==OYUN KURALLARI==");
        System.out.println("Cift giren \"Kazanir\" \nTek giren \"Kaybeder\"");

        int sayi = 0;

        do {
            System.out.println("Bir sayi giriniz");
            sayi = input.nextInt();

            if (sayi%2==0) {
                System.out.println("\"Kazandin!\"");
            }
        } while (sayi%2==0);
        System.out.println("\"Kaybettin!\"");
    }
}
