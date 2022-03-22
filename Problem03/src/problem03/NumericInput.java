/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem03;

/**
 *
 * @author Saifur
 */
public class NumericInput extends TextInput{
    
    @Override
    public void add(char character) {
      
        if(Character.isDigit(character)){
        
            super.userInput = super.userInput + character;
        }
        
    }
    
}
