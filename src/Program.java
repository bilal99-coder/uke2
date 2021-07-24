import hjelpeklasser.*;
public class Program {
    public static void main (String ... args){
        int [] a = Tabell.randPerm(12); // en tilfeldig tabell
        for (int k : a) System.out.print(k + " ");

        int m = Tabell.maks(a); // finner posisjinen til den største verdi
        System.out.println("\nStørste verdi ligger på plass " + m);

        Tabell.snu(a,0,11);
        System.out.println();
        System.out.println(6/2 );
        System.out.println(5/2);


    } // main
} // class Program
