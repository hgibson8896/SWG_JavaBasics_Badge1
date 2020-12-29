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
public class MultiDimensionalArray {
    
    public static void main(String[] args) {
    
//        jagged array
// an array of an array
        String [][] cityTeamNames = {
            {"Cleveland", "Browns", "Cavs", "Indians"},
            {"Columbus", "BlueJackets", "Buckeyes"},
            {"Pittsburgh", "Steelers", "Pirates", "Penguins"},
        };
        
//        print Cleveland
        System.out.println(cityTeamNames[0][0]);
//        print Columbus
        System.out.println(cityTeamNames[1][0]);
//        print Buckeyes
        System.out.println(cityTeamNames[1][2]);
        
//        print out everything in two dimensional jagged array

//outter loop for rows
// inner loop for colums
//use nested for loop-- 

        for(int i = 0; i < cityTeamNames.length; i++){
//            index goes back to i as we loop through the rows
            for(int j = 0; j < cityTeamNames[i].length; j++ ){
                System.out.print(cityTeamNames[i][j] + " ");// add blank space to look nicer
            }
            System.out.println("");// goes to next line
        }
    }
    
}
