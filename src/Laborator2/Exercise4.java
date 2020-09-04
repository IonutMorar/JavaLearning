package Laborator2;

public class Exercise4 {
    public static boolean isPrimeNumber (final int number){
        if(number <= 1)
            return false;
        for (int i = 2; i < number; i++)
            if (number % i == 0) {
                return false;
            }
        return true;
    }
    static void printPrime(int[] someNumbers) {
        for (int i = 0; i < someNumbers.length; i++) {
            if (isPrimeNumber(someNumbers[i]))
                System.out.print(someNumbers[i] + " ");
        }
    }
    public static int firstOdd (int[] someNumbers){
        int poz = 0;
        int firstOdd = 0;
        for (int i = 0; i <= someNumbers.length; i++){
            if (someNumbers[i] % 2 != 0){
                firstOdd = someNumbers[i];
                poz = i;
                break;
            }
        }
        System.out.println("Position of first Odd number is: "+poz);
        return firstOdd;
    }
    public static int firstEven (int[] someNumbers){
        int poz = 0;
        int firstEven = 0;
        for (int i = 0; i <= someNumbers.length; i++){
            if(someNumbers[i] % 2 == 0){
                firstEven = someNumbers[i];
                poz = i;
                break;
            }
        }
        System.out.println("Position of first Even number is: "+poz);
        return firstEven;
    }
    public static int firstPrime(int[] someNumbers){
        int poz = 0;
        int firstPrime = 0;
        for (int i = 0; i <= someNumbers.length; i++){
            if(isPrimeNumber(someNumbers[i])){
                firstPrime = someNumbers[i];
                poz = i;
                break;
            }
        }
        System.out.println("Position of first Prime number is: "+poz);
        return firstPrime;
    }

    public static void main(String[] args) {
        int[] someNumbers = new int[]{27, 35, 25, 22, 21, 17, 57, 141, 563, 16};
        System.out.println("Primes numbers in array are: " );
        printPrime(someNumbers);
        System.out.println();
        System.out.println("First Odd number is: "+firstOdd(someNumbers));
        System.out.println("First Even number is: "+firstEven(someNumbers));
        System.out.println("First Prime number is: "+firstPrime(someNumbers));
    }
}
