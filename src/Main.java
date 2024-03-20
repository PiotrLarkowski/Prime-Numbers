public class Main {
    public static void main(String[] args) {
        PrimeNumbersSearcher primeNumbersSearcher = new PrimeNumbersSearcher();
        int primeNumber = 0;
        for (int i = 0; i < 1000; i++) {
            primeNumber = primeNumbersSearcher.primeNumberGenerator(1000);
            System.out.println(primeNumber);
        }

    }
}