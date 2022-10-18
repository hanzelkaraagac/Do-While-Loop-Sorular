package dowhileloop;

public class DoWhileLoopKullanimi {
    public static void main(String[] args) {

        //While-loop body'si icindeki kodun hic calistirilmama ihtimali vardir.
        //zero execution mumkundur
        int i = 1;

        while (i<1){
            System.out.println("While loop");// "zero execution" mumkundur
            i++;
        }

        System.out.println();

        //do-while loop'un body'si icindeki kod en az bir kere calisir.
        //zero execution mumkun degildir
        int k = 1;

        do {
            System.out.println("do-while loop"); // "zero execution" mumkun degildir
            //do-while loop kullandiginizda loop body'si icindeki kod en az bir kere calisir.


            k++;

        }while (k<1);



    }
}
