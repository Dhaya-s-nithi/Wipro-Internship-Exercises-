package com.studiocode;

import java.util.Scanner;

public class Assignment7 {
    public static void main(String[] args) {
        char c;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the input: ");
        c = input.next().charAt(0);
        int ascii = c;

        if(ascii >= 97 && ascii <= 122){
            ascii = ascii - 32;
            c = (char)ascii;
            System.out.println(c);
        }else if(ascii >= 65 && ascii <= 90){
            ascii = ascii + 32;
            c = (char)ascii;
            System.out.println(c);
        }

    }
}
