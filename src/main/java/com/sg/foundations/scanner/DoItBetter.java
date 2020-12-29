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
public class DoItBetter {
    
    
    
    public static void main(String[] args) {
        
     
    int miles = 0;
    int hotdogs = 0;
    
    int languages = 0;
    
    Scanner readerInput = new Scanner(System.in);
    
    String stringMiles;
    
    String stringHotdogs;
    
    String stringlanguages;

    
        System.out.println("How many miles can you run?");
        stringMiles = readerInput.nextLine();
        miles = Integer.parseInt(stringMiles);
        int myMiles = miles * 2 + 1;
        System.out.println("That's oool I can run " + myMiles + " miles");
        
        System.out.println("How hotdogs can you eat?");
        stringHotdogs = readerInput.nextLine();
        hotdogs = Integer.parseInt(stringHotdogs);
        int myHotdogs = hotdogs * 2 + 1;
        System.out.println("That's oool I can eat " + myHotdogs + " hotdogs");
        
        
        System.out.println("How many languages can you speak?");
        stringlanguages= readerInput.nextLine();
        languages = Integer.parseInt(stringlanguages);
        int myLanguages = languages * 2 + 1;
        System.out.println("That's cool I can speak " + myLanguages + " languages");
    
    
    
        
    }
       
}
