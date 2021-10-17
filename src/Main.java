import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


//        int zmiennaInt = 7;
//        System.out.println("zmienna int = " + zmiennaInt);
        /* ćw.2 */

        /*   zad.1 zadeklaruj i zainicjalizuj zmienne różnych typów i wyświetl w konsoli (im więcej tym lepiej ;) ) */
        byte zmiennaByte = 120;
        System.out.println(zmiennaByte);
        short zmiennaShort = 2137;
        System.out.println(zmiennaShort);
        int zmiennaInt = 32123;
        System.out.println(zmiennaInt);
        long zmiennaLong = 3215342643L;
        System.out.println(zmiennaLong);
        float zmiennaFloat = 22.15f;
        System.out.println(zmiennaFloat);
        double zmiennaDouble = 213.32145;
        System.out.println(zmiennaDouble);
        boolean zmiennaBoolean = false;
        System.out.print(zmiennaBoolean);
        char zmiennaChar = 'T';
        System.out.println(zmiennaChar);

        /*
        *    zad.2 Napisz kod który będzie wykonywał operacje: dodawania, odejmowania,
        *    mnożenia, dziealenia i modulo na zmiennych:
        *    a) liczbaA i liczbaB, dowolne liczby calkowite (int),
        *    b) liczbaX i liczbaY, dowolne liczby zmiennoprzecinkowe (double)
        *  */
        String s = "Zadanie 2";
        System.out.println(s);
        int LiczbaA = 20;
        int LiczbaB = 17;

        int Dodawanie = LiczbaA + LiczbaB;
        System.out.println(Dodawanie);
        int Odejmowanie = LiczbaA - LiczbaB;
        System.out.println(Odejmowanie);
        int Mnozenie = LiczbaA * LiczbaB;
        System.out.println(Mnozenie);
        int Dzielenie = LiczbaA / LiczbaB;
        System.out.println(Dzielenie);

        double LiczbaX = 21.5;
        double LiczbaY = 11.3;

        System.out.println("Zadanie 2B");

        double DodawanieXY = LiczbaX + LiczbaY;
        System.out.println(DodawanieXY);
        double Odejmowanie2 = LiczbaX - LiczbaY;
        System.out.println(Odejmowanie2);
        double Mnozenie2 = LiczbaX * LiczbaY;
        System.out.println(Mnozenie2);
        double Dzielenie2 = LiczbaX / LiczbaY;
        System.out.println(Dzielenie2);


    }
}
