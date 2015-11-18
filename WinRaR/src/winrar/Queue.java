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
public class Queue {
    
    public Queue(Object value) {
        lista = new List(value);
        head = lista.first();
    }
    public Queue() {
        lista = new List();
    }
    public void queue(Object value){
        lista.push_back(value);
        head = lista.last();
    }
    public Node dequeue(){
        Node temp = lista.first();
        lista.remove(0);
        head = lista.first();
        return temp;
    }
    public Object peek(){
        return lista.first().getValue();
    }
    public void print(){
        lista.print();
    }
    public int size(){
        return lista.size();
    }
    List lista;
    Node head;
}
