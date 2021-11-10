import java.util.Scanner;

public class Main {

    private static int[] tablica;

    public static void main(String[] args) {

        /* ćwiczenie 3 switch case */

        /* zad.1 napisać program który przyjmuje jedną liczbę od użytkownika z klawiatury
          i za pomocą switch case default ma określić czy:
          a) ta liczba jest parzysta --> podpowiedz switch(a % 2) {
          b) program który określi czy liczba jest podzielna przez 7
         */

//        int liczba1;
//        Scanner skan = new Scanner(System.in);
//
//
//            System.out.println("podaj liczbę");
//            liczba1 = skan.nextInt();
//            switch (liczba1 % 2) {
//                case 0:
//                    System.out.println("liczba jest parzysta");
//                    break;
//                default:
//                    System.out.println("liczba nie parzysta");
//                    break;
//            }


//        int liczba1;
//        Scanner skan = new Scanner(System.in);
//
//        System.out.println("podaj liczbę");
//        liczba1= skan.nextInt();
//
//        switch (liczba1 % 7){
//            case 0:
//                System.out.println("liczba jest podzielna przez 7");
//                break;
//            default:
//                System.out.println("liczba nie jest podzielna przez7");
//                break;
//        }

//        int liczba1;
//        Scanner skan = new Scanner(System.in);
//        int odpowiedz;
//        do {
//            System.out.println("podaj liczbę;");
//            liczba1 = skan.nextInt();
//            switch (liczba1 % 2) {
//                case 0:
//                    System.out.println(liczba1 + " jest parzysta");
//                    break;
//                default:
//                    System.out.println(liczba1 + " nie jest parzysta");
//                    break;
//            }
//            System.out.println("czy chcesz powtórzyć ? jeśli tak wciśnij 1");
//            odpowiedz=skan.nextInt();
//        }while ( odpowiedz==1);


        /* zad.2
           a) napisać program podobny do programu z przykładu, który ma zliczyć iloś liter 'o', 'p', 'x', 'z', 'q' w wyrazie:
            "ooooozjoonoxoooozoooooooooozoxooooopnpppoooiiooooomnzooooxoqoojoozoootyoooozoooxoooozooooxooooooojoooopxoooonnmooo"
           b) oraz ma określić ile jest pozostałych liter, które nie należą do: 'o', 'p', 'x', 'z', 'q'
         */

//        String text = "ooooozjoonoxoooozoooooooooozoxooooopnpppoooiiooooomnzooooxoqoojoozoootyoooozoooxoooozooooxooooooojoooopxoooonnmooo";
//        int[] tab1 = {0,0,0,0,0,0};
//        for(char zmiennaChar : text.toCharArray()){
//            switch ((zmiennaChar)){
//                case 'o':
//                    ++tab1[0];
//                    break;
//                case'p':
//                    ++tab1[1];
//                    break;
//                case 'x':
//                    ++tab1[2];
//                    break;
//                case 'z':
//                    ++tab1[3];
//                    break;
//                case 'q':
//                    ++tab1[4];
//                    break;
//                default:
//                    ++tab1[5];
//                    break;
//            }
//
//        }System.out.printf("\n dane litery występują tyle razy \n o występuje %d razy  \n p występuje %d razy " +
//                        "\n x występuje %d razy \n z występuje %d razy \n q występuje %d razy \n reszta liter = %d", tab1[0],
//                tab1[1],tab1[2],tab1[3],tab1[4],tab1[5]);


//        String text="Do banku w Szwajcarii wchodzi klient z walizką i ściszonym głosem mówi do bankiera:\n" +
//                "- Chciałbym wpłacić pieniądze, w tej walizce jest całe cztery miliony euro.\n" +
//                "Na to bankier uśmiechnięty:\n" +
//                "- Proszę nie ściszać głosu, bieda to żaden wstyd.";
//        int[] tab1={0,0,0,0,0};
//        for(char zmiennaChar : text.toCharArray()){
//            switch ((zmiennaChar)){
//                case 'a':
//                    ++tab1[0];
//                    break;
//                case 'o':
//                    ++tab1[1];
//                    break;
//                case'w':
//                    ++tab1[2];
//                    break;
//            }
//        }
//        System.out.printf("w tekście znajduje sie \n%d liter a \n%d liter o \n%d liter w "
//                ,tab1[0],tab1[1],tab1[2]);

        System.out.println("podaj tekst");
        Scanner skan= new Scanner(System.in);
        String text = skan.nextLine();
        int[] tab1 = { 0,1,2,};
        for(char zmiennaChar : text.toCharArray() ){
            switch (zmiennaChar){
                case 'a':
                    ++tab1[0];
                    break;
                case'b':
                    ++tab1[1];
                    break;
                case'c':
                    ++tab1[2];
                    break;

            }

        }System.out.printf("w twoim tekscie litera :\na występuje %d razy \nb wystepuje %d razy \nc wystepuje %d razy"
                ,tab1[0],tab1[1],tab1[2]);

    }
}
