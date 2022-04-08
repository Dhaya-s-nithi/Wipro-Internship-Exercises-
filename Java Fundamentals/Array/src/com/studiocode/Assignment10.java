package com.studiocode;

import java.util.Scanner;

public class Assignment10 {
    public static void main(String[] args) {
        int n,h=0;
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
            if(y[i]%2==0)
            {
                t[h++]=y[i];
            }
        }
        for(int i=0;i<n;i++)
        {
            if(y[i]%2!=0)
            {
                t[h++]=y[i];
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(t[i]);
        }

    }
}
