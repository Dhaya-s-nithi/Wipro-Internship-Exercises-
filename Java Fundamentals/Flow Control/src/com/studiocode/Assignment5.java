package com.studiocode;

import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {

        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your input: ");
        char c = input.next().charAt(0);



        if((c >= 'a' && c <= 'z') || (c >= 'A' && c<= 'Z')){
            System.out.println("It's an Alphabet");
        }else if(c >= '0' && c<= '9'){
            System.out.println("It's a Digit");
        }else{
            System.out.println("It's a Special Character");
        }

    }
}
