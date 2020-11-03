package edu.escuelaing.arep.model;

public class PrimeFinder {
    public static int search(String arg) {
        int rango = Integer.parseInt(arg);
        int primos = 0;
        for (int i = 2; i <rango; i++) {
            if (PrimeFinder.isPrime(i)){
                primos+=1;
            }

        }
        return primos;

    }
    public static boolean isPrime(int numero){
        int n = 2;
        boolean isPrime=true;
        int k = numero/2+1;
        while ((isPrime) && (n!=k)){
            if (numero % n == 0)
                isPrime = false;
            n++;
        }
        return isPrime;
    }
}
