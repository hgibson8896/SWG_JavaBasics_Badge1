/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

/**
 *
 * @author hgibs
 */
public class GuessMe {
    
    public static void main(String[] args) {
        
        int number = 50;
        
        Scanner readerInput = new Scanner(System.in);
        
        String stringGuess;
        
        System.out.println("I've chosen a number. Betcha can't guess it!");
        stringGuess = readerInput.nextLine();
        int numberGuess = Integer.parseInt(stringGuess);
        System.out.println("Your guess: " + numberGuess);
        
        if (numberGuess == number){
            System.out.println("Wow nice guess! That was it!");
        }
        
        if (numberGuess < number){
            System.out.println("?Ha, nice try - too low! I chose " + number);
        }
        
        if(numberGuess > number){
            System.out.println("Too bad, way too high. I chose " + number);
        }
        
        
        
        
             
        
        
    }
    
}
