/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.scanner;

import java.util.Scanner;

/**
 *
 * @author hgibs
 */
public class DontForgetToStoreIt {
    
    public static void main(String[] args) {
        
        int meaningOfLifeAndEverything = 42;
        double pi = 3.14159;
        String cheese, color;
        
        Scanner inputReader = new Scanner(System.in);
        
        String stringMeaningOfLifeAndEverything;
        String stringPi;
        
        
        boolean isValid = false;
        
        System.out.println("Give me pi to at least 5 decimals:");

        
     do{
         try{
             

             stringPi = inputReader.nextLine();
             pi =  Double.parseDouble(stringPi);
             
             break;
             
         }catch(NumberFormatException ex){
             System.out.println("Please enter a number!");
         } 
     } while(!isValid);
      
       
        
        
//        we've used Double.parseDouble but meaningOfLifeAndEverything is an INT
// So we'll have to use Integer.parseInt

         System.out.println("What is the meaning of Life, the universe & everything? ");

do{
    try{
        
        
         stringMeaningOfLifeAndEverything = inputReader.nextLine();
         meaningOfLifeAndEverything = Integer.parseInt(stringMeaningOfLifeAndEverything);
         
         break;
        
    } catch(NumberFormatException ex){
        System.out.println("Numbers only carry the meaning of life!");
    }
        
} while(!isValid);

       
// not sure how to validate below yet

        System.out.println("What is your favorite kind of cheese? ");
        cheese = inputReader.nextLine();
        
        System.out.println("Do you like the color red or blue more? ");
        

           color = inputReader.nextLine();

 

        
       System.out.println("Ooh, " + color + " " + cheese + " sounds delicious! ");
       System.out.println("The circumference of Life is " + (2 * pi * meaningOfLifeAndEverything));
                
        
    }
    
}
