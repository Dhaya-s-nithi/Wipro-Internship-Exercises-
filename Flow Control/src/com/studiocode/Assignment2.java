package com.studiocode;

import java.util.Scanner;

public class Assignment2 {

    public static void main(String[] args){

        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the input:");
        number = input.nextInt();
        if(number % 2 == 0 ){
            System.out.println("Even");
        }
        else {
            System.out.println("False");
        }
    }
}
