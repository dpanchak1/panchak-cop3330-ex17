/*
 *  UCF COP3330 Fall 2021 Assignment 17 Solution
 *  Copyright 2021 David Panchak
 */
package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner input=new Scanner(System.in);
        double sex=0;
        double ounces=0;
        double weight=0;
        double hours=0;
        double bac=0;


        while (true) {
            System.out.print("Enter a 1 is you are male or a 2 if you are female: ");
            try {
                sex = Double.parseDouble(input.next());
                break;
            } catch (NumberFormatException ignore) {
                System.out.printf("Invalid input%n");
            }
        }

        while (true) {
            System.out.print("How many ounces of alcohol did you have? ");
            try {
                ounces = Double.parseDouble(input.next());
                break;
            } catch (NumberFormatException ignore) {
                System.out.printf("Invalid input%n");
            }
        }

        while (true) {
            System.out.print("What is your weight, in pounds? ");
            try {
                weight = Double.parseDouble(input.next());
                break;
            } catch (NumberFormatException ignore) {
                System.out.printf("Invalid input%n");
            }
        }

        while (true) {
            System.out.print("How many hours has it been since your last drink? ");
            try {
                hours = Double.parseDouble(input.next());
                break;
            } catch (NumberFormatException ignore) {
                System.out.printf("Invalid input%n");
            }
        }

        if(sex==1)
        {
            bac=((ounces*5.14/weight*.73)-.015*hours);
        }
        else
        {
            bac=((ounces*5.14/weight*.66)-.015*hours);
        }

        System.out.printf("Your BAC is %.06f%n",bac);
        if(bac<=.08)
        {
            System.out.print("It is legal for you to drive.");
        }
        else
        {
            System.out.print("It is not legal for you to drive.");

        }

    }
}
