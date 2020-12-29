/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.basics;

import java.util.Random;

/**
 *
 * @author hgibs
 */
public class WhileLoop {
    
    public static void main(String[] args) {
       
//        for loop is when you know how many times you want to repeat
        int counter = 1;
        
        while(counter< 6){
            System.out.println(counter);
            counter++;
            
        }
        
        System.out.println();
        System.out.println();
        
        
//        cannot predict how many times you want to repeat
        
        Random rGen = new Random();
        int randomNum = rGen.nextInt(10) + 1; // randsom between 1 and 10  you all the +1
        
        while(randomNum < 9){
            System.out.println(randomNum);
            randomNum = rGen.nextInt(10)+ 1;
            
        }
        
        
    }
            
    
}
