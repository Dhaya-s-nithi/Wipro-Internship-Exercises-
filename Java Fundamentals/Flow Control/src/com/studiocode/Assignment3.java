package com.studiocode;

import java.util.Scanner;

public class Assignment3 {

    public static void main(String[] args){

        String a;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the input: ");
        a = input.nextLine();
       int length = a.length();
       char temp;


        if(length ==  0){
            System.out.println("No values");
        }
        else
        {
            for(int i=0;i<length;i++)
            {
                temp=a.charAt(i);
                if(temp == ' ')
                {
                    System.out.print(",");
                    continue;
                }
                System.out.print(temp);

            }
        }

    }
}
