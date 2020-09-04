package Laborator2;

import java.util.Random;

public class Exercise5 {
    public static int[] generateRandomNumber(){
        Random r = new Random();
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++){
            arr[i] = -1000 + (int) (Math.random()*((1000-(-1000))+1));
        }
        return arr;
    }
    public static int[] getSortedNumbers (int[] randomNumbers){  //Bubble sort
        int n = randomNumbers.length;
        for (int i = 0; i < n-1; i++)
            for(int j= 0; j < n-i-1; j++)
                if (randomNumbers[j] > randomNumbers[j+1]){
                    int aux = randomNumbers[j];
                    randomNumbers[j] = randomNumbers[j+1];
                    randomNumbers[j+1] = aux;
                }
        return randomNumbers;
    }

    public static void main(String[] args) {
        int[] randomNumbers = generateRandomNumber();
        System.out.println("Random generated numbers are: ");
        for (int i = 0; i < randomNumbers.length; i++){
            System.out.print(randomNumbers[i]+",");
        }
        System.out.println();
        int[] sortedNumbers = getSortedNumbers(randomNumbers);
        System.out.println("Sorted numbers are: ");
        for (int i = 0; i < sortedNumbers.length; i++){
            System.out.print(sortedNumbers[i]+",");
        }
    }
}
