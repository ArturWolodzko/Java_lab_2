import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void uzupełnianieTablicy(int[] tab1, int wartosc) {
        for (int i = 0; i < 20; i++) {
            tab1[i] = 40 - i * wartosc;
        }
    }

    public static void wyswietlTablice(int[] tab1) {
        for (int i = 0; i < 20; i++) {
            System.out.println("wartość zmiennej o indeksie " + i + " wynosi " + tab1[i]);
        }
    }

    public static void imionaTablica(String[] tab2) {
        Scanner skan = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            System.out.println("podaj imię;");
            tab2[i] = skan.nextLine();
        }
    }

    public static void wyswietlanie(String[] tab2) {
        for (int j = 5; j >= 0; j--) {
            System.out.println(tab2[j]);
        }
    }

    public static void imie(String imie) {
        System.out.println("imie " + imie);

    }
    public static void imieNazwisko(String imie ,String nazwisko) {
        System.out.println("imię i nazwisko : "+ imie + " " + nazwisko);

    }

    public static void imieNazwiskoWiek(String imie , String nazwisko , int wiek) {
                System.out.printf("imie naziwsko i wiek : " + imie + " " + nazwisko+ " lat " + wiek );
    }

    public static int dodawanie1(int liczba1, int liczba2){
        System.out.printf( "\nsuma dodawania %d+%d wynosi %d",liczba1,liczba2,(liczba1+liczba2) );
        return (liczba1+liczba2);
    }
    public static int dodawanie2(int liczba1, int liczba2, int liczba3){
        System.out.printf("\nsuma dodawania %d+%d+%d wynosi %d",liczba1,liczba2,liczba3,(liczba1+liczba2+liczba3));
        return (liczba1+liczba2+liczba3);
    }






//    public static void dodawanieLiczb(){
//        Scanner skan = new Scanner(System.in);
//        int a;
//        int b;
//        System.out.println("podaj liczbę");
//        a = skan.nextInt();
//        System.out.println("podaj drugą liczbę");
//        b = skan.nextInt();
//        System.out.println("wynik wynosi :"+( a + b));
//    }
//
    public static void main(String[] args) {
//        /* ćwiczenie 5 Metody */

        /* zad.1
        a) stworzyć tablicę typu int[20],
        b) napisać metodę która będzie uzupełniała tablicę wartościami od 40 do 20,
        c) napisać metodę, która wypisze otrzymane wartości,
        d) wstawić wywołanie metody do metody main
        */

//       int[] tablica1 = new int[20];
//        int[] tablica2 = new int[20];
//        int[] tablica3 = new int[20];
//        int[] tablica4 = new int[20];
//        int[] tablica5 = new int[20];

      // uzupełnianieTablicy(tablica1 , 5);
      // wyswietlTablice(tablica1);
      // dodawanieLiczb();
        //uzupełnianieTablicy(tablica2, 2);
       // wyswietlTablice(tablica2);

        /* zad.2
        a) stworzyc tablicę typu String[6],
        b) napisać metodę która uzupełni tablicę wartościami podawanymi z klawiatury
            (użyć do tego pętli i klasy Scanner),
        c) napisać metodę która wyświetli elementy tablicy od ostatniego elementu do elementu o indeksie 0,
        */
//        String[] tablica2 = new String[6];
//        imionaTablica(tablica2);
//        wyswietlanie(tablica2);


        /* zad.3
        a) napisać metodę która przyjmuje 1 parametr typu String, metoda nic nie zwraca, tylko
            wyświetla w konsoli string który ma być waszym imieniem,
        b) napisać metodę o tej samej nazwie jak w punkcie a) z 2-oma parametrami typu String, która wyświetli
            wasze imie i nazwisko,
        c) napisać metodę o tej samej nazwie jak w punkcie a) i b) która przyjmuje wasze imie,
            nazwisko i wiek (int), a następnie wszystko wyświetli,
        */
        //a
//        imie("artur");
//        imieNazwisko("artur","wolodzko");
//        imieNazwiskoWiek("artur", "wolodzko", 21);



        /* zad.4
        a) napisać metodę która przyjmuje 2 parametry typu int i zwraca ich sumę, którą przypiszemy do zmiennej,
            coś takiego:                                    zmiennaA = metoda(1, 2); <-- wywołanie metody
        b) napisać metodę (nazwa ta sama co w punkcie a) która przyjmuje 3 parametry typu int i zwraca ich sumę,
            którą przypiszemy do zmiennej, coś takiego:     zmiennaB = metoda(7, 8, 9); <-- wywołanie metody
        c) wyświetlić sumę wywołań obu metod ---> print("wynik: " + (metoda(8, 9) + metoda(2, 3, 4));
        */
        int wynik1;
        int wynik2;

        wynik1 = dodawanie1(5,5);
        wynik2 = dodawanie2(5,6,7);
        System.out.println("\nwynik=" + (dodawanie1(7,5) + dodawanie2(5,8,7)));
        System.out.println("\nwynik="+ (wynik1+wynik2));


    }

}
