/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.variables;
import java.util.Scanner;


/**
 *
 * @author hgibs
 */
public class BestAdderEver {
    
    public static void main(String[] args) {
        
        int num1 = 0 ;
        int num2 = 0;
        int num3 = 0;
        
        Scanner readerInput = new Scanner(System.in);

      String stringNum1;
      String stringNum2;
      String stringNum3;
      
        System.out.println("please enter the first number: ");
        
        boolean isValid = false;
        
        do{
            try{
                
                stringNum1 = readerInput.nextLine();
                num1 = Integer.parseInt(stringNum1);
                break;
                                
            }catch(NumberFormatException ex){
            System.out.println("Please enter a valid number: ");
     
            }
                
        }while(!isValid);
        
        
      System.out.println("please enter the second number: ");

                do{
            try{
                
                stringNum2 = readerInput.nextLine();
                num2 = Integer.parseInt(stringNum2);
                break;
                                
            }catch(NumberFormatException ex){
            System.out.println("Please enter a valid number");

            }
                
        }while(!isValid);
                
            System.out.println("please enter the third number");

                
                
            do{
            try{
                
                stringNum3 = readerInput.nextLine();
                num3 = Integer.parseInt(stringNum3);
                break;
                                
            }catch(NumberFormatException ex){
                
                System.out.println("Please enter a valid number");
            } 
                
        }while(!isValid);
                
       int sum = num1 + num2 + num3;

        
        System.out.println(num1 + " + " + num2 + " + " + num3 + " = " + sum);
        
    }
    
}
