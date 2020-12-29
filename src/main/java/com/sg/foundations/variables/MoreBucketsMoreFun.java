/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.variables;

/**
 *
 * @author hgibs
 */
public class MoreBucketsMoreFun {
    
    public static void main(String[] args) {
        
        // DECLARE ALL THE THINGS
        // (Usually it's a good idea to declare them at the beginning of the program)
        
        int butterflies, beetles, bugs;
        
        //Now give a couple of them some values
        
        butterflies = 5;
        beetles = 9;
        
        bugs = butterflies + beetles;
        
        System.out.println("There are only " + butterflies + " butterflies");
        System.out.println("but there are " + bugs + " bugs in all.");
        
        System.out.println("Uh oh, my dog ate one.");
        
//        subraccted one butterfly
        butterflies--;
        
//        bugs = butterflies + beetles;
        
        System.out.println("Now there are only " + butterflies + "butterflies left.");
        System.out.println("But there are still " + bugs + " bugs left ...");
        System.out.println("Wait a minute!");
        System.out.println("Maybe my computer can't do the math after all");
//        operations run in order-- needed to then update the variable bugs
        
      
    }
    
}
