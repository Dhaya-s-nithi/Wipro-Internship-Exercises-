package com.studiocode;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = input.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the elements: ");
            a[i] = input.nextInt();
            sum = sum + a[i];

        }
        System.out.println("Sum of the array is: " + sum);
        System.out.println("Average of array is: " + sum/n);



    }
}
