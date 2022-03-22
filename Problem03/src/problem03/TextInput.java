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
public class TextInput implements Input{

    String userInput="";
    
    @Override
    public void add(char character) {
      this.userInput = this.userInput + character;
    }

    @Override
    public String getValue() {
       return userInput;
    }
    
}
