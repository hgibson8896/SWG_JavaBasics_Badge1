/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.methods;

import java.util.Random;

/**
 *
 * @author hgibs
 */
public class BarelyControlledChaos {
    
    public static void main(String[] args) {
        
        
         String color = randomColor();
         String animal = randomAnimal();
         String colorAgain = randomColor();
         int weight = randomNumber(5, 200);
         int distance = randomNumber(10, 20);
         int number = randomNumber(10000, 20000);
         int time = randomNumber(2, 6);
         
         System.out.println("Once, when I was very small...");
         System.out.println("I was chased by a " + color + ", " + weight + "lb" + " minature " + animal + " for over " + distance + " miles!!");
         System.out.println("I had to hide in a field of over " + number + " " + colorAgain + " poppies for nearly " + time + " hours until it left me alone!");
         System.out.println("\nIt was QUITE the experience, " + "let me tell you!");
        
        
    }
    
    public static String randomColor(){
        
        Random randomizer = new Random();
        int color = randomizer.nextInt(6);
        
        
        
        switch(color){
            
            case 0:
                return("yellow");
               
            case 1:
               return("blue");
                
            case 2:
                return("green");
                
            case 3:
                return("purple");
              
            case 4:
                return("red");
                              
            case 5:
                return("orange");
               
            default:
                break;
                
             
               
        }
        return null;
        
    }
    
    
            public static String randomAnimal(){
        
        Random randomizer = new Random();
        int animal = randomizer.nextInt(6);
        
        switch(animal){
            
            case 0:
                return("dog");
                
            case 1:
                return("cat");
           
            case 2:
                return("mouse");
                
            case 3:
                return("bear");
                
            case 4:
                return("bird");
                
            case 5:
                return("fish");
                
            default:
                break;
           
        }return null;
        
    }
            
            public static int randomNumber(int num1, int num2){
                
                Random randomizer = new Random();
                
                int newRandom = randomizer.nextInt((num2 - num1) + num1);

                return newRandom;
            }
    
}
