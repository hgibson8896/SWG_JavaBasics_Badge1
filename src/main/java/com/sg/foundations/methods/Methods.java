/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.methods;

/**
 *
 * @author hgibs
 */
public class Methods {
    
    public static void main(String[] args) {
        
        
        int operand1 = 3;
        int operand2 = 7;
        int sum = addTwo(operand1, operand2);
        System.out.println(sum);
        
        sum = addTwo(32, 42);
        System.out.println(sum);
        
        System.out.println(addTwo(10, 77));
        
//        
//        silly(42);
//        int num = 42;
//        num = 5 + 4;
//        silly(num);
        
//       int num = getFive();
//        System.out.println(num);
//        
//        System.out.println(getFive());
        
    }
    
    
//    public static void doIt(){
//        System.out.println("Hello");
//    }
    
//    public static int getFive(){
//        return 5;
//    }
//             
    
//    public static void silly(int i){
//        System.out.println("My parameter is " + i);
//        
//    }
    
    public static int addTwo(int a, int b){
        return a + b;
    }
    
}
