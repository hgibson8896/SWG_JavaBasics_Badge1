/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.random;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author hgibs
 */
public class GuesMeMore {
    public static void main(String[] args) {
        
        Random num = new Random();
        
        Scanner userInput = new Scanner(System.in);
        
        int numGuess;
        String stringNumGuess;
        int myRandomNum = (num.nextInt(201) - 100);
     
       System.out.println("I've chose a number betweeb -100 and 100. Bet you can't guess it!");
        stringNumGuess = userInput.nextLine();
        numGuess = Integer.parseInt(stringNumGuess);
        do {
        
       
        
        System.out.println("Your guess: " + numGuess);
            
            if(numGuess == myRandomNum){
                System.out.println("Wow, nice guess! That was it!");
                System.out.println("Your guess: " + numGuess);
                break;
                
            }else if(numGuess < myRandomNum){
                System.out.println("Ha, nice try - too low! Try again!");
                System.out.println("Your guess: " + numGuess);
                
                Scanner newGuess = new Scanner(System.in);
                stringNumGuess = userInput.nextLine();
                numGuess = Integer.parseInt(stringNumGuess);
                    if(numGuess == myRandomNum){
                     System.out.println("Wow, nice guess! That was it!");
                     System.out.println("Your guess: " + numGuess);
                
                    }
               
                
            }else{
                 System.out.println("Ha, nice try - too HIGH! Try again!");
                System.out.println("Your guess: " + numGuess);
                
                  Scanner newGuess = new Scanner(System.in);
                 stringNumGuess = userInput.nextLine();
                 numGuess = Integer.parseInt(stringNumGuess);
                 
                 if(numGuess == myRandomNum){
                     System.out.println("Wow, nice guess! That was it!");
                     System.out.println("Your guess: " + numGuess);
                
                    }
            }
            
        }while(numGuess != myRandomNum);
        
        
       
        
        
    }
            
    
}
