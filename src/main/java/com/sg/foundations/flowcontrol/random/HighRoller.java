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
public class HighRoller {
    
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        
        Random diceRoller = new Random();
        
        int diceSides;
        String stringDiceSides;
        
        int rollResult;
        
        System.out.println("How many sides should the dice have?");
        stringDiceSides = userInput.nextLine();
        diceSides = Integer.parseInt(stringDiceSides);
        
        rollResult = diceRoller.nextInt(diceSides)+ 1;
        
         
         
         System.out.println("TIME TO ROOOOLLLL THE DICE!");
         System.out.println("I rolled a " + rollResult);
         
         if(rollResult <= 1){
             System.out.println("You rolled a critical failure");
         }else if(rollResult == diceSides){
             System.out.println("They will speak of this roll for ages...");
         }else if(rollResult > 5 && rollResult <= 20){
             System.out.println("A record roll!");
         }else if(rollResult > 1 && rollResult <= 5){
            System.out.println("Nice little roll!");

    } else{
             System.out.println("EPIC!");
         }
        
    }
    
}
