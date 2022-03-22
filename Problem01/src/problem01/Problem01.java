/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem01;

import java.io.FilePermission;
import java.util.Scanner;
import java.util.*;
/**
 *
 * @author Saifur
 */
public class Problem01 {

        public static String getValue(char FileSymbol) {
        
        
       // firstly we set the numeric value according to file permisssion symbolic notation
       if(FileSymbol == 'r'){
          return "4"; 
       }
       else if(FileSymbol == 'w'){
          return "2"; 
       }
       else if(FileSymbol == 'x'){
          return "1"; 
       }
       else if(FileSymbol == '-'){
          return "0"; 
       }
       else{
           return null;
       }
    }

   public static int decodeSymbolicNotation(String FileSymbol)
   {
        int i=1;
        boolean f=true;
        String result= "";
        String count = "";
        while (i <= FileSymbol.length()) {
            // input character is valid character or not
            if (Problem01.getValue(FileSymbol.charAt(i - 1)) != null) {
                count += Problem01.getValue(FileSymbol.charAt(i - 1));
                if (i % 3 == 0) {
                    result=result+count;
                    count = "";
                }
            } else {
                System.out.println("invalid Input");
                f=false;
                break;
            }
            i++;
        }
        if(f){
            return Integer.parseInt(result);
        }
        else
        {
            return -1;
        }
   }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 1;
        System.out.println("Enter 3 symbolic character: ");
        String input = in.next();
        System.out.println( Problem01.decodeSymbolicNotation(input));
    }

    
}
