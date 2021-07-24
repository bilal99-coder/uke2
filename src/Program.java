import hjelpeklasser.*;
public class Program {
    public static void main (String ... args){
        int [] a = Tabell.randPerm(20); // en tilfeldig tabell
        for (int k : a) System.out.print(k + " ");

        int m = Tabell.maks(a); // finner posisjinen til den største verdi
        System.out.println("\nStørste verdi ligger på plass " + m);
    } // main
} // class Program
