package com.studiocode;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment6 {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        n = input.nextInt();
        int a[] = new int[n];


        for(int i=0; i<n; i++){
            System.out.println("Enter the Elements: ");
            a[i] = input.nextInt();


        }
        Arrays.sort(a);
        System.out.print(Arrays.toString(a));
    }
}
