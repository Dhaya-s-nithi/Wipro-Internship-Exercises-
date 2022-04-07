package com.studiocode;

public class Assignment13 {
    public static void main(String[] args) {
        int n;
        int prime;
        for(n=10; n<=99; n++){
            prime = 1;
            for(int i=2; i<n; i++){
                if(n%i == 0){
                    prime =0;
                    break;
                }

            }
            if(prime==1)
                System.out.println(n);

        }

    }
}
