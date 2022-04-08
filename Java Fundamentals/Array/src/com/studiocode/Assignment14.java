package com.studiocode;

import java.util.Scanner;

public class Assignment14 {
    public static void main(String[] args) {
        int n=3,o=3,la=0;
        Scanner p=new Scanner(System.in);
        int y[][]=new int[n][o];
        int t[][]=new int[n][o];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<o;j++) {
                y[i][j] = p.nextInt();
            }
        }
        System.out.println("given array are");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<o;j++) {
                if(i==0&&j==0)
                {
                    la=y[i][j];
                }
                if(y[i][j]>la)
                {
                    la=y[i][j];
                }
                System.out.print(y[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("the biggest number in given array");
        System.out.print("\t"+la);

    }
}
