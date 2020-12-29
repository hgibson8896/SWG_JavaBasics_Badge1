/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.basics;

import java.util.Scanner;

/**
 *
 * @author hgibs
 */
public class DoWhileLoop {
    
    public static void main(String[] args) {
        
//        Great when you need to do something at least once
// EXAMPLE: receiving user input
        
//        int counter = 1;
//        
//        do{
//            System.out.println(counter);
//            counter++; //must add or endless loop
//            
//        } while(counter < 6


Scanner readerInput = new Scanner(System.in); //input from the command line

int userNumber;
String stringUserNumber;


do{
    
    System.out.println("Please enter a number between 1 and 20");
    stringUserNumber = readerInput.nextLine();
    userNumber = Integer.parseInt(stringUserNumber);
    
}while(userNumber < 1 || userNumber > 20);

        System.out.println("Thank you your number was " + userNumber);
        
    }
    
}
