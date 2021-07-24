import hjelpeklasser.*;
public class Program {
    public static void main (String ... args){
        int [] a = Tabell.randPerm(20); // en tilfeldig tabell
        for (int k : a) System.out.print(k + " ");

        int m = Tabell.maks(a); // finner posisjinen til den største verdi
        System.out.println("\nStørste verdi ligger på plass " + m);

        int m1 = Tabell.maks(a, -5, -5);
        System.out.println("Posisjonen til størst verdien i arrayet er: " + m1);
    } // main
} // class Program
