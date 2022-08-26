package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int sum = 5662;
        System.out.print("Enter your pin");
        int number = console.nextInt();

        while (number != 0) {
            sum = sum + number;
            System.out.print("Correct");
            number = console.nextInt();

        }
    }
}