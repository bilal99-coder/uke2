package hjelpeklasser;
import java.util.*;

public class Tabell
{
    private Tabell() {} // privat standardkonstruktør - hindrer instansiering

    public static void bytt(int [] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    // metode som returnerer et tabbel av størrelse n som har kun forskjellige elementer i seg a:[1,n>
    public static int [] randPerm(int n){
        int [] a = new int [n];
        Random r = new Random();
        Arrays.setAll(a, i -> i+1);
        for (int k = n-1; k > 0; --k)
        {
            int i = r.nextInt(k+1); // tilfeldig tall fra 0 til k
            bytt(a, k, i);
        }
        return a;
    }

    // metode som en permutert versjon av et gitt array
    public static int [] randPerm(int [] a)
    {
        Random r = new Random();
        for (int k = a.length ; k> 0 ; k--){
            int i = r.nextInt(k-1);
            bytt(a, k, i);
        }
        return a;
    }

    // metoden som returnerer posisjonen til den største verdien i et intervall
    public static int maks(int [] a, int fra, int til){
        if(fra < 0 || til> a.length || fra > til)
        {
            throw new IllegalArgumentException("Illegalt intervall");
        }
        int m = fra; // indeks til maks verdi
        int maks_verdi = a[fra];

        for(int i = fra ; i< til ; ++i){
            if(a[i] > maks_verdi){
                 m = i;
                maks_verdi = a[m] ;
            }
        }
           return m;
    }

    // metode som returnerer posisjonen til største verdien i et tabell
    public static int maks(int []a){
        return maks(a, 0, a.length);
    }

    // metode som finner posisjonen til den minste verdien i en tabellsintervall
    public static int min(int [] a, int fra, int til)
    {
        if(fra < 0 || til > a.length || fra > til) // skjekker for illegale argumenter
        {
            throw new IllegalArgumentException("Illegalt intervall");
        }
        int m = fra; // indeks til minste verdien
        int min_verdi = a[fra]; // minste verdien
        for (int i = fra + 1 ; i < til ; ++i){
            if (a[i] < min_verdi)
            {
                m = i;            // indeks til minste veriden opppdateres
                min_verdi = a[m]; // minste verdien oppdateres
            }
        }
        return m;
    }

    // metode som finner posisjonen til minste verdien i en tabell
    public static int global_min(int [] a)
    {
        return min(a, 0, a.length);
    }


    // metoden skal bytte om innholdet i posisjon i og j  i char-tabellen
    public static void bytt(char[] c, int i, int j)
    {
        char perm = c[i];
        c[i] = c[j];
        c[j] = c[i];
    }

    // metoden skal skrive ut tallene i intervallet a[fra:til> til konsollet
    public static void skriv(int [] a, int fra, int til){
        String out = fra +"";
        for (int i = fra +1 ; i < til ; i++) {
            out += " " +i;
        }
        System.out.println(out);
    }

    // metoden skal skrive ut hele tabellen - alle på én linje, en blank mellom hvert tall
    public static void skriv(int [] a){
        skriv(a, 0, a.length);
    }

    public static void skrivln(int []a ,int fra, int til){
        skriv(a,fra,til);
        System.out.println();
    }
    public static void skrivln(int [] a){
        skriv(a, 0, a.length);
        System.out.println();
    }


    // metoden skal skrive ut char-ene i intervallet c[fra:til> til konsollet
    public static void skriv(char [] c, int fra, int til){
        String out = fra +"";
        for (int i = fra +1 ; i < til ; i++) {
            out += " " +i;
        }
        System.out.println(out);
    }

    // metoden skal skrive ut hele tabellen - alle på én linje, en blank mellom hvert char
    public static void skriv(char [] c){
        skriv(c, 0, c.length);
    }

    // skrivln metode fungerer på samme måte som skriv-metoden men utskriften skal avsluttes med et linjeskift
    public static void skrivln(char [] c ,int fra, int til){
        skriv(c,fra,til);
        System.out.println();
    }
    public static void skrivln(char [] c){
        skriv(c, 0, c.length);
        System.out.println();
    }

    public static int [] naturligeTall(int n)
    {
        if(n< 1) throw new IllegalArgumentException("Illegalt argument");
        int [] a = new int [n];
        Arrays.setAll(a, i -> i+1);
        return a;
    }

    public static int[] naturligeTall(int fra, int til){
        if (fra> til ) throw new  IllegalArgumentException("Illegalt argument");
        if (fra == til) return new int [0];
        int [] a = new int [til-fra];
        int j = 0;
        for (int i = fra  ;i<til; i++) {
            a[j] = i;
            j++;
        }
        return a;
    }


}
