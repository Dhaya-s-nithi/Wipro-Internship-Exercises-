package com.studiocode;

import java.util.Scanner;

public class Assignment11 {
    public static void main(String[] args) {
        int n,u=0;
        Scanner p=new Scanner(System.in);
        System.out.println("enter a size of array:");
        n=p.nextInt();
        int y[]=new int[n];
        int t[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("enter an element:");
            y[i]=p.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(y[i]!=1&&y[i]!=4)
            {
                u++;
            }
        }
        if(u==0)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}
