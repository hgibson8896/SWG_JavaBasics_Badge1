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
public class QuestForTheUserInput {
    
    public static void main(String[] args) {
        
//        initalize the first double variable
        double velocityOfSwallow = 0;
        
        Scanner inputReader = new Scanner(System.in);
        
        String yourName;
        String yourQuest;
        
//        then the string
        String stringVelocityOfSwallow;
        
//        We can use the Scanner's readLine to assign value to our strings
//because its return type is string

        System.out.println("What is your name:");
        yourName = inputReader.nextLine();
        
        System.out.println("What is your quest?");
        yourQuest = inputReader.nextLine();
        
//        When we get to our double data type, we can use Scanner's nextDouble method
//or we can use the Double.parseDouble to convert the nextLine's String

        System.out.println("What is the airspeed velocity of an unladen swallow?!?! ");
        
        boolean isValid = false;
        
       do{
           
        try {
//            code will run even if the user enters a string

        stringVelocityOfSwallow = inputReader.nextLine();
        velocityOfSwallow = Double.parseDouble(stringVelocityOfSwallow);
        
       System.out.println();
                
       System.out.println("How do you know " + velocityOfSwallow + " is correct, " + yourName + "?");


       System.out.println("You didn't even know if the swallow was African or European!");
        
       System.out.println("Maybe skip answering things about birds and instead go  " + yourQuest + ".");
        
        
        }catch(NumberFormatException ex){
            System.out.println("Please enter a number!");
            
        } 
        
       } while(!isValid);
       
       
        
        
        

        
    }
    
}
