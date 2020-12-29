/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.fors;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author hgibs
 */
public class ForTimes {
    
    public static void main(String[] args) {
        
        double score = 15;
        int num;
        String stringNum;
        
        int multSum;
        
        Scanner userInput = new Scanner(System.in);
        
        
        System.out.println("Which times table shall I recite");
        
        stringNum = userInput.nextLine();
        num = Integer.parseInt(stringNum);
        
        
       
        for(int i = 1 ; i < 16; i++){
            multSum = i * num;
            
            
           
            Scanner userAnswer = new Scanner(System.in);
            
            System.out.println("What is " + i + " * " + num + " ?");
            
            
            int answer;
            String stringAnswer;
            
            stringAnswer = userAnswer.nextLine();
            answer = Integer.parseInt(stringAnswer);
            
            
            
            if(answer == multSum){
                System.out.println("CORRECT!!");
                
                          
                 }else{
                System.out.println("Sorry no, The correct answer is " + multSum);
                score = score - 1;
            }
            

   
        
    }
        
        System.out.println("You got " + score + " correct.");
        
        double newScore = Math.round(score);
        
        double percentage = (newScore/15) * 100;
        
       
        System.out.println("You got " + percentage + " % correct.");
        
        if(score > Math.floor(15 *.9)){
            System.out.println("Great Job over 90%!");
        }else if(score < Math.floor(15 * .5)){
            System.out.println("You need to study more!");
        }
        
   
    }}
        
   
   

