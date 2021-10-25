public class Main {

    public static void main(String[] args) {

        /* cw.4  */

        /* zad.1 napisać 3 pętle for i użyc:
        a) w pierwszej pętli break
        b) w drugiej pętli continue
        c) w trzeciej pętli return
        */

//        for (int i = 0  ; i <= 100 ; i++) {
//            if (i == 5)
//                break;
//            System.out.println(i +" ");
//        }

        for (int j = 0 ; j <= 10 ; j++){
            if (j == 3)
                continue;
            System.out.println(j +" ");
        }

        for (int k = 30 ; k <= 40 ; k++){
            if (k == 34)
                return;
            System.out.println(k + "");
        }


    }
}
