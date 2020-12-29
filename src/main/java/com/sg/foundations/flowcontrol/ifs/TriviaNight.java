/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

/**
 *
 * @author hgibs
 */
public class TriviaNight {
    
    public static void main(String[] args) {
        
        Scanner readerInput = new Scanner(System.in);
        
        int answer1 = 0;
        int answer2 = 0;
        int answer3 = 0;
        int answer4 = 0;
        int sum = 0;
              
        String string1, string2, string3, string4;
        
        
        System.out.println("FIRST QUESTION" + "\n" + "What is the Lowest Level Programming Language?" + "\n" + "1. Source Code" +
                "\n" + "2. Assembly Language" + "\n" + "3. C#" + "\n" + "4. Machine Code");
        
        string1 = readerInput.nextLine();
        answer1 = Integer.parseInt(string1);
        
        if(answer1  == 4){
            System.out.println("You got it right answer!: " + answer1);
            answer1 = 1;
            sum = answer1;
        } else{
            System.out.println("Sorry you chose the wrong answer");
        }
        
        System.out.println("SECOND QUESTION" + "\n" + "Website Security CAPTCHA Forms are Descended From the Work of?" + "\n" + "1. Grace Hopper" +
                "\n" + "2. Alan Turing" + "\n" + "3. Charles Babbage" + "\n" + "4. Larry Page");
        
        string2 = readerInput.nextLine();
        answer2 = Integer.parseInt(string2);
        
        if(answer2  == 2){
            System.out.println("You got it right answer!" + answer2);
            answer2 = 1;
            sum = sum + answer2;
        } else{
            System.out.println("Sorry you chose the wrong answer");
        }
        
                
        System.out.println("LAST QUESTION" + "\n" + "Which of These Sci-Fi Ships Was Once Slated For a Full-Size Replica in Las Vegas?" + "\n" + "1. Serenity" +
                "\n" + "2. The Battlestar Galactica" + "\n" + "3. The USS Enterprise" + "\n" + "4. The Millenium Falcon");
        
        string3 = readerInput.nextLine();
        answer3 = Integer.parseInt(string3);
        
        if(answer3  == 3){
            System.out.println("You got it right answer!" + answer2);
            answer3 = 1;
            sum = sum + answer3;
        } else{
            System.out.println("Sorry you chose the wrong answer");
        }
       
      
        System.out.println("Nice job you " + sum + " correct!");
         
    }
    
}
