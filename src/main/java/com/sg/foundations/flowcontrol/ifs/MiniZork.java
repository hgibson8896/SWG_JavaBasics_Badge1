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
public class MiniZork {
    
    public static void main(String[] args) {
        
// At least three locations. (The start code has two locations: an open field as a 
//starting point and a white house as a possible destination from the starting point. 
//You should come up with at least one more location.)
//At least two choices for each location, at least one of which should move the player to a different location.
//The player should be able to start in the open field, go to each of the other locations, and return
//to the starting point. (It's fine if this is not an obvious path, as long as it's possible.)
       
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("You're standing in an open field west on the white house");
        System.out.println("With a boarded front door.");
        System.out.println("There is a small box there.");
        System.out.println("Go to the house, go grab a coffee, or open the mailbox?");
        
        String action = userInput.nextLine();
        
        if(action.equals("open mailbox")){
            System.out.println("You open the mailbox.");
            System.out.println("It's really dark in there.");
            System.out.println("Look inside or stick your hand in?");
            
            action = userInput.nextLine();
            
               if(action.equals("look inside")){
                System.out.println("You peer inside the mailbox");
                System.out.println("It's really dark cery dark. So ... so very dark.");
                System.out.println("Run away or keep looking?");
                
                action = userInput.nextLine();

               
                    
                } else if(action.equals("stick your hand in")){
                    
                }else if(action.equals("Go to the house")){
                    
                } 
          
        }
        
              if(action.equals("grab a coffee")){
                System.out.println("This looks nice");
                System.out.println("You order a pumpkin spice latte... but it's too hot");
                System.out.println("drink anyway or wait to cool off");
                
                action = userInput.nextLine();
            

            
                 if(action.equals("drink anyway")){
                    System.out.println("Crickey! That's hot, you burned your tongue");
                    System.out.println("Immediately head to the Minute Clinic");
                } else if(action.equals("wait to cool off")){
                    System.out.println("Mmmm, what a satifying basic drink");
                    System.out.println("You go back to the field and enjoy your latte on the lawn");
                }

            }
              
               if(action.equals("go to house")){
                System.out.println("You don't know who lives here");
                System.out.println("Should you go inside anyway or turn around");
                System.out.println("go inside or turn around");
                
                action = userInput.nextLine();
            

            
                 if(action.equals("go inside")){
                    System.out.println("Hmmm, that watch looks nice... maybe I'll borrow it.");
                    System.out.println("Stop theif! You arrested for trespassing and theft!");
                } else if(action.equals("No I better go back to the field")){
                    System.out.println("You are safe in the field, what a beautiful day!");
                   
                }

            }
    }
}
