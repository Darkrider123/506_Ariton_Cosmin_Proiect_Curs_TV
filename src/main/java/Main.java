public class Main {

    public static void main(String[] args) {

        Prime prime = new Prime();

        if (prime.isPrime(9))
            System.out.println("Prime: Number 9 is prime");
        else
            System.out.println("Prime: Number 9 is not prime");

        PrimeFlawed primeFlawed = new PrimeFlawed();
        if (primeFlawed.isPrime(13))
            System.out.println("PrimeFlawed: Number 13 is prime");
        else
            System.out.println("PrimeFlawed: Number 13 is not prime");
    }

}
