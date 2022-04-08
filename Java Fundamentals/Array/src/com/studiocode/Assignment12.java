package com.studiocode;

import java.util.Scanner;

public class Assignment12 {
    public static void main(String[] args) {
        int n=3;
        Scanner p=new Scanner(System.in);
        int y[]=new int[n];
        int t[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("enter an element of first array:");
            y[i]=p.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            System.out.println("enter an element of second array:");
            t[i]=p.nextInt();
        }
        System.out.println(y[1] + " , "+t[1]);


    }
}
