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
public class Stack {

    public Stack(Object value) {
        lista = new List(value);
        top = lista.first();
    }
    public Stack() {
        lista = new List();
    }
    public void push_back(Object value){
        lista.push_back(value);
        top = lista.last();
    }
    public Node pop_back(){
        Node temp = lista.last();
        lista.remove(lista.size()-1);
        top = lista.last();
        return temp;
    }
    public Object peek(){
        return lista.last().getValue();
    }
    public void print(){
        lista.print();
    }
    public int size(){
        return lista.size();
    }
    List lista;
    Node top;
}
