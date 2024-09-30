package com.pluralsight;

import java.util.Scanner;

public class BasicCalculatorApp2 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){

        double firstNumber = promptForFloat("Enter the first number: ");
        double secondNumber = promptForFloat("Enter the second number: ");
        String option = promptForOperationType();






        if (option.equalsIgnoreCase("Add") || option.equalsIgnoreCase("A")) {
            doAdd(firstNumber, secondNumber);
        }
        else if (option.equalsIgnoreCase("Subtract") || option.equalsIgnoreCase("S")) {
            doSubtract(firstNumber, secondNumber);
        }
        else if (option.equalsIgnoreCase("Multiply") || option.equalsIgnoreCase("M")) {
            doMultiply(firstNumber, secondNumber);
        }
        else if (option.equalsIgnoreCase("Divide") || option.equalsIgnoreCase("D")) {
            doDivide(firstNumber, secondNumber);
        }
        else {
            System.out.println("Please choose one of the options: (A)dd, (S)ubtract, (M)ultiply, (D)ivide");
        }
    }

    public static String promptForOperationType(){
        System.out.println("Here are possible calculations: ");
        System.out.println("  (A)dd");
        System.out.println("  (S)ubtract");
        System.out.println("  (M)ultiply");
        System.out.println("  (D)ivide");

        String calc = sc.nextLine();
        return calc;
    }

    public static double promptForFloat (String prompt){
        System.out.print(prompt);
        double num = sc.nextDouble();
        sc.nextLine();
        return num;
    }

    public static void doAdd(double a, double b) {
        double result = a + b;
//        System.out.printf("%f + %f = %f", a, b, result);
        System.out.println(a + " + " + b + " = " + result);
    }

    public static void doSubtract(double a, double b) {
        double result = a - b;
        System.out.printf("%f - %f = %f", a, b, result);
        System.out.println();
    }

    public static void doMultiply(double a, double b) {
        double result = a * b;
        System.out.printf("%f - %f = %f", a, b, result);
        System.out.println();
    }

    public static void doDivide(double a, double b) {
        double result = a / b;
        System.out.printf("%f - %f = %f", a, b, result);
        System.out.println();
    }
}
