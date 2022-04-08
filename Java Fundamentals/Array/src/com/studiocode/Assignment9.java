package com.studiocode;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment9 {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        n = input.nextInt();


        int a[] = new int[n];
        for(int i=0; i<n; i++){
            System.out.println("Enter the elements: ");
            a[i] = input.nextInt();
        }
       // System.out.println(Arrays.toString(a));

        for(int i=0; i<n;i++){
            if(a[i] == 10){
                a[i] =0;
            }

        }
        int y;
        for(int j=0;j<n;j++){
            if(a[j]==0)
            {
                for(int i=j+1;i<n;i++)
                {
                    if(a[i]!=0)
                    {
                        y=a[j];
                        a[j]=a[i];
                        a[i]=y;
                        break;
                    }
                }
            }

        }
        for(int j=0; j<n;j++){
            System.out.println(a[j]);

        }





    }
}
