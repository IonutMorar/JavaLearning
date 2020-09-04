package Laborator2;

import java.util.Random;
import java.util.Scanner;

public class Exercise7 {
    public static int generateARandom() {
        Random r = new Random();
        int a = r.nextInt(7);
        return a;
    }

    public static void main(String[] args) {
        int[] ucl = new int[]{1, 2, 3, 4, 5, 6, 7, 13};
        int[] answers = new int[]{10, 4, 2, 1, 2, 1, 1, 1};
        int times = generateARandom();

        System.out.println("How many teams win UCL trophy " + ucl[times] + " times");
        Scanner sc = new Scanner(System.in);
        int userChoise;
        int nrOfTriesLeft = 3;
        do {
            userChoise = sc.nextInt();
            if (answers[times] != userChoise) {
                System.out.println("Wrong answer! ");
                nrOfTriesLeft--;
                System.out.println("Number of tries left are: " + nrOfTriesLeft);
            }
        }
        while (answers[times] != userChoise && nrOfTriesLeft > 0);
        if (answers[times] == userChoise)
            System.out.println("Well done! "+userChoise + " teams win UCL trophy " + ucl[times]+ " times");
        else
            System.out.println("You Lose! The corect answer was : "+answers[times]);
    }
}
