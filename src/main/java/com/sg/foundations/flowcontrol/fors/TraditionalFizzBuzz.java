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
public class TraditionalFizzBuzz {
    
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        
        int number;
        String stringNumber;
        
        System.out.println("How many units of fizzing and buzzing do you need in your life?");
   
        stringNumber = userInput.nextLine();
        number = Integer.parseInt(stringNumber);
        
        System.out.println(" ");
        int count = 0; 
        for(int i = 0; i < Integer.MAX_VALUE; i++){
            
            
           if(i % 3 == 0 && i % 5 == 0 && i >0){
               System.out.println("fizz buzz");
               count++;
           
           }else if(i % 3 == 0 && i > 0 ){
                System.out.println("fizz");
                count++;
            
           }else if(i % 5 == 0 && i > 0 ){
                System.out.println("buzz");
                count++;

            }else{
                System.out.println(i);
           
            }
            if(count == number){
            System.out.println("TRADITION");
            break;
    }
                  
        } 

    }
}