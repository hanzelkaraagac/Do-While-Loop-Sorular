package dowhileloop;

public class BirOndalikSayininOndalikKismindakiRakamlarininToplaminiBulunuz {
    public static void main(String[] args) {

        //Examle 1:bir ondalik sayinin ondalik kismindaki rakamlarinin toplamini bulunuz.
        //             24.5673 ==>    5+6+7+3 = 21

        double num = 24.5673;
        System.out.println(num);// ekranda 24.5673 gorunecek.

        String str = String.valueOf(num);//Double olan degerimizi String'e cevirdik.

        String ondalikKisim = str.split("\\.")[1];// String'e sevirdigimiz degeri "." dan itibaren kesip [1] ile sag tarafini aldik.

        int ondalikKisimlInt = Integer.valueOf(ondalikKisim);//String degerimizi Integer'e cevirdik. (Sag taraf ==> 5673)

        int sum = 0;
        do {
            sum = sum +ondalikKisimlInt%10;

            ondalikKisimlInt =  ondalikKisimlInt/10;

        } while (ondalikKisimlInt>0);

        System.out.println(sum);

        //Examle 1:bir ondalik sayinin ondalik kismindaki rakamlarinin toplamini bulunuz.
        //         31.1312 ==> 1+3+1+2 = 7

        Double num2 = 31.1312;

        String srr = String.valueOf(num2);

        String ondalikKismiAl = srr.split("\\.") [1];

        int ondalikKismiIntegerAl = Integer.valueOf(ondalikKismiAl);

        int toplam =0;

        do {
            toplam = toplam + ondalikKismiIntegerAl%10;

            ondalikKismiIntegerAl = ondalikKismiIntegerAl/10;

        } while (ondalikKismiIntegerAl>0);
        System.out.println(toplam);
    }
}
