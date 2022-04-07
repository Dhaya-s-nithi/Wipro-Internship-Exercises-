package com.studiocode;

import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = input.nextInt();
        int y[] = new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the Elements: ");
            y[i] = input.nextInt();
        }
        System.out.println("Enter an value to check");
        int p =input.nextInt();
        int sum =0,u=0;

        for(int i=0;i<n;i++)
        {
            if(y[i]==p)
            {
                sum++;
                u=i;
            }
        }

        if(sum!=0)
        {
            System.out.println(u);
        }
        else
        {
            System.out.println("-1");
        }

    }

}
