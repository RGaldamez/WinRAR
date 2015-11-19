/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

/**
 *
 * @author megarokr
 */
public class Word {

    public Word(String binary_code, char character) {
        this.binary_code = binary_code;
        this.character = character;
    }

    public String getBinary_code() {
        return binary_code;
    }

    public void setBinary_code(String binary_code) {
        this.binary_code = binary_code;
    }

    public char getCharacter() {
        return character;
    }

    public void setCharacter(char character) {
        this.character = character;
    }

    public Word() {
    }
    
    @Override
    public String toString(){
        return character + "   " + binary_code;
    }
    String binary_code;
    char character;
}
