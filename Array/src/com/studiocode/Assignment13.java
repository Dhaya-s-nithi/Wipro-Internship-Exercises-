package com.studiocode;

import java.util.Scanner;

public class Assignment13 {
    public static void main(String[] args) {
        int n=2,o=2;
        Scanner p=new Scanner(System.in);
        int y[][]=new int[n][o];
        int t[][]=new int[n][o];
        for(int i=0;i<n;i++)
        {
           for(int j=0;j<o;j++) {
               y[i][j] = p.nextInt();
           }
        }
        System.out.println("given array is:"+"\n");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<o;j++) {
                System.out.print(y[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("the array of reverse is:"+"\n");
        for(int i=0,h=1;i<n&&h>=0;i++,h--)
        {

            for(int j=0,k=1;j<o&&k>=0;j++,k--) {

                t[h][k]=y[i][j];

            }


        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<o;j++) {
                System.out.print(t[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
