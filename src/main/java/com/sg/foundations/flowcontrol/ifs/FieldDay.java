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
public class FieldDay {
    
    public static void main(String[] args) {
        
        Scanner readerInput = new Scanner(System.in);
        
        String LastName;
        int intLastName;
        
        String name1  = "Baggins";
        String name2 = "Dresden";
        String name3 = "Howl";
        String name4 = "Potter";
        String name5 = "Vimes";
        
        
        System.out.println("What's your last name?");
        LastName = readerInput.nextLine();
        
      //      compare 2 strings

         if(LastName.compareTo(LastName) < name1.compareTo(LastName)){
             System.out.println("Time to bring the fire! You'r on the 'Red Dragaons'!");
         }
         
         if(LastName.compareTo(LastName) > name1.compareTo(LastName) && LastName.compareTo(LastName) < name2.compareTo(LastName)){
             
             System.out.println("Lets get magical! You're on the 'Dark Wizards'!");
         }
         
          if(LastName.compareTo(LastName) > name2.compareTo(LastName) && LastName.compareTo(LastName) < name3.compareTo(LastName)){
             
             System.out.println("Time to claim the empire! You're on the 'Moving Castles'!");
         }
          
           if(LastName.compareTo(LastName) > name3.compareTo(LastName) && LastName.compareTo(LastName) < name4.compareTo(LastName)){
             
             System.out.println("Not sure what this name is, but you're on the 'Golden Snitches'!");
         }
           
            if(LastName.compareTo(LastName) > name4.compareTo(LastName) && LastName.compareTo(LastName) < name5.compareTo(LastName)){
             
             System.out.println("Hope your're not afraid on the dark! You're on the 'Night Guards'!" );
         }
            
            if(LastName.compareTo(LastName)> name5.compareTo(LastName)){
                System.out.println("How Spooky! you're on the 'Black Holes'!");
                
                
    }
            
            System.out.println("Good luck in the games!");
    }
}
