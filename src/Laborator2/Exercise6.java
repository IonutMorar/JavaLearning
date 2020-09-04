package Laborator2;

import java.util.Scanner;

public class Exercise6 {
    public static int[] generateVector(int n){

        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 2;

        for (int i = 2; i < arr.length; i++){
            arr[i] = arr[i-2] * arr[i-1];
        }

        return arr;
    }
    public static int[] generateRandomVectorRecursively(int n){
        if (n <= 2){
            return generateRandomVectorRecursively(n);
        }
        return generateRandomVectorRecursively((n-2) * (n-1));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int n = sc.nextInt();

        int[] vectorNonRecursively = generateVector(n);
        System.out.println("Random generate vector non-recursively is: ");
        for (int i = 0; i < vectorNonRecursively.length; i++){
            System.out.print(vectorNonRecursively[i]+",");
        }

        int[] vectorRecursively = generateRandomVectorRecursively(n);
        System.out.println("Random vector recursively is: ");
        for (int i = 0; i < vectorRecursively.length; i++){
            System.out.print(vectorRecursively[i]+",");
        }
    }
}
