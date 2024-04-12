package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = scanner.nextLine();

        System.out.print("How many hours did you work? ");
        double hours = scanner.nextDouble();

        System.out.print("What is your payrate? ");
        double payrate = scanner.nextDouble();

        double grosspay = hours * payrate;


        System.out.println("Hello, " + name);

        System.out.println("Your payrate is " + grosspay);
    }
}
