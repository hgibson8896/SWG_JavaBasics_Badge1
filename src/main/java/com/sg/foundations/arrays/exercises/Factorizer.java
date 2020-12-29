/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.arrays.exercises;

import java.util.Scanner;

/**
 *
 * @author hgibs
 */
public class Factorizer {
    
    public static void main(String[] args) {
        
        
        
        Scanner userInput = new Scanner(System.in);
        
        int number; 
        String stringNumber; 
        int count= 0; 
        int sum = 0; 
           
        System.out.println("What number would you like to factor?");
        
        stringNumber = userInput.nextLine();
        number = Integer.parseInt(stringNumber);
        
        System.out.println("The factors of " + number + " are:");
        
        for(int i = 1; i <= number; i++){
            if(number % i == 0){
                count++;
                sum+=i; 
                
                System.out.print(i + " ");
            }
            
        }System.out.println();
        
        System.out.println(number + " has " + count + " factors");
        
        if(sum - number == number){
            System.out.println(number + " is a perfect number");
        }else{
            System.out.println(number + " is not a perfect numnber");
        }
        
        if(sum == 1 + number && number > 1){
            System.out.println(number + " is a prime number");
        }else{
            System.out.println(number + " is not a prime number");
        }
        
        
        
    }
}
        
 