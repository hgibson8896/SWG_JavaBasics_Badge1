/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.whiles;

/**
 *
 * @author hgibs
 */
public class LovesMe {
    
    public static void main(String[] args) {
        
        
        int lovesMe = 34;
               
        while(lovesMe > 0){
            if(lovesMe % 2 == 0){
            System.out.println("It loves NOT!");
            lovesMe--;
        }else{  
                
               System.out.println("It loves me!");
               lovesMe--;

            } 
    }
             System.out.println("I knew it ! It LOVES ME!");

        
    }
    
}
