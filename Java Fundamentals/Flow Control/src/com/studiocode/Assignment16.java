package com.studiocode;

import java.util.Scanner;

public class Assignment16 {
    public static void main(String[] args) {
        int n , reverse =0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the input:");
        n = input.nextInt();
        while(n!=0){

            int rem = n%10;
            n = n/10;
            reverse = reverse*10+rem;

        }
        System.out.println(reverse);
    }

}
