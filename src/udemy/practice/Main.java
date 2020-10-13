package udemy.practice;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        maxAndMinLoopChallenge();

    }

    public static void maxAndMinLoopChallenge() {

        Scanner scanner = new Scanner(System.in);

        int max = 0;
        int min = 0;

        while(true) {
            System.out.println("Enter Number #: ");
            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt) {
                int numEntered = scanner.nextInt();

                if(numEntered < max && numEntered > min) {
                    min = numEntered;
                } else if (numEntered > max) {
                    min = max;
                    max = numEntered;
                }
                System.out.println("min >> " + min);
                System.out.println("max >> " + max);
                if(max > 0 && min > 0) {
                    System.out.println("Min #: " + min + "; " + "Max #: " + max );
                    break;
                }
            } else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine();
        }
        scanner.close();
    }
}
