import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.5 */

        /* zad.1 podziel swój wiek przez modulo 3 i jeśli twój wiek zwraca 0 wyświetl napis "Podzielny przez 3",
         * w innym wypadku "Niepodzielny przez 3" użyj kontrukcji if else
         * */
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj swoj wiek: ");
        int wiek = scan.nextInt();
        if (wiek % 3 == 0) {
            System.out.print("Podzielny przez 3\n");
        } else {
            System.out.print("Niepodzielny przez 3\n");
        }


        /* zad.2 użyj parametru trójargumentowego aby sprawdzić parzystośc nr. indeksu */
        System.out.print("Podaj numer albumu:\n ");
        int nrAlbumu = scan.nextInt();
        int wynik = (nrAlbumu % 2 == 0) ? 1 : 0;
        System.out.print(wynik);

        /* zad.3 wpisz z klawiatury liczbę zmiennoprzecinkową (użyj klasy Scanner z poprzednich ćwiczeń)
         * i stwórz konstrukcję else if z dowolnymi komunikatami */
        System.out.print("Podaj liczbe: ");
        int liczba = scan.nextInt();

        if (liczba < 4) {
            System.out.print("Liczba jest mniejesza od 5");
        } else if (liczba > 14) {
            System.out.print("Liczba jest wieksza od 14");
        } else if (liczba == 9) {
            System.out.print("Liczba jest rowna 9");
        } else {
            System.out.print("Wykonał sie else");
        }


    }
}
