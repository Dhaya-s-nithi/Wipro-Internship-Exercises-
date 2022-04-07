package com.studiocode;

import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = input.nextInt();
        // Declaing Array

        int a[] = new int[n];

        for(int i=0; i<n; i++){
            System.out.println("Enter the Elements: ");
            a[i] = input.nextInt();
        }

        int min = a[0], max = a[0];

        for(int i =0; i<n; i++){
            if(a[i] > max){
                max = a[i];
            }
            if(a[i] < min){
                min = a[i];
            }
        }
        System.out.println("The minimum element is: " + min);
        System.out.println("The maximum element is: " + max);

    }
}
