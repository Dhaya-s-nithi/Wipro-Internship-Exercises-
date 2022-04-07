package com.studiocode;

import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        char input1, input2;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the input1: ");
        input1 = input.next().charAt(0);
        System.out.println("Enter the input2: ");
        input2 = input.next().charAt(0);

        if(input2 > input1){
            System.out.println(input1 + " , " + input2);
        }else{
            System.out.println(input2 + " , " + input1);
        }
    }
}
