package it.figuccia;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dividend, divisor;
        while (true) {
            while (true) {
                System.out.print("Please enter the dividend: ");
                if (input.hasNextInt()) {
                    dividend = input.nextInt();
                    input.nextLine(); // consume the newline character
                    break;
                } else {
                    System.out.println("The value is not valid, please enter an integer.");
                    input.nextLine(); // consume the invalid input
                }
            }
            while (true) {
                System.out.print("Please enter the divisor: ");
                if (input.hasNextInt()) {
                    divisor = input.nextInt();
                    input.nextLine(); // consume the newline character
                    if (divisor != 0) {
                        System.out.println("The quotient is: " + (dividend / divisor));
                    } else {
                        System.out.println("It's not possible to divide by zero.");
                    }
                    break;
                } else
                    System.out.println("The value is not valid, please enter an integer.");
                input.nextLine(); // consume the invalid input
            }

        }
    }
}
