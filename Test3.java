/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test3;

import java.util.Scanner;

public class Test3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String suatuString;
       int i, j,panjang;
       char karakter;
       Scanner scan = new Scanner (System.in);
       suatuString = scan.nextLine();
       
       panjang =  suatuString.length();
       for (i = 0; i < panjang; i++){
       for (j = i; j<panjang ; j++){
         karakter = suatuString.charAt (j);
         System.out.print(karakter);
       }
       }
        
        }
} 
