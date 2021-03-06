package hjelpeklasser;

import java.util.*;

public class Tabell {
    private Tabell() {
    } // privat standardkonstruktør - hindrer instansiering

    public static void bytt(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    // metode som returnerer et tabbel av størrelse n som har kun forskjellige elementer i seg a:[1,n>
    public static int[] randPerm(int n) {
        int[] a = new int[n];
        Random r = new Random();
        Arrays.setAll(a, i -> i + 1);
        for (int k = n - 1; k > 0; --k) {
            int i = r.nextInt(k + 1); // tilfeldig tall fra 0 til k
            bytt(a, k, i);
        }
        return a;
    }

    // metode som en permutert versjon av et gitt array
    public static int[] randPerm(int[] a) {
        Random r = new Random();
        for (int k = a.length; k > 0; k--) {
            int i = r.nextInt(k - 1);
            bytt(a, k, i);
        }
        return a;
    }

    // metoden som returnerer posisjonen til den største verdien i et intervall
    public static int maks(int[] a, int fra, int til) {

        if (a == null) throw new NullPointerException
                ("parametertabellen a er null!");
        fratilKontroll(a.length, fra, til);
        int m = fra; // indeks til maks verdi
        int maks_verdi = a[fra];

        for (int i = fra; i < til; ++i) {
            if (a[i] > maks_verdi) {
                m = i;
                maks_verdi = a[m];
            }
        }
        return m;
    }

    // metode som returnerer posisjonen til største verdien i et tabell
    public static int maks(int[] a) {
        return maks(a, 0, a.length);
    }

    // metode som finner posisjonen til den minste verdien i en tabellsintervall
    public static int min(int[] a, int fra, int til) {
        fratilKontroll(a.length, fra, til);
        int m = fra; // indeks til minste verdien
        int min_verdi = a[fra]; // minste verdien
        for (int i = fra + 1; i < til; ++i) {
            if (a[i] < min_verdi) {
                m = i;            // indeks til minste veriden opppdateres
                min_verdi = a[m]; // minste verdien oppdateres
            }
        }
        return m; // posisjonen til minste verdi i a[fra:til>
    }

    // metode som finner posisjonen til minste verdien i en tabell
    public static int global_min(int[] a) {
        return min(a, 0, a.length);
    }


    // metoden skal bytte om innholdet i posisjon i og j  i char-tabellen
    public static void bytt(char[] c, int i, int j) {
        char perm = c[i];
        c[i] = c[j];
        c[j] = perm;
    }

    // metoden skal skrive ut tallene i intervallet a[fra:til> til konsollet
    public static void skriv(int[] a, int fra, int til) {
        fratilKontroll(a.length, fra, til);
        if (til - fra > 0) System.out.print(a[fra]);

        for (int i = fra + 1; i < til; i++) {
            System.out.print(" " + a[i]);
        }

    }

    // metoden skal skrive ut hele tabellen - alle på én linje, en blank mellom hvert tall
    public static void skriv(int[] a) {
        skriv(a, 0, a.length);
    }

    public static void skrivln(int[] a, int fra, int til) {
        skriv(a, fra, til);
        System.out.println();
    }

    public static void skrivln(int[] a) {
        skrivln(a, 0, a.length);
    }


    // metoden skal skrive ut char-ene i intervallet c[fra:til> til konsollet
    public static void skriv(char[] c, int fra, int til) {
        fratilKontroll(c.length, fra, til);
        String out = c[fra] + "";
        for (int i = fra + 1; i < til; i++) {
            out += " " + c[i];
        }
        System.out.println(out);
    }

    // metoden skal skrive ut hele tabellen - alle på én linje, en blank mellom hvert char
    public static void skriv(char[] c) {
        skriv(c, 0, c.length);
    }

    // skrivln metode fungerer på samme måte som skriv-metoden men utskriften skal avsluttes med et linjeskift
    public static void skrivln(char[] c, int fra, int til) {
        fratilKontroll(c.length, fra, til);
        skriv(c, fra, til);
        System.out.println();
    }

    public static void skrivln(char[] c) {
        skrivln(c, 0, c.length);
    }

    public static int[] naturligeTall(int n) {
        fratilKontroll(n, 0, n);
        int[] a = new int[n];
        Arrays.setAll(a, i -> i + 1);
        return a;
    }

    public static int[] heleTall(int fra, int til) {
        if (fra > til) throw new IllegalArgumentException("fra(" + fra + ") > til(" + til + ")");
        if (fra == til) return new int[0];
        int[] a = new int[til - fra];
        for (int i = fra; i < til; i++) {
            a[i - fra] = i;
        }
        return a;
    }

    // Følgende metode tester om det halvåpne tabellintervallet a[fra:til> er lovlig

    public static void fratilKontroll(int tablengde, int fra, int til) {
        if (fra == til)
            throw new NoSuchElementException
                    ("fra(" + fra + ") = til(" + til + ") - tomt tabellintervall!");


        if (fra < 0)    // fra er negativ
            throw new ArrayIndexOutOfBoundsException
                    ("fra(" + fra + ") er negativ!");

        if (til > tablengde)   // til er utenfor tabellen
            throw new ArrayIndexOutOfBoundsException
                    ("til(" + til + ") > tablengde(" + tablengde + ")");

        if (fra > til)
            throw new IllegalArgumentException
                    ("fra(" + fra + ") > til(" + til + ") - illegalt intervall!");
    }

    public static void vhKontroll(int tablengde, int v, int h) {
        if (v < 0)
            throw new ArrayIndexOutOfBoundsException("v(" + v + ") < 0");

        if (h >= tablengde)
            throw new ArrayIndexOutOfBoundsException
                    ("h(" + h + ") >= tablengde(" + tablengde + ")");

        if (v > h + 1)
            throw new IllegalArgumentException
                    ("v = " + v + ", h = " + h);
    }

    //  Metoden skal snu rekkefølgen på verdiene i intervallet a[v:h]. Hvis intervallet f.eks. inneholder verdiene 4, 2, 13, 7, skal intervallet etter et kall på metodene inneholde 7, 13, 2, 4

    public static void snu(int[] a, int v, int h) {
        vhKontroll(a.length, v, h);
        for (int i = h; i > ((h - v) / 2); i--) {
            int temp = a[i];
            a[i] = a[h - i];
            a[h - i] = temp;
        }
        for (int k : a) {
            System.out.print(k + " ");
        }
    }

    // metoden skal snu reekkefølgen på verdien i tabellen
    public static void snu(int[] a) {
        snu(a, 0, a.length - 1);
    }

    public static void snu(char[] c, int v, int h) {
        vhKontroll(c.length, v, h);
        while (v < h) {
            bytt(c, v++, h--);
        }
    }

    public static void snu(char[] c) {
        snu(c, 0, c.length - 1);
    }


    // ******* oppgaver til avsnittet 1.2.4 *******

    // metode som finner posisjonen til den neste største verdien i en tabell
    // Metoden tar et array som argument, kaller på maks() for å finne posisjonen til den største veriden i tabellen.
    // Den nest største finner vi som den største blant resten av verdiene.
    // metoden returnerer et array som har posisjon til største verdi og til den neste største


    public static int[] nestMaks(int[] a) {
        int n = a.length; // tabellens lengde
        if (a.length < 2) // må ha minst to verdier
        {
            throw new NoSuchElementException("a.length (" + n + ")< 2!");
        }
        int mn; // posisjonen til den neste sørste verdien
        int m = maks(a);  // er posisjonen til største verdien
        if (m == 0) // største verdien ligger først
        {
            mn = maks(a, 1, n - 1); // leter i a[1: m>
        } else if (m == n - 1) // størst ligger bakkerst
        {
            mn = maks(a, 0, n - 1); // leter i a[0:n-1>
        } else {
            int mv = maks(a, 0, m); // leter i a[0:m>
            int mh = maks(a, m + 1, n); // leter i a[m+1,n>
            mn = a[mv] > a[mh] ? mv : mh; // hvem er størst?
        }
        return new int[]{m, mn}; // m i posisjonen 0, mn i posisjonen 1
    }

//  versjon 2 av nestmaks-metoden der du bytter om slik at den største kommer forrest.

    public static int[] nestMaks_v2(int[] a) {
        int n = a.length; // tabellens lengde
        if (a.length < 2) // må ha minst to verdier
        {
            throw new NoSuchElementException("a.length (" + n + ")< 2!");
        }
        int mn; // posisjonen til den neste sørste verdien
        int m = maks(a);  // er posisjonen til største verdien
        bytt(a, 0, m); // største verdien ligger først
        mn = maks(a, 1, n); // leter i a[1: n>

        if (mn == m) mn = 0; // den nest største lå opprinnelig forrest

        Tabell.bytt(a, 0, m); // bytter tilbake

        return new int[]{m, mn}; // m i posisjonen 0, mn i posisjonen 1
    }

    //Oppgave 3 Avsnitt 1.2.4
    public static int[] nestMaks_v3(int[] a) {
        int n = a.length; // tabellens lengde
        if (a.length < 2) // må ha minst to verdier
        {
            throw new NoSuchElementException("a.length (" + n + ")< 2!");
        }
        int mn; // posisjonen til den neste sørste verdien
        int m = maks(a);  // er posisjonen til største verdien
        bytt(a, n - 1, m); // største verdien ligger bakerst
        mn = maks(a, 0, n - 1); // leter i a[0: n-1>

        if (mn == m) mn = n - 1; // den nest største lå opprinnelig bakerest

        Tabell.bytt(a, n - 1, m); // bytter tilbake

        return new int[]{m, mn}; // m i posisjonen 0, mn i posisjonen 1

    }

    //Idéen i Oppgave 3 kan utvides til å bli en sorteringsalgoritme.
    public static void sortering(int[] a) {
        for (int i = a.length; i > 1; --i) {
            int m = maks(a, 0, i); // leter i a[0,i>
            bytt(a, m, i - 1);
        } // sortering // selection sort

    }
    // Vi bruker nå rekursjon
    // sortering med rekursjon
    public static void rek_sortering(int[] a, int a_length) {
        // a_length skal være lik a.length
        if(a_length == 1) return ;
        int m = maks(a,0,a_length); // leter i a[0:a_length>
        bytt(a,m,a_length-1);
        rek_sortering(a,a_length-1);

    } // Ferdig med seksjon 1.2.4

    // Avsnitt 1.2.13
    // ** Andre oppgaver fra dette avsnittet er lagt på noteboken **

    // Oppgave 1

    public static void nestMaks_Turnering (int [] a) //en turnering
    {
        int n = a.length; // for å forenkle notasjonen

        if (n < 2) // må ha minst to verdier!
            throw new IllegalArgumentException("a.length(" +n + ") < 2!");
        int [] b = new int [2*n]; // turneringstreet
        System.arraycopy(a,0,b,n,n); // legger a bakerst i b

        for (int k = 2*n-2; k >1;  k -=2) // lager turneringstreet
        { b[k/2] = Math.max(b[k],b[k+1]);}

        System.out.println(Arrays.toString(b));
        // setning som skriver ut tabellen b etter ut turneringen er gjennomført
        int maksverdi = b[1], nestmaksverdi = Integer.MIN_VALUE;

        // finner nå nestMaksverdi

        for (int m = 2*n -1, k = 2; k <m; k *=2)
        {
            int tempverdi = b[k+1]; // ok hvis maksverdi er b[k]
            if (maksverdi != b[k]) { tempverdi = b[k]; k++; }
            if (tempverdi > nestmaksverdi) nestmaksverdi = tempverdi;
        }

        System.out.println(Arrays.toString(new int [] {maksverdi, nestmaksverdi})); // størst og nest størst

    } // nestMaks_Turnering

    // Oppgave 2
    // La Programkode 1.2.13 a) returnere indeksene til størst og nest størst verdi.

   // ???
    // Oppgave 3
    public static void kopier (int [] a, int i, int [] b, int j, int ant)
    {
        for (int n = i + ant; i< n; ) b[j++] = a[i++];
    }
}
