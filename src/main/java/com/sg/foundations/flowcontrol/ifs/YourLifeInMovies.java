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
public class YourLifeInMovies {
    
    public static void main(String[] args) {
        
        Scanner readerInput = new Scanner(System.in);
        
        int yearBorn;
        String stringYearBorn;
        String name;
        
        System.out.println("Hey let's play a game! What's your name");
        name = readerInput.nextLine();
        
        System.out.println("Okay, " + name + ", when were you born ");
        stringYearBorn = readerInput.nextLine();
        yearBorn = Integer.parseInt(stringYearBorn);
        
        System.out.println("well " + name + "...");
        
         if(yearBorn < 1900 || yearBorn > 2015){
             System.out.println("Hmmm... please try another year of birth");
         }
         if(yearBorn < 2005){
             System.out.println("Did you know that Pixar's 'Up' came out over a decade ago?");
            }
         if(yearBorn < 1995){
             System.out.println("And that the first Harry Potter came out over 15 years ago!");
         }
         if(yearBorn < 1985){
             System.out.println("Also, Space Jam came out not last decade, but the one before THAT.");
         }
         if(yearBorn < 1975){
             System.out.println("Did you know that the original Jurrasic Park release is closer to the first lunar landing that it is to today");
         }
         if(yearBorn < 1965){
             System.out.println("And that MASH TV series has been around for almost half a century!");
         }
    }
    
}
    