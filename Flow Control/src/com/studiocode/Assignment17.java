package com.studiocode;

import java.util.Scanner;

public class Assignment17 {
    public static void main(String[] args) {
        int n, sum =0, temp;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        n = input.nextInt();
        temp = n;
        while(n>0){
            int r = n%10;
            sum = (sum*10)+r;
            n = n/10;
        }
        if(temp == sum){
            System.out.println(temp + " is a palindrome number");
        }else {
            System.out.println(temp + " is not a palindrome number");
        }
    }
}
