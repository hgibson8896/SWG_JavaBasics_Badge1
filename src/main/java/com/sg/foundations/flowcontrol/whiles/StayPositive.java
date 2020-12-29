/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.whiles;

import java.util.Scanner;

/**
 *
 * @author hgibs
 */
public class StayPositive {
    
    public static void main(String[] args) {
        
        int countDown;
        String stringCount;
        
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("What number should I count down from? ");
        
        stringCount = userInput.nextLine();
        countDown =  Integer.parseInt(stringCount);
        
        while(countDown < 0){
            Scanner newUserInput = new Scanner(System.in);

            System.out.println("Please enter a valid positive number");
            stringCount = newUserInput.nextLine();
            countDown = Integer.parseInt(stringCount);
        }
        
        System.out.println("Here goes!");
      
        while(countDown > 0 && countDown > -1){
            countDown--;
            System.out.println(countDown);
        }
        
        System.out.println("Blast off!");
        
    }
    
}
