/*
 *  UCF COP3330 Summer 2021 Assignment 6 Solution
 *  Copyright 2021 Sabirah Salau
 */


package org.example;
import java.time.Year;
import java.util.Scanner;

public class Problem6
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("what is your current age?");
        String sCurrentAge = input.next();
        int currentAge = Integer.parseInt(sCurrentAge);

        System.out.println("At what age would you like to retire?");
        String sRetireAge = input.next();
        int retireAge = Integer.parseInt(sRetireAge);

        int yearsLeft = retireAge - currentAge;
        System.out.println("You have " + yearsLeft + " years left until you can retire.");


        int currentYear = Year.now().getValue();
        int retireYear = currentYear + yearsLeft;
        System.out.println("It's " + currentYear + ", so you can retire in " + retireYear);


    }
}
