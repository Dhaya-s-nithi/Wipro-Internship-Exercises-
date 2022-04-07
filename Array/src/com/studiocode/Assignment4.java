package com.studiocode;

import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = input.nextInt();
        int a[] = new int[n];

        for(int i=0; i<n; i++){
            System.out.println("Enter the Elements: ");
            a[i] = input.nextInt();
        }
        char temp;
        for(int i=0;i<n;i++)
        {
            temp=(char)a[i];
            System.out.print(temp + "\t");
        }
    }
}
