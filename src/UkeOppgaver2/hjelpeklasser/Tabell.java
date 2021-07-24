package UkeOppgaver2.hjelpeklasser;
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
        for (int k = n-1; k> 0; k--)
        {
            int i = r.nextInt(k-1); // tilfeldig tall fra 0 til k
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




    public static void main(String[] args) {
        int[] a = {11,5,8,6,99,2,1,8,55,1,4,3,6,25,8,2,78,30};
        System.out.println(global_min(a));
        System.out.println(a[global_min(a)]);

    }
}
