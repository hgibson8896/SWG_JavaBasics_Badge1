/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.methods;

import java.util.Scanner;

/**
 *
 * @author hgibs
 */
public class WindowMaster {
    
    public static void main(String[] args) {
        
        
        float height = readValue("Please enter the window height");
        float width = readValue("Please enter the window width");
        float area = height * width;
        float perimeter = 2 * (height + width);
        float cost = ((3.50f * area) + (2.25f * perimeter));
        
        
        System.out.println("Window height = " + height);
        System.out.println("Window width = " + width);
        System.out.println("Window are = " + area);
        System.out.println("Window perimeter = " + perimeter);
        System.out.println("Total cost = " + cost );
    }
//     take in a parameter of string
    public static float readValue(String prompt){

        Scanner userInput = new Scanner(System.in);
// output prompt so that the user knows what to do       
        System.out.println(prompt);
//  return float value      
        String input = userInput.nextLine();
        float floatVal = Float.parseFloat(input);
        
        return floatVal;
        
    }
    
}
