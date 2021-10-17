import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.3 */

        /*  zad.1 napisać interfejs który bedzie słuzył do wpisania danych osobowych:
        *   a) Imię, nazwisko, wiek, nr indeksu,
        *   dane mają być wprowadzane z klawiatury w konsoli
        *   b) wyświetlić dane za pomocą println i printf
        */
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj imie: ");
        String s = scan.next();
        System.out.print("Podaj nazwisko: ");
        String x = scan.next();
        System.out.println("Twoje imie i nazwisko to: "+ s + " " + x);
        System.out.print("Podaj wiek: ");
        int wiek = scan.nextInt();
        System.out.print("Podaj nr albumu: ");
        int nrA = scan.nextInt();
        System.out.println("Twoj numer albumu to " + nrA);
        System.out.printf("Nazywasz sie %s i masz %d lata \n", s, wiek);

        /*  zad.2 zadeklarować 2 zmienne typu int i wykonać na nich obliczenia arytmetyczn (+, -, *, /, %)
        *   wynik wyświetlić w konsoli programu
        */
        System.out.print("Podaj 1 liczbe: ");
        int liczba1 = scan.nextInt();
        System.out.print("Podaj 2 liczbe: ");
        int liczba2 = scan.nextInt();

        int dodawanie = liczba1 + liczba2;
        int odejmowanie = liczba1 - liczba2;
        int mnozenie = liczba1 * liczba2;
        int dzielenie = liczba1 / liczba2;

        System.out.println("Wynik dodawania " + liczba1 + " i " + liczba2 + " to " + dodawanie);
        System.out.println("Wynik odejmowania " + liczba1 + " i " + liczba2 + " to " + odejmowanie);
        System.out.println("Wynik mnozenia " + liczba1 + " i " + liczba2 + " to " + mnozenie);
        System.out.println("Wynik dzielenia " + liczba1 + " i " + liczba2 + " to " + dzielenie);

    }
}
