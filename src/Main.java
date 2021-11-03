public class Main {

    public static void main(String[] args) {

        /* cw.1 pętle while */

        /* zad 1 - Napisać za pomocą pętli do-while kod który będzie iterował od liczby 1000 w dół do 0.
          Jeśli liczba będzie podzielna przez 2 ostatnie cyfry waszego indexu (podać nr indexu)
          to dać komunikat "liczba XX podzielna przez YY" (XX-liczba podzielna YY-podzielnik)
        */

            /* Przykład.1 */

            /* Pętle while */
           /* int i = 10;
            while (i > 0) {
                System.out.println("i: " + i);
                --i;
            }

            i = 10;
            System.out.println("\n");
            while ((--i) > 0) {
                System.out.print("\nindex: " + i);
                if (i % 3 == 0) {
                    System.out.print(" - podzielna przez 3");
                }
            }
            */
           /*int i = 1000;
            while (i>0) {
                --i;
                System.out.println("\n");
                if (--i % 67) {
                    System.out.println("liczba podzielna przez 67");
                }
            }*/
      /* int i;

        i = 1000;
        System.out.println("\n");
        while (i > 0) {
            if (i % 67 == 0) {
                System.out.print("\nliczba " + i);
                System.out.print(" jest podzielna przez 67");

            }
            i--;
        }*/

//        int i =1000;
//        while (i>0){
//            if ( i % 30 == 0){
//                System.out.print("liczba"+i );
//                System.out.println("jest podzielna przez 30");
//
//            }i--;
//        }

//        int i = 100;
//        while(i>0){
//            if(i%2==0){
//                System.out.printf("\nliczba %d podzielna przez 2" ,i);
//            }i--;
//        }





        /* zad 2
        a) stworzyć tablicę typu int wielkosci 5, przypisac jej dowolne wartości,
          przeiterować tablicę po elementach i wyswietlić, użyć pętli while
        b) jak wyżej tylko dla tablicy typu double[],
        c) jak wyżej dla tablicy String[], przeiterować i wyświetlić od ostatniego elementu
        */

//        int tab1[]= { 7,2,21,4,9};
//        int i = 0;
//        while (i < 5){
//            System.out.println(tab1[i]);
//            i++;
//        }

//        int tab1[]={1,2,3,4,5,6,4,3,2,1,};
//        int i = 0 ;
//        while (i < 10){
//            System.out.println(tab1[i]);
//            i=i+2;
//        }

//        double tab1[]= {1.02 , 1.423, 3.564 , 5.123 , 102.4213};
//        int i=0;
//        while(i<5){
//            System.out.println(tab1[i]);
//            i++;
//        }


        String tab1[]={"artur","marek","stanisław","wojtek", "kamil"};
        int i =0;
        while(i<5){
            System.out.println(tab1[i]);
            i++;
        }

        /* zad.3
        a) sprawdzić jak zachowuje się pętla while gdy w jej warunku damy true --> while(true)
        b) a jak gdy damy false --> while(false)
        */


//        int i = 10;
//        while (true){
//            System.out.println(i);
//            i--;
//        }

//        int i = 10;
//        while(false){
//            System.out.println(i);
//            i--;
        }
    }

