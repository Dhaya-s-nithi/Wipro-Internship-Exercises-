package com.studiocode;

import java.util.Scanner;

public class Assignment14 {
    public static void main(String[] args) {
        int n, digit, sum=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the input:");
        n = input.nextInt();
        while(n>0){
            digit = n%10;
            sum = sum+digit;
            n = n/10;

        }
        System.out.println(sum);


    }
}
