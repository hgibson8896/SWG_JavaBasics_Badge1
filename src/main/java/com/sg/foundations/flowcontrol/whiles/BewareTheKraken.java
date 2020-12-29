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
public class BewareTheKraken {
    
    public static void main(String[] args) {
        
        System.out.println("Already, get those flippers and wetsetuit on - we're going diving");
        System.out.println("He're we goooOOOOooOOOO.....! *SPLASH*");
        
        int depthDivedIntFt = 0;
        
//        Turns out the ocean is only so deep, 36200 at the deepest survey,
//        So if we reach the bottom .. we should probably stop.

//       no change to while program when changed from < 36200 to true-- the break statment at 20,000 ft takes care of this condiiton.

        while(true){
            
        String stillDive = "n";
        Scanner userDecision = new Scanner(System.in);
        
        System.out.println("Should we still dive (y/n)");
        
        stillDive = userDecision.nextLine();
        
        
        switch(depthDivedIntFt){
            
            case 1000:
                System.out.println("We saw a crab");
                break;
            case 2000:
                System.out.println("We! saw an turtle");
                break;
            case 3000:
                System.out.println("We saw a guppy!");
                break;
            case 4000:
                System.out.println("We saw a SHARK!!!!");
                break;
            case 5000:
                System.out.println("We saw a whale");
                break;
            case 10000:
                System.out.println("We saw a lion fish!");
                break;
            case 15000:
                System.out.println("We sae a STING RAY!!");
                break;
            case 20000:
                System.out.println("THE KRACCKKENNN!!");
                break;
            default:
                break;
                
        }
        
        if(stillDive.equals("n")){
            System.out.println("Out of Air! Let's get back to the surface!");
            break;
        }
            
            
            
        System.out.println("So far, we're swam " + depthDivedIntFt + " feet");
        
      
        
        
        if(depthDivedIntFt >= 20000){
            System.out.println("Uhhh, I think I see a Krken, guys ....");
            System.out.println("TIME TO GO!");
            break;
        }
        
       
        
//        I can swim, really fast! 500ft at a time!
        
        depthDivedIntFt += 1000;

    }
        
        System.out.println("");
        System.out.println("We ended up swimming " + depthDivedIntFt + " feet down.");
        System.out.println("I bet we can do better next time!");
    }
    
}
