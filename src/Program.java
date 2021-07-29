import hjelpeklasser.*;
public class Program {
    public static void main (String ... args){
      /*  int [] a = Tabell.randPerm(12); // en tilfeldig tabell
        for (int k : a) System.out.print(k + " ");

        int m = Tabell.maks(a); // finner posisjinen til den største verdi
        System.out.println("\nStørste verdi ligger på plass " + m);

        Tabell.snu(a,0,11);
        System.out.println();
        System.out.println(6/2 );
        System.out.println(5/2);*/
        System.out.println("**********************");
        System.out.println("enkel Test av programkode 1.2.4 a - nestMask metoden)");
        int [] c = Tabell.randPerm(20);
        int [] d = Tabell.nestMaks(c);
        Tabell.skrivln(c);
        Tabell.skrivln(d);
        int maks = Tabell.nestMaks(c)[0] ; // returner posisjonen til største verdi i tabellen
        int nm = Tabell.nestMaks(c)[1]; // returnerer posisjonen til nest største verdi i tabellen
        System.out.println("Største verdien i tabellen er: " +c[maks]  + " og ligger i plassen: " + maks);
        System.out.println("Største verdien i tabellen er: " +c[nm]  + " og ligger i plassen: " + nm);

    } // main
} // class Program
