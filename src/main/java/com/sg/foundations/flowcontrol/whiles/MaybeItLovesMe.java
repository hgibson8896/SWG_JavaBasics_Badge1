/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.whiles;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author hgibs
 */
public class MaybeItLovesMe {
    public static void main(String[] args) {
        
        Random count = new Random();
        
//      how to set a range in java --- (max -min + 1) + min /// the max is exclusive  
        int petalCount = count.nextInt(90 - 13 + 1)+ 13;
        int x = 0;
        
        System.out.println("Wow there's " + petalCount + " PETALS!");
        
        boolean LOVED = true;
        
        while(x < petalCount){
            if(x % 2 == 0){
                System.out.println("It LOVES Me!");
                x++;
                LOVED = true;
                
                
            }else{
                System.out.println("It loves me not...");
                x++;
                LOVED = false;
                
//               
        }
        
            
    }
        
        if(LOVED){
            System.out.println("I knew it, I'm LOVED!");
        } else{
            System.out.println("Ahhh, that's a bummer");
        }
        
        
        
        
    
}
}