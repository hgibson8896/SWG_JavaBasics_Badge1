/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.ifs;

/**
 *
 * @author hgibs
 */
public class SpaceRustlers {
    
    public static void main(String[] args) {
        
        int spaceships = 10;
        int aliens = 25;
        int cows = 100;
        
        if(aliens > spaceships){
            System.out.println("Vrroom, vroom! Let's get going!");
    }else{
            System.out.println("There aren't enough green guys to drive these ships!");
        }
        
        if(cows == spaceships){
            System.out.println("Wow, way to plan ahead! JUST enough room for all these walking hamburgers!");
//            The else if condition is evaluating that one condition
                    }else if (cows > spaceships){
                        System.out.println("Dang it! I don't know how we are going to fit all these cows in here! ");
//                     else condiiton multiple outcomes for the same condition   
                    }else{
                        System.out.println("Too many ships! Not enough cows");
                    }
        
        if(aliens > cows){
            System.out.println("Hurrahm we're got the grub! Hamburger party on Alpha Centauri!");
        }else{
        
        System.out.println("Oh no! the herds got restless and took over! Looks like_we're_hamburger now!");
    
}
}
}