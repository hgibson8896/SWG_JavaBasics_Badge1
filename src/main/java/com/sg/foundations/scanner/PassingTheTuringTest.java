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
public class PassingTheTuringTest {
    
    public static void main(String[] args) {
        
       int number = 0;
        
        Scanner readerInput = new Scanner(System.in);
        
        String name;
        String color;
        String fruit;
        String stringNumber;
        
        System.out.println("""
                           Hello There!
                           What's your name?""");
        
        name = readerInput.nextLine();
        
        System.out.println("Hi " + name + "! I'm Gwen" + "\n" + "What's your favorite color?");
        color = readerInput.nextLine();
        System.out.println("Huh, " + color + "? Mine's Seafoam Green");
        
        System.out.println();
        System.out.println("""
                           I really like pineapples. They're my favorite fruit, too.
                           What's your favorite fruit?""");
        fruit= readerInput.nextLine();
        
        System.out.println("Really? " + fruit + "? That's wild!");
        System.out.println();
        System.out.println("Speaking of favorties, what's your favorite number?");
        
        
        boolean isValid = false;
        
        do{
            try{
                stringNumber = readerInput.nextLine();
                number = Integer.parseInt(stringNumber);
                
                int myNumber = 145;
                
                System.out.println(number + " is a cool number. Mine's " + myNumber);
                
                int newSum = number * myNumber;

                
                System.out.println("Did you know " + number +  " * " + myNumber + " is " + newSum + "? That's a cool number too!" );
                
                                              
                break;
                
            }catch(NumberFormatException ex){
                    System.out.println("Please enter a number " + name);
                    }
        } while(!isValid);
        
        
                System.out.println();
                System.out.println("Well, thanks for talking to me " + name );
                
        
        
    
        
        
        
        
        
        
        
        
  
    }
        
 
    }