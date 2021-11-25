import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.2 pętle for */

        /* zad.1 Napisz program który będzie iterował od 100 do 0,
         *  i wyświetlał liczby które są podzielne przez ostatnią cyfrę waszego indeksu
         * (jesli tą liczbą jest 0 to przez 2 ostatnie) */

//        for (int i=100;i>0;i--){
//            if(i % 7 == 0){
//                System.out.print("liczba " +i );
//                System.out.print("  ");
//                System.out.println("jest podzielna przez ostanią cyfre mojego indeksu czyli 7");
//            }
//        }

//        for (int i = 100 ; i>0;i--){
//            if(i%3==0){
//                System.out.printf("\n" + i + " ta liczba jest podzielna przez 3");
//            }
//
//        for (int i = 100; i > 0 ; i--){
//            if(i%10==0){
//                System.out.println(i);
//            }
//        }


        /* zad.2 Napisz program który będzie uzupełniał tablicę 5-cio elementową int[] liczbami
         * wprowadzanymi z klawiatury (użyć klasy Scanner), a następnie będzie wyświetlał elementy tablicy
         * za pomocą pętli forEach powiększone o 11 */

//        int[] tab1 = new int[5];
//        Scanner skan = new Scanner(System.in);
//        for (int i=0; i<5 ; i++){
//            System.out.printf("podaj %d liczbę  " ,i+1);
//            tab1[i]= skan.nextInt();
//        }
////        System.out.printf("%d ,%d ,%d ,%d ,2%d" , tab1[0],tab1[1],tab1[2],tab1[3],tab1[4]);
//
//        for (int a:tab1)
//        { a= a + 11;
//            System.out.println(a);



//        int[] tab1 = new int[5];
//        Scanner skan= new Scanner(System.in);
//        for (int i = 0; i < 5; i++){
//            System.out.printf("podaj %d liczbę", i +1);
//            tab1[i]= skan.nextInt();
//        }
//        System.out.println(tab1[0]+" " +tab1[2]);


//        int[] tab2 = new int[5];
//        Scanner skan = new Scanner(System.in);
//        for(int i = 0; i<5 ; i++){
//            System.out.printf("podaj %d liczbe " , i+1);
//            tab2[i] = skan.nextInt();
//        }
//        System.out.println(tab2[1] +" " + 1tab2[2]);

        Scanner skan = new Scanner(System.in);
        int liczba;
        int odpowiedz;
        do {
            System.out.println("podaj liczbę");
            liczba = skan.nextInt();

            switch (liczba) {
                case 1:
                    System.out.println("jeden");
                    return;
                case 2:
                    System.out.println("dwa");
                    return;
            }
            System.out.println("jeśli chcesz powtórzyć wybierz 0");
            odpowiedz= skan.nextInt();
        }while(odpowiedz == 0);










    }










}
