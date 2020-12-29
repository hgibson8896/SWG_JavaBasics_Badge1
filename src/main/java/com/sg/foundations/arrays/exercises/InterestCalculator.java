/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.arrays.exercises;

import java.util.Scanner;

/**
 *
 * @author hgibs
 */
public class InterestCalculator {
    
    public static void main(String[] args) {
        
        
        double annualInterestRate; 
        String stringAnnualInterestRate;
        
        double initalInvestment;
        String stringInitialInvestment;
        
        int numberofYears;
        String stringNumberofYears;
        
        int yearNumber = 0;
        double startPrinciple =0;
        double endPrinciple;
        
        double compoundRate;
        String stringCompoundRate;
        
        
        
        Scanner inputInvest = new Scanner(System.in);
        System.out.println("How much do you want to invest?");
        stringInitialInvestment = inputInvest.nextLine();
        initalInvestment = Double.parseDouble(stringInitialInvestment);
        
        Scanner inputYears = new Scanner(System.in);
        System.out.println("How many years are you investing?");
        stringNumberofYears = inputYears.nextLine();
        numberofYears = Integer.parseInt(stringNumberofYears);
        
        Scanner inputInterest = new Scanner(System.in);
        System.out.println("What is the annual interest rate % growth?");
        stringAnnualInterestRate = inputInterest.nextLine();
        annualInterestRate = Double.parseDouble(stringAnnualInterestRate);
        
        Scanner inputRateCom = new Scanner(System.in);
        System.out.println("What is the compound rate?  \nquarterly = 4, monthly = 12, daily = 365");
        stringCompoundRate = inputRateCom.nextLine();
        compoundRate = Double.parseDouble(stringCompoundRate);
        
       System.out.println("Calculating ...");

       annualInterestRate = annualInterestRate /100;
        
        do{
            
         numberofYears--;
         yearNumber++;
         
         
         initalInvestment = initalInvestment + startPrinciple;
         initalInvestment = Math.round(initalInvestment *100.0)/ 100.0;
         
         endPrinciple = initalInvestment * Math.pow(1 + (annualInterestRate/compoundRate),compoundRate * 1);
         endPrinciple= Math.round(endPrinciple * 100.0) / 100.0;
         
         startPrinciple = endPrinciple - initalInvestment;
         startPrinciple = Math.round(startPrinciple * 100.0)/ 100.0;
        
         System.out.println("Year " + yearNumber + ":");
         System.out.println("Began wtih $" + initalInvestment);
         System.out.println("Earned $" + startPrinciple);
         System.out.println("Ended with $" + endPrinciple);
        
         System.out.println();
         }while(numberofYears > 0);        
        
//        System.out.println("Earned $" + startPrinciple);
//        System.out.println("Ended with $" + endPrinciple);
        
        

        
        
    }
    
    
    
}
