package com.studiocode;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        //int employeeId = new int[]{1001, 1002, 1003, 1004, 1005, 1006, 1007};
        //  int salary;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Employee ID: ");


        //    employeeId = input.nextInt();

        int Basic[] = {20000, 30000, 10000, 12000, 50000, 23000, 29000};
        int HRA[] = {8000, 12000, 8000, 6000, 20000, 9000, 12000};
        int IT[] = {3000, 9000, 1000, 2000, 20000, 4400, 10000};
        int DA[] = {20000, 32000, 12000, 15000, 40000};

        String name[] = {"Ashish", "Sushma", "Rahul", "Chahal", "Ranjan", "Suman", "Tanmay"};
        char Code[] = {'e', 'c','k','r','m','e','c'};

        String Department[] = {"R&D", "PM", "Acct", "Front Desk", "Engg", "Manufaturing","PM"};

        char DesignationCode[]={'e','c','k','r','m'};
        String Designation[]={"Engineer","Consultant","Clerk","Receptionist","Manager"};


        int id= input.nextInt();
        int y=id/10;
        int h=id%10;
        int s=-1;
        if(y==100)
        {
            if(h<=7&&h!=0)
            {
                s=h-1;

                int ss=Basic[s]+HRA[s]-IT[s];
                int w=-1;
                for(int r=0;r<5;r++)
                {
                    if(Code[s]==DesignationCode[r])
                    {
                        ss+=DA[r];
                        w=r;
                        break;
                    }
                }

                System.out.printf("Emp No.  "+"Emp Name  "+"Department  "+"Designation  "+"Salary\n");
                System.out.printf(id+"     "+name[s]+"     "+Department[s]+"         "+Designation[w]+"       "+ss);
            }
            else {
                System.out.println("There is no employee with empid:"+ id);
            }
        }

        else {
            System.out.println("There is no employee with empid:"+id);
        }













    }
}
