/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.whiles;

import java.util.Random;

/**
 *
 * @author hgibs
 */
public class LazyTeenager {
    
    public static void main(String[] args) {
        
        int counter= 1 ;
        int clean;
        Random cleanChance = new Random();
        clean = cleanChance.nextInt(100 +1);
        
        do{
            System.out.println("Clean you room!! x(" + counter + ")");
            System.out.println(clean);
            counter ++;
            clean = clean + 10;

            
            if(counter == 7 ){
                System.out.println("Clean you room!! x(" + counter + ")");
                System.out.println("That's IT, I'm doing it!!! YOU'RE GROUNDED AND I'M TAKING YOUR XBOX");
                break;
            }
                
            if(clean >= 100){
                 System.out.println("FINE! I'LL CLEAN MY ROOM. BUT I REFUSE TO EAT MY PEAS");

        }
          
            
        }while(clean < 100);
        
    }
    
}
