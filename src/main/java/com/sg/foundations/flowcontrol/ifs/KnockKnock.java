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
public class KnockKnock {
    
    public static void main(String[] args) {
        
//        What happens if you change .equals() to ==?
// You should try yo use .equals(); when comparing contents of a string, the == only check to see if the references are equal?
//
//        What happens if you don't type in the right capitalization? How might you fix that?


    Scanner inputReader = new Scanner(System.in);
    
        System.out.println("Knock Knock! Guess who!! ");
        String nameGuess = inputReader.nextLine();
        
        String newNameGuess = nameGuess.toLowerCase();
        
        
        if(newNameGuess.equals("marty mcfly")){
            System.out.println("Hey! That's right! I'm back!");
            System.out.println(".... from the Future");//Sorry, had to!
        } else {
            System.out.println("Dude, do I - look - like " + nameGuess);
        }



    }
    
}
