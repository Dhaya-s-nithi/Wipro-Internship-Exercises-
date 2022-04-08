package com.studiocode;

import java.util.Scanner;

public class Assignment12 {
    public static void main(String[] args) {
        int n, count = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the input:");
        n = input.nextInt();
        for(int i =2; i<=n/2; i++){
            count++;
            break;
        }
        if(count == 0){
            System.out.println(n + " " + "is a prime number");
        }else{
            System.out.println(n + " " + "is not a prime number");
        }
    }
}
