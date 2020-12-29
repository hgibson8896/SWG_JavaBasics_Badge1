/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.random;

import java.util.Random;

/**
 *
 * @author hgibs
 */
public class CoinFlipper {
    
    public static void main(String[] args) {
        
        Random coinFlip = new Random();
        
        boolean flip = coinFlip.nextBoolean();
        
        System.out.println("Ready, Set, Flip ...!!");
        
        if( flip == true){
            System.out.println("You got HEADS");
        }else{
            System.out.println("You got TAILS");
        }
    }
    
}
