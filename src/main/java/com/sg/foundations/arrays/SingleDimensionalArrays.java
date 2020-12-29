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
public class SingleDimensionalArrays {
    
    public static void main(String[] args) {
        
        int[] teamScores;
//        arrays are objects like Scanner-- creatw new one using the "new" keyword

        teamScores = new int[5]; //resserved 5 places in the memory, but there are no values yet
//        assign values to each of the slots-- must indicate which slot to put the value in
        teamScores[0] = 2;
        teamScores[1] = 45;
        teamScores[2] = 4;
        teamScores[3] = 8;
        teamScores[4] = 99; // last index in array is always length -1
//         declared and intialialzed arrays
// shortcut for above

        int[] golfScores = { 72, 74, 68, 71};// declared the variable of type int array and enough memory for 4 slots and intialized them 
        
//        how to manipulate elements in array-- always start from 0

        int currentGolfScore = golfScores[0];// {72}
        golfScores[2]= 70;// { 72, 74, 70, 71}
        
//        interate over an array
// 0 = first index in array  
        for(int i = 0; i < golfScores.length; i++){
            System.out.println(golfScores[i]);// print golf scores
        }
        System.out.println("");
//        enhanced for loop
// pull out all elements of golfScore and put them in Current Score
        for(int currentScore:  golfScores){
            System.out.println(currentScore);
        }

    }
    
}
