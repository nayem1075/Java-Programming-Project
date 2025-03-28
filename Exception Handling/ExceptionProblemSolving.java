package com.mycompany.exceptionhandling;

import java.util.Scanner;

public class ExceptionProblemSolving {

    public static void main(String[] args) {

        //We don't know how many time it exxecute.So we use while loop
        while (true) {
            try {
                Scanner user = new Scanner(System.in);
                System.out.print("Please Enter num1 : ");
                int num1 = user.nextInt();
                System.out.print("Please Enter num2 : ");
                int num2 = user.nextInt();
                int result = num1 / num2;
                System.out.println("Result : " + num1 + "/" + num2 + " = " + result);
            } catch (Exception e) {
                System.out.println("Exception : " + e);
                System.out.println("You must enter integer.Please try again");
            }
        }

    }

}
