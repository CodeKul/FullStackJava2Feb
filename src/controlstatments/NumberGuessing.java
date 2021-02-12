package controlstatments;

import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args) {

        int number;
        int guess;
        int trials = 0;

        Scanner scanner = new Scanner(System.in);
        number = (int) (Math.random() * 100 + 1);

        do {
            System.out.println("Enter the Number");
            guess = scanner.nextInt();
            trials++;
            if (guess > number) {
                System.out.println("Number is High");
            } else if (guess < number) {
                System.out.println("Number is Low");
            } else {
                System.out.println("You guess Correct in trials" + trials);
            }
        } while (guess != number);

    }
}
