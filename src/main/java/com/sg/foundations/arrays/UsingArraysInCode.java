/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.arrays;

/**
 *
 * @author hgibs
 */
public class UsingArraysInCode {
    
    public static void main(String[] args) {
//         finding sum, min, and max of an array
        int[] numbers = { 3, 7, 2, 4, 7, 12};
        
//        
        int sum = 0;// always start here
        int min = numbers[0];//3 index 0 // default value
        int max = numbers [0];// 3 index 0 // default value
//   < numbers.length means index less than 6 will be stop... <=numbers.length -1  means numbers less than or equal to 5 will be the stoppping point for the loop    
//    read every element in array LENGTH STARTS AT 1 -- ARRAYS START AT 0
        for(int i = 0; i < numbers.length; i++ ){// i <= numbers.length-1 is the same 
            sum+= numbers[i];// add all numbers as the index is looped through, running total , number at index value added to current value of the loop
            
            if(numbers[i] < min){//if numbers[i] < min==3
                min = numbers[i];// new min will be 2--- only when value is less thann the current value it will be stored
            }
            
            if(numbers[1] > max){// sama as above but with max 
                max = numbers[i];
            }
        }
                
        
    }
    
}
