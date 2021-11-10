import java.util.*;

public class Main {

    public static void wyswietlanie(ArrayList<String> lista1) {
        for (String element : lista1) {
            System.out.println(element);
        }
    }


    public static void main(String[] args) {

        /* ćw_6 Listy */

        /* zad.1 a) Napisać program który stworzy listę ArrayList<String> (lista tablicowa),
                Proszę dane wprowadzać z klawiatury (można użyć pętli), lista ma mieć przynajmniej 5
                elementów i elementami mają być nazwy zwierząt.
                b) proszę stworzyć metodę która będzie miała pętle forEach i będzie wyświetlała elementy Listy
                -- podpowiedź: for(String zmienna : List<String>)
                c) proszę usunąć 2 ostatnie elementy listy i dodać do niej 3 inne elementy,
                następnie wyświetlić listę i wielkość listy,
                d) następnie proszę wykonać odwrotne sortowanie i znów użyć metody z punktu b) do wyświetlenia
                elementów listy
          */

//        ArrayList<String> zwierzęta = new ArrayList<>();
//        Scanner scan = new Scanner(System.in);
//        for (int i= 0; i<5; i++){
//        System.out.println("podaj imię");
//        zwierzęta.add(scan.nextLine());}
//        wyswietlanie(zwierzęta);
//        zwierzęta.remove(3);
//        zwierzęta.remove(zwierzęta.size()-1);
//        for (int i = 0 ; i<3 ; i++){
//        System.out.println("podaj  następne imiona:");
//        zwierzęta.add(scan.nextLine());}
//        System.out.print(zwierzęta + " wielkość listy wynosi: ");
//        System.out.print(zwierzęta.size()+ "\n");
//        zwierzęta.sort(Collections.reverseOrder());
//        wyswietlanie(zwierzęta);




        /////////////////////////////////////////////////////////////





//        ArrayList<String> imiona = new ArrayList<>();
//        Scanner skan = new Scanner(System.in);
//        for (int i = 0; i < 5; i++) {
//            System.out.println("podaj imię");
//            imiona.add(skan.nextLine());
//        }
//        wyswietlanie(imiona);
//        imiona.remove(3);
//        imiona.remove(2);
//        for (int i =0; i <4 ; i ++){
//            System.out.println("podaj kolejne imiona");
//            imiona.add(skan.nextLine());
//        }
//        wyswietlanie(imiona);
//        System.out.println( "liczba elementów tej liczby wynosi:" +imiona.size());

        //////////////////////////////////////////////////






//        Set<Integer> liczby1 = new TreeSet<>();
//        Scanner skan = new Scanner(System.in);
//        for (int i = 0; i < 10; i++)
//        {
//            System.out.println("podaj liczbę");
//            liczby1.add(skan.nextInt());
//        }
//        System.out.println(liczby1);

///////////////////////////////////////////////////////////////////////////




        Set<Integer> liczby1= new TreeSet<>();
        Scanner skan = new Scanner(System.in);
        for(int i =0;i<6;i++){
            System.out.printf("podaj %d liczbę",i+1);
            liczby1.add(skan.nextInt());
        }
        System.out.println(liczby1);

    }
}







         /* zad.2 Napisać program który stworzy Set<Integer> i wprowadzamy 10 liczb z klawiatury
                niech liczby się powtarzają, proszę posortować a następnie wyświetlić zawartość set-a w konsoli
                 a następnie przeiterować i wyświetlić forEach-em (jak wyżej)
         */


//        Set<Integer> liczby1 = new TreeSet<Integer>();
//        Scanner skan = new Scanner(System.in);
//        for (int i = 0; i < 10; i++) ;
//        {
//            System.out.println("podaj liczbę");
//            liczby1.add(skan.nextInt());
//        }
//        System.out.println(liczby1);

//
//        Set<Integer> liczby1 = new TreeSet<>();
//        Scanner skan = new Scanner(System.in);
//        for (int i = 0; i < 10; i++)
//        {
//            System.out.println("podaj liczbę");
//            liczby1.add(skan.nextInt());
//        }
//        System.out.println(liczby1);
//
//        Set<Integer> aaa = new TreeSet<>();
//        Scanner tt = new Scanner(System.in);
//        for (int index = 0; index < 10; index++) {
//            aaa.add(tt.nextInt());
//        }
//
//
//    }
//
//}
