import hjelpeklasser.*;
import jdk.swing.interop.SwingInterOpUtils;

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

        System.out.println("************ ____________************");
        System.out.println("bruke nestMaks v2");

        int maks_v2 = Tabell.nestMaks_v2(c)[0] ; // returner posisjonen til største verdi i tabellen
        int nm_v2 = Tabell.nestMaks_v2(c)[1]; // returnerer posisjonen til nest største verdi i tabellen

        if(maks == maks_v2 && nm == nm_v2) {
            System.out.println("maks( " + maks +") = maks_v2(" +maks_v2 + ") AND nm( " + nm + ") = nm_v2(" +nm_v2 +")");
        }
        else System.out.println("maks og maks_v2 er ikke like");

        System.out.println("Test 3 ********************");




    } // main
} // class Program
