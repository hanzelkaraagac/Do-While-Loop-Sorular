package dowhileloop;

import java.util.Scanner;

public class KullanicidanIsminiAlinizIlkHarfininBuyukHarfOlupOlmadiginiKontrolEdiniz {
    public static void main(String[] args) {

        //example 2: Kullanicidan ismini aliniz ilk harfinin buyuk harf olup olmadigini kontrol ediniz.

        Scanner input = new Scanner(System.in);


        do {
            System.out.println("Lutfen Isminizi giriniz");

            char ilkHarf = input.next().charAt(0);

            if (ilkHarf>='A' && ilkHarf<='Z') {
                System.out.println("ismini basariyla girdiniz");
            } else {
                System.out.println("Ismi yanlis girdiginiz icin isleminiz iptal edilmistir");
                break;
            }

        } while (true);

    }
}
