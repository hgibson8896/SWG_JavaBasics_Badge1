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
public class DoOrDoNot {
    
    public static void main(String[] args) {
        
        Scanner UserInput = new Scanner(System.in);
        System.out.println("Should I do it? (y/n)");
        
        boolean doIt;
        
        if(UserInput.next().equals("y")){
            doIt = true; // DO IT!
        }else{
            doIt = false; // DON"T YOU DARE!
        }
        
//        boolean iDidIt= false;
//        
//        do{
//            iDidIt = true;
//            break;
//        
//        } while(doIt);


        boolean iDidIt = true;
        
        while(true){
            break;
            
        }
        
        if(doIt && iDidIt){
            System.out.println("I did it!");
        }else if(!doIt && iDidIt){
            System.out.println("I know you said not to ....but I totally did it anyways.");
               
    }else{
            System.out.println("Don't look at me, I didn't do anything!");
        }
    }
}
