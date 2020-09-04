package Laborator2;

import java.util.Scanner;

public class Exercise3 {
    public static boolean isPrimeNumber(final int number){
        if (number <= 1)
            return false;
        for (int i = 2; i < number; i++)
            if(number % i == 0 ) {
                return false;
            }
        return true;
    }

    static void printPrime(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (isPrimeNumber(i))
                System.out.print(i + " ");
        }
    }

    public static int calculateSumOfDigits(int number){
        int sum = 0;
        while (number != 0){
            sum = sum + number % 10;
            number = number / 10;
        }
        return sum;
    }
    public static int[] getPrimeNumbersFromInterval(int a, int b){
        int[] arr = new int[b - a];
        int nrOfPrimes = 0;
        for (int i = a; i <= b; i++) {
            if (isPrimeNumber(i)) {
                arr[nrOfPrimes] = i;
                nrOfPrimes++;
            }
        }
        int[] array = new int[nrOfPrimes];
        System.arraycopy(arr,0,array,0,nrOfPrimes);
        return array;
    }
    public static double calculateGeometricMean(int[] primeNumber){
        double product = 1;
        for(int i = 0; i < primeNumber.length; i++){
            product = product * primeNumber[i];
        }
        double geometricMean = Math.pow(product, (double) 1/primeNumber.length);
        return geometricMean;
    }
    public static int numberOfPrimeNumbersWithEvenSumOfDigits(int[] primeNumbers){
        int nrOfPN = 0;
        for (int i = 0; i < primeNumbers.length; i++){
            if(calculateSumOfDigits(primeNumbers[i]) % 2 == 0)
                nrOfPN++;
        }
        return nrOfPN;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The left end of interval is: ");
        int a = sc.nextInt();
        System.out.println("The right end of interval is: ");
        int b = sc.nextInt();
        System.out.println("Prime numbers in interval " + a+ "," +b + " are:");
        printPrime(a,b);
        System.out.println();
        System.out.println("The geometric mean is: "+calculateGeometricMean(getPrimeNumbersFromInterval(a,b)));
        System.out.println("The number of prime numbers which have sum of digits an even number is: "+numberOfPrimeNumbersWithEvenSumOfDigits(getPrimeNumbersFromInterval(a,b)));
    }
}
