package com.mycompany.array;

import java.util.Scanner;

public class MaximumAndMinimumNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] number = new int[5];

        System.out.print("Enter 5 numbers : ");

        for (int i = 0; i < 5; i++) {

            number[i] = input.nextInt();
        }

        int maximum = number[0];
        int minimum = number[0];
        for (int i = 1; i < 5; i++) {

            if (maximum < number[i]) {
                maximum = number[i];
            }
            if (minimum > number[i]) {
                minimum = number[i];
            }
        }
        System.out.println("Maximum number = " + maximum);
        System.out.println("Minimum number = " + minimum);

    }

}
