package UkeOppgaver2;

public class Tabell {

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
