/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.arrays;

/**
 *
 * @author hgibs
 */
public class FruitSalad {
    
    public static void main(String[] args) {
        
        String[] fruit = {"Kiwi Fruit", "Gala Apple", "Granny Smith Apple", "Cherry Tomato", "Gooseberry", "Beefsteak Tomato", 
            "Braeburn Apple", "Blueberry", "Strawberry", "Navel Orange", "Pink Pearl Apple",  "Raspberry", "Blood Orange", "Sungold Tomato", 
            "Fuji Apple", "Blackberry", "Banana", "Pineapple", "Florida Orange", "Kiku Apple", "Mango", "Satsuma Orange", "Watermelon", "Snozzberry"};
        
        int apples = 0;
        int oranges = 0;
        int count = 0; 
        
        String[] fruitSalad = new String[12];
        
        
        for(int i = 0; i < fruit.length; i++){
            if(count < 12){

            if(fruit[i].contains("berry")){
                fruitSalad[count++]= fruit[i];
            }else if(fruit[i].contains("Apple") && apples < 3){
                fruitSalad[count++]= fruit[i];
                apples++;
                
            }else if(fruit[i].contains("Orange")&& oranges < 2){
                fruitSalad[count++] = fruit[i];
                oranges++;
            }else if(!fruit[i].contains("Tomato")){
                fruitSalad[count++] = fruit[i];
                
            }
        }
        }
            
        
        for(int i = 0; i < fruitSalad.length ; i++){
            System.out.print(fruitSalad[i] + ", ");
    }
    
}
}