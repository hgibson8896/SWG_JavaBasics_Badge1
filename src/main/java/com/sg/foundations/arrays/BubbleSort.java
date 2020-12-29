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
public class BubbleSort {
    
    public static void main(String[] args) {
//        algorithym for sorting arrays-- 
// strating from L compare the current number with one the R, if the number on the R is SMALLER than the current one then we swap-- goes from smallest to largest
// First element of an array is index 0
// Last element of an array is at index length -1
//always check your array boundaries
// never assume that array data exists and the length is what you expect

        int[] numbers = { 3, 7, 2, 4, 7, 12};
        int temp;
//       goes through the indexes of the arrays
        for( int i = 0; i < numbers.length ; i ++){
//            it will take one less than the arrays numbers of passes to be sure we have gone throgh all possiblities
            for(int j = 0; j < numbers.length -1; j ++){// the last index in the array has no value to to R-- must go less than -- make sure loop stops one lengthh befor the last loop
                //                temporory storage area for swapping code because variable cannot be in two placecs at the same time
//                comparing the values from L to R
                    if(numbers[j] > numbers [ j + 1]){//  value to the R is always [j +1]
                        temp = numbers[j];//when number to R is larger place it in temp
                        numbers[j] = numbers[j + 1];// replace the temp element with the one next to it
                        numbers[j + 1] = temp;// replace the one next to it with temo
                    }
            }
                
        }
        
        
    }
    
}
