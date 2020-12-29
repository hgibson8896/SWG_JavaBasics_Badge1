/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.fors;

/**
 *
 * @author hgibs
 */
public class ForByFor {
    
    public static void main(String[] args) {
        
        
//        rows the first / and establishes the three rows 0-2
        for(int i= 0; i < 3; i++){
            System.out.print("|");
        // columns
            for(int j = 0; j < 3; j++){
                
// defines whats inside the cell-- put conditionals on the rows and colums to deteermine what goes inside
                for(int k = 0; k < 3; k++){
                    
                    if(i == 1 && j == 1){
                        System.out.print("#");
                    }else if(i == 1){
                        System.out.print("@");
                    }else if(i !=1 && j == 1 ){
                        System.out.print("$");
                    }else{
                        System.out.print("*");
                    }
                 
                    
                           
                }
                System.out.print("|");
            }
            System.out.println(" ");    
        }
    }
    
}
