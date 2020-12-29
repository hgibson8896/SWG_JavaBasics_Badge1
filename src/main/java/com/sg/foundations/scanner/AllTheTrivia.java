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
public class AllTheTrivia {
    public static void main(String[] args) {
        
  
    Scanner readerInput = new Scanner(System.in);
    
    String largeGyte;
    String planet1 ;
    String planet2;
    String element;
    
        System.out.println("What is equivalent to 1000 Gigabtyes?");
        largeGyte = readerInput.nextLine();
        
        System.out.println("Which planet is the only one that rotates clockwise in our Solar System?");
        planet1 = readerInput.nextLine();
        
        System.out.println("The largest volcano ever discovered in our Solar System is located on which planet?");
        planet2 = readerInput.nextLine();
        
        System.out.println("What is the most abudant element in earth's atmosphere?");
        element = readerInput.nextLine();
        
        
        System.out.println("Wow, 1000 Gigabytes is a " + planet2);
        System.out.println("I didn't even know that the largest ever volcano was discovered on " + largeGyte);
        System.out.println("That's amazing that " + planet1 + " is the most abundant element in the atmosphere...");
        System.out.println( element + " is the only planet that rotates clockwise, neat");
        
        
    
    
    
 
    
   }   
}
