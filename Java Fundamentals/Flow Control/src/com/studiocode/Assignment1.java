package com.studiocode;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args){
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the input: ");
        number = input.nextInt();
        if(number > 0){
            System.out.println("Positive");
        }else if(number == 0){
            System.out.println("Zero");
        }else{
            System.out.println("Negative");
        }

        int firstInput, secondInput;
        System.out.println("Enter the First Input: ");
        firstInput = input.nextInt();
        System.out.println("Enter the Second Input: ");
        secondInput = input.nextInt();

        int a = firstInput%10;
        int b = secondInput%10;

        if (a==b){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
}
