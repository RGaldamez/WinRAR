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
public class Node {

    public Node(Object value) {
        this.value = value;
    }

    public Node() {
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return ""+value;
    }
    public boolean hasNext(){
        if(next != null)
            return true;
        return false;
    }
    protected Object value;
    protected Node next;
}
