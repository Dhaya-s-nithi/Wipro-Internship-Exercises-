package com.studiocode;

import java.util.Scanner;

public class Assignment8 {
    public static void main(String[] args) {
        int n,s=-1,l=-1,sum=0;
        Scanner p=new Scanner(System.in);
        System.out.println("enter a size of array:");
        n = p.nextInt();
        int y[]= new int[n];

        for(int i=0;i<n;i++)
        {
            System.out.println("enter an element:");
            y[i]=p.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(y[i]==6)
            {
                s=i;
            }
            if(y[i]==7)
            {
                l=i;
            }
        }
        if((s<l)&&(s!=-1)&&(l!=-1))
        {
           for(int i=0;i<s;i++)
           {
               sum+=y[i];
           }
           for(int i=l+1;i<n;i++)
           {
               sum+=y[i];
           }
            System.out.println(sum);
        }
        else
        {
            for(int i=0;i<n;i++)
            {
                sum+=y[i];
            }
            System.out.println(sum);
        }
    }

}
