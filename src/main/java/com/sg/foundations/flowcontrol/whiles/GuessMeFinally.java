/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.whiles;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author hgibs
 */
public class GuessMeFinally {
    
    public static void main(String[] args) {
        
        Random randomizer = new Random();
        
        Scanner userNumber = new Scanner(System.in);
        
        String stringNumber;
        int number;
        
        int myNumber = randomizer.nextInt((100 - 100 + 1) + 100);
        
        System.out.println("I've chosen a number between -100 and 100. Betcha can't guess it!");
        
        
        stringNumber = userNumber.nextLine();
        number = Integer.parseInt(stringNumber);
        
        System.out.println("Your guess: " + number);
        
        do{
            
            if(number == myNumber){
                System.out.println("Wow, you got it on the firt try, AMAZING!"); 
            }
            
            if(number < myNumber){
                
                Scanner lowGuess = new Scanner(System.in);
                
                
                
                System.out.println("Ha, nice try - too low! Try again!");
                System.out.println("Your guess: " + number);
                
                stringNumber = lowGuess.nextLine();
                number = Integer.parseInt(stringNumber);
                
                if(number == myNumber){
                    System.out.println("Your guess: " + number);
                    System.out.println("Finally! It's about time you got it!"); 
                }
                
                                
            }
            
                if(number > myNumber){
                
                Scanner highGuess = new Scanner(System.in);
                
                
                
                System.out.println("Ha, nice try - too high! Try again!");
                System.out.println("Your guess: " + number);
                
                stringNumber = highGuess.nextLine();
                number = Integer.parseInt(stringNumber);
                
                  if(number == myNumber){
                   System.out.println("Your guess: " + number);
                   System.out.println("Finally! It's about time you got it!"); 
                }
                
                                
            }

            
        }while(number != myNumber);
        
    }
    
}
