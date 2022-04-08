package com.studiocode;

import java.util.Scanner;

public class Assignment15 {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of input:");
        n = input.nextInt();

        for(int i=0; i<=n; i++){
            for(int j=0; j<i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
