package ba.unsa.etf.rs;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {

    // Prvi
    public static void vrijednost(Function<Double,Double> funkcija){
        for (int i = 0; i <= 100 ; i++) {
            System.out.println(funkcija.apply((double) i));
        }
    }

    // Drugi
    private static int SumaCifara(int n){
        int suma = 0;
        int c = 0;

        while(n != 0){
            c = n % 10;
            suma = suma + c;
            n = n / 10;
        }
        return suma;
    }

    public static void main(String[] args) {

        // Prvi
        Double a,b,c;

        Scanner ulaz = new Scanner(System.in);

        System.out.println("Unesite a, b i c: ");

        a = ulaz.nextDouble();
        b = ulaz.nextDouble();
        c = ulaz.nextDouble();


        vrijednost(x -> a*x*x + b*x + c);

        // Drugi

        System.out.println("Unesite velicinu niza: ");

        int n;

        n = ulaz.nextInt();

        int niz[] = new int[n];

        System.out.println("Unesite clanove niza: ");

        for(int i=0 ; i<niz.length ; i++){
            niz[i] = ulaz.nextInt();
        }

        Arrays.sort(niz);

        System.out.println("Sortiran niz: ");

        for(int x : niz){
            System.out.println( x + " ");
        }

        // Treci

        System.out.println("Unesite velicinu niza: ");

        int v;

        v = ulaz.nextInt();

        int niz1[] = new int[v];

        System.out.println("Unesite clanove niza: ");

        for(int i=0 ; i<niz1.length ; i++){
            niz1[i] = ulaz.nextInt();
        }

        niz1 = Arrays.stream(niz1).boxed().sorted((e, f) -> SumaCifara(e) - SumaCifara(f)).mapToInt(i -> i).toArray();

        for (int q : niz) {
            System.out.println(q);
        }

    }
}
