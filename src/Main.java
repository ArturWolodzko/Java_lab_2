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

        int liczba1;
        Scanner skan = new Scanner(System.in);

        do {

            System.out.println("podaj liczbę");
            liczba1 = skan.nextInt();
            switch (liczba1 % 2) {
                case 0:
                    System.out.println("liczba jest parzysta");
                    break;
                default:
                    System.out.println("liczba nie parzysta");
                    break;
            }
         System.out.println("czy chcesz powtórzyć jeśli tak wybierz 1");
        int odpowiedz;
        odpowiedz = skan.nextInt();}

        while

        /* zad.2
           a) napisać program podobny do programu z przykładu, który ma zliczyć iloś liter 'o', 'p', 'x', 'z', 'q' w wyrazie:
            "ooooozjoonoxoooozoooooooooozoxooooopnpppoooiiooooomnzooooxoqoojoozoootyoooozoooxoooozooooxooooooojoooopxoooonnmooo"
           b) oraz ma określić ile jest pozostałych liter, które nie należą do: 'o', 'p', 'x', 'z', 'q'
         */

    }
}
