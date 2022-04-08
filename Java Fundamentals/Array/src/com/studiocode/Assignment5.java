package com.studiocode;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = input.nextInt();
        int y[] = new int[n];

        for(int i=0; i<n; i++){
            System.out.println("Enter the Elements: ");
            y[i] = input.nextInt();
        }
        int temp=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(y[i]>y[j])
                {
                    temp=y[i];
                    y[i]=y[j];
                    y[j]=temp;
                }
            }
        }

        for(int i=0;i<n;i++)
        {
            System.out.println(y[i]);
        }

        System.out.println("smallest number are:"+y[0]+ " , " + y[1]);
        System.out.println("Largest number are"+y[n-1]+ ", " +y[n-2]);

    }
}
