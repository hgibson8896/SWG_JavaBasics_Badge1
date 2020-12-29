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
public class BirthStones {
    public static void main(String[] args) {
        
        Scanner readerInput = new Scanner(System.in);
        
        int birthMonth;
        String stringBirthMonth;
        
        System.out.println("What month's birthstone do you want to know?");
        
        stringBirthMonth = readerInput.nextLine();
        birthMonth = Integer.parseInt(stringBirthMonth);
      
        switch(birthMonth){
            case 1:
                System.out.println("January's birthstone is Garnet");
                break;
            case 2:
                System.out.println("February's birthstone is Amythest");
                break;
            case 3:
                System.out.println("March's birthstone is Aquamarine");
                break;
            case 4:
                System.out.println("April's birthstone is Diamond");
                break;
            case 5:
                System.out.println("May's birthstone is Emerald");
                break;
            case 6:
                System.out.println("June's birthstone is Pearl");
                break;
            case 7:
                System.out.println("July's birthstone is Ruby");
                break;
            case 8:
                System.out.println("August's birthstoene is Peridot");
                break;
            case 9:
                System.out.println("September's birthstone is Sapphire");
                break;
            case 10:
                System.out.println("OCtober's birthstone is Opal");
                break;
            case 11:
                System.out.println("November's birthstone is Topaz");
                break;
            case 12:
                System.out.println("December's birthstone is Turquoise");
                break;
            default:
                System.out.println("Invalid month");
                break;
                
        }
        

   
        
                
              
        }

        
        
        
    }
    
