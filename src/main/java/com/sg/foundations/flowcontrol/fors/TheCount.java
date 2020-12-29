/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.fors;

import java.util.Scanner;

/**
 *
 * @author hgibs
 */
public class TheCount {
    
    public static void main(String[] args) {
        
        System.out.println("*** I LOVE TO COUNT! LET ME SHARE MY COUNTING WITH YOU! ***");
        
       int start;
       String stringStart;
       
       int stop;
       String stringStop;
       
       int count;
       String stringCount;
        
        
        Scanner userStart = new Scanner(System.in);
        
        System.out.println("Start at:");
        stringStart = userStart.nextLine();
        start = Integer.parseInt(stringStart);
        
             
        Scanner userStop = new Scanner(System.in);
        
        System.out.println("Stop at:");
        stringStop = userStop.nextLine();
        stop = Integer.parseInt(stringStop);
        
             
        Scanner userCount = new Scanner(System.in);
        
        System.out.println("Count by:");
        stringCount = userCount.nextLine();
        count = Integer.parseInt(stringCount);
        
        
        for( int i = start; i < stop + 1; i = i + count){
            
            int newCount= i;
            
            if(i % 3 == 0){
                System.out.println(i + " - Ah  ah ah !" );
            }else{
                System.out.println(i);
            
     
                

       
            }
            
        }
    }
    
}
