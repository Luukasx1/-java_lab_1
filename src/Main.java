import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.4 */

        /* zad.1 proszę dodać kilka złożonych operacji uzywając kilku operatorów arytmetycznych i logicznych */
        boolean a = true;
        boolean b = false;
        boolean c = true;
        System.out.println("Operatory arytmetyczne:" + "\n a = true\t b = false\t c = true");

        System.out.println("(c&&a): "+(c&&a));
        System.out.println("(b&&c): "+(b&&c));
        System.out.println("(a&&b): "+(a&&b));

        System.out.println("(b||c) :"+(b||c));
        System.out.println("(b||a) :"+(b||a));
        System.out.println("(false||b) :"+(false||b));
        System.out.println("(false||a) :"+(false||a));

        System.out.println("!((b&&c)||(!c||a!) :"+!((b&&c)||(!c||!a)));


        int x = 12;
        int y = 22;
        int z = 4;

        System.out.println("(x==y): "+(x==y));

        System.out.println("(x!=z): "+(x!=z));



    }
}
