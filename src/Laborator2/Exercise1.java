package Laborator2;

import java.util.Random;
import java.util.Scanner;

public class Exercise1 {
    public static int[] getUserNumbers() {
        Random r = new Random();
        int a = r.nextInt(10 - 2) + 2;
        System.out.println("Enter " + a + " numbers: ");
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            Scanner sc = new Scanner(System.in);
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    protected static double computeTheArithmeticalMean(int[] userNumbers) {
        int s = 0;
        int n = userNumbers.length;
        for (int i = 0; i < n; i++) {
            s = s + userNumbers[i];
        }
        System.out.println("Sum of numbers are: " + s);
        return s / n;

    }

    public static void main(String[] args) {
        int[] userNumbers = getUserNumbers();
        System.out.println("Mean number is: " + computeTheArithmeticalMean(userNumbers));
    }
}
