package com.studiocode;

import java.util.Scanner;

public class Assignment6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose your gender: male/female");
        String gender = input.nextLine();

        if(gender.equals("female")){
            System.out.println("Enter your age: ");
            int age = input.nextInt();
            if(age >= 1 && age <= 58){
                System.out.println("The percentage of Interest is: 8.2%");
            }
            else if(age>=59 && age <=100){
                System.out.println("The percentage of Interest is: 9.2%");
            }else{
                System.out.println("invalid input");
            }

        }
        else if(gender.equals("male")){
            System.out.println("Enter your age: ");
            int age = input.nextInt();

            if(age >= 1 && age <= 58){
                System.out.println("The percentage of Interest is: 8.4%");
            }else if(age>=59 && age <=100){
                System.out.println("The percentage of Interest is: 10.5%");
            }else{
                System.out.println("invalid input");
            }
        }
    }
}
