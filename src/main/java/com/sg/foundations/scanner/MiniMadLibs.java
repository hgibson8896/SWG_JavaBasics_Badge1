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
public class MiniMadLibs {
   
    public static void main(String[] args) {
        
        
        
        Scanner readerInput = new Scanner(System.in);
        
       String noun, adjective, noun2, number, adjective2, pluralNoun, pluralNoun2, pluralNoun3, verbPresentTense, verbPasttense;

        
        System.out.println("please enter a noun");
        noun = readerInput.nextLine();
        
        System.out.println("please enter an adjective");
        adjective = readerInput.nextLine();
        
        System.out.println("Please enter another noun");
        noun2 = readerInput.nextLine();
        
        System.out.println("Please enter a number");
        number = readerInput.nextLine();
        
        System.out.println("Please enter another adjective");
        adjective2 = readerInput.nextLine();
        
        System.out.println("Please enter a plural noun");
        pluralNoun = readerInput.nextLine();
        
        System.out.println("Please enter another plural noun");
        pluralNoun2 = readerInput.nextLine();
        
        System.out.println("Please enter one last plural noun");
        pluralNoun3 = readerInput.nextLine();
        
        System.out.println("Please enter a verb in present tense");
        verbPresentTense = readerInput.nextLine();
        
        System.out.println("Please enter a verb in past tense");
        verbPasttense = readerInput.nextLine();
        
        
        System.out.println("*** NOW LETS GET MAD (libs) ***");
        
        System.out.println(noun + ": the " + adjective + " frontier " + ". These are the voyages of the starship " + noun2 +
                ". Its " + number + "-year mission; to explore strange " + adjective2 + " " + pluralNoun + " to seek out the " +
                adjective2 + " " + pluralNoun2 + " " +  adjective2 + " " + pluralNoun3 + ", to boldly " + verbPresentTense +
                " where no one has " + verbPasttense + " before.");
        
    }
    
}
