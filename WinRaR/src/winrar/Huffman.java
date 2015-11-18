/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package winrar;

/**
 *
 * @author megarokr
 */
public class Huffman {

    public Huffman(char value, int frecuency) {
        this.value = value;
        this.frecuency = frecuency;
    }

    public Huffman(char value) {
        this.value = value;
        this.frecuency = 0;
    }
    
    public Huffman(int frecuency) {
        this.frecuency = frecuency;
    }

    public Huffman() {
    }

    public char getValue() {
        return value;
    }

    public void setValue(char value) {
        this.value = value;
    }

    public int getFrecuency() {
        return frecuency;
    }
    
    public void addFrecuency(){
        frecuency++;
    }

    public void setFrecuency(int frecuency) {
        this.frecuency = frecuency;
    }

    @Override
    public String toString() {
        return "["+value+"|"+frecuency+"]";
    }
    
    

    char value;
    int frecuency;
}
