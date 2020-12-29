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
public class RollerCoaster {
    
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("We;re going to go on a roller coaster ...");
        System.out.println("Let me know ehen you want to get of ...!");
        
//        String keepRiding = "y";
//        int loopsLooped = 0;
//        
//        while (keepRiding.equals("y")){
//            System.out.println("WHEEEEEEEeeeeeeeeeeeEEEEEEEEEEeeeEEEeeee...!!!!");
//            System.out.println("What to keep going? (y/n)");
//            
//            keepRiding = userInput.nextLine();
//            loopsLooped++;
//            
//        }


// checked to loop for condition for "n" instead of "y"
    String keepRiding = "n";
    int loopsLooped = 0;
    
    while(true){
       System.out.println("WHEEEEEEEeeeeeeeeeeeEEEEEEEEEEeeeEEEeeee...!!!!");
       System.out.println("What to keep going? (y/n)");
       
       keepRiding = userInput.nextLine();
       loopsLooped++;
       
       if(keepRiding.equals("n")){
           break;
       }
    }
    
              System.out.println("Wow, that was FUN!"); 
              System.out.println("We looped that loop " + loopsLooped + " times!!");
        
    }
    
}
