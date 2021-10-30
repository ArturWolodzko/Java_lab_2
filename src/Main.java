import java.util.*;

public class Main {

    public static void wyswietlanie(ArrayList<String> lista1){
        for(String element : lista1){
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

        ArrayList<String> zwierzęta = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        for (int i= 0; i<5; i++){
        System.out.println("podaj imię");
        zwierzęta.add(scan.nextLine());}
        wyswietlanie(zwierzęta);
        zwierzęta.remove(3);
        zwierzęta.remove(zwierzęta.size()-1);
        for (int i = 0 ; i<3 ; i++){
        System.out.println("podaj  następne imiona:");
        zwierzęta.add(scan.nextLine());}
        System.out.print(zwierzęta + " wielkość listy wynosi: ");
        System.out.print(zwierzęta.size()+ "\n");
        zwierzęta.sort(Collections.reverseOrder());
        wyswietlanie(zwierzęta);




         /* zad.2 Napisać program który stworzy Set<Integer> i wprowadzamy 10 liczb z klawiatury
                niech liczby się powtarzają, proszę posortować a następnie wyświetlić zawartość set-a w konsoli
                 a następnie przeiterować i wyświetlić forEach-em (jak wyżej)
         */


    }

}
