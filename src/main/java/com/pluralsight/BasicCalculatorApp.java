package com.pluralsight;

import java.util.*;

public class BasicCalculatorApp {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double firstNumber = sc.nextDouble();
//        sc.nextLine();

        System.out.println("Enter the second number: ");
        double secondNumber = sc.nextDouble();
        sc.nextLine();

        System.out.println("Here are possible calculations: ");
        System.out.println(" (A)dd");
        System.out.println(" (S)ubtract");
        System.out.println(" (M)ultiply");
        System.out.println(" (D)ivide");


//---------------FIRST SOLUTION---------------------
//        char operation = sc.next().charAt(0);
//
//        double result;
//
//        switch (operation) {
//            case 'A':
//            case 'a':
//                result = firstNumber + secondNumber;
////                System.out.println(firstNumber + " + " + secondNumber + " = " + result);
//                System.out.printf("%.2f + %.2f = %.2f ", firstNumber, secondNumber, result);
//                break;
//            case 'S':
//            case 's':
//                result = firstNumber - secondNumber;
////                System.out.println(firstNumber + " - " + secondNumber + " = " + result);
//                System.out.printf("%.2f - %.2f = %.2f ", firstNumber, secondNumber, result);
//                break;
//            case 'M':
//            case 'm':
//                result = firstNumber * secondNumber;
////                System.out.println(firstNumber + " * " + secondNumber + " = " + result);
//                System.out.printf("%.2f * %.2f = %.2f ", firstNumber, secondNumber, result);
//                break;
//            case 'D':
//            case 'd':
//                result = firstNumber / secondNumber;
////                System.out.println(firstNumber + " / " + secondNumber + " = " + result);
//                System.out.printf("%.2f / %.2f = %.2f ", firstNumber, secondNumber, result);
//        }

//-------------SECOND SOLUTION-----------------
        String calc = sc.nextLine();

        //Possible Calculation Options Using If

        if (calc.equalsIgnoreCase("Add") || calc.equalsIgnoreCase("A")) {
            System.out.println(firstNumber + secondNumber);
        }
        if (calc.equalsIgnoreCase("Subtract") || calc.equalsIgnoreCase("S")) {
            System.out.println(firstNumber - secondNumber);
        }
        if (calc.equalsIgnoreCase("Multiply") || calc.equalsIgnoreCase("M")) {
            System.out.println(firstNumber * secondNumber);
        }
        if (calc.equalsIgnoreCase("Divide") || calc.equalsIgnoreCase("D")) {
            System.out.println(firstNumber / secondNumber);
        }
        else {
            System.out.println("Please choose one of the options: (A)dd, (S)ubtract, (M)ultiply, (D)ivide");
        }
    }
}
