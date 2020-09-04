package Laborator2;

import java.util.Scanner;

public class Exercise2 {
    private static int readNumberOfPoints(){
        System.out.println("Enter a number of points: ");
        Scanner sc = new Scanner(System.in);
        int numberOfPoints = sc.nextInt();
        return numberOfPoints;
    }
    public static String messageToUser(int numberOfPoints){
      String team;
        switch (numberOfPoints){
            case 49:
                team = "CFR Cluj";
                break;
            case 46:
                team = "Craiova";
                break;
            case 43:
                team = "FCSB";
                break;
            case 42:
                team = "Botosani";
                break;
            case 40:
                team = "Gaz Metan";
                break;
            case 39:
                team = "Astra";
                break;
            default:
                team = "No team from Liga1 have "+numberOfPoints+ " points";
        }
        return team;
    }

    public static void main(String[] args) {
        System.out.println("The message to show is: "+messageToUser(readNumberOfPoints()));
    }
}
