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
public class List {
    public List(Object value) {
        this.head = new Node(value);
    }
    public List() {
    }
    public void insert(int posicion, Object valor){
        if(posicion > 0){
            if(!head.hasNext()){
                if(posicion == 1){
                    head.setNext(new Node(valor));
                }
                else if(posicion > 1){
                    System.err.println("Index out of bounds");
                }
                else{
                    Node temp = head;
                    head.setValue(valor);
                    head.setNext(temp);
                }
            }
            else{
                Node temp = head;
                int cont = 0;
                if(size() >= posicion){
                    while(cont < posicion-1){
                        temp = temp.getNext();
                        cont++;
                    }
                    Node nuevo = new Node(valor);
                    if(temp.hasNext()){
                        Node temp2 = temp.getNext();
                        nuevo.setNext(temp2);                        
                    }
                    temp.setNext(nuevo);
                }
            }
        }
        else if(posicion == 0){
            if(head != null){
                Node temp = head;
                setHead(new Node(valor));
                head.setNext(temp);
            }
            else{
                setHead(new Node(valor));
            }
        }
        else{
            System.err.println("Invalid position");
        }
    }
    public int find(Object valor){
        int contador = 0;
	Node temp = head;
	while(temp.hasNext()){
            if(temp.getValue() == valor)
                return contador;
            temp = temp.getNext();
            contador++;
	}
	return -1;
    }
    public Node elementAt(int posicion){
        int contador = 0;
	Node temp = head;
        if(size() > posicion){
            if(posicion == 0){
                return head;
            }
            while(contador < posicion){
                temp = temp.getNext();
                contador++;
            }
            return temp;
        }
	return new Node();
    }
    public void remove(int posicion){
        if(size() > posicion){
            if(posicion == 0){
                setHead(head.getNext());
            }
            else if(posicion == 1){
                Node temp = head;
                temp = temp.getNext();
                temp = temp.getNext();
                head.setNext(temp);
            }
            else{
                int contador = 0;
                Node temp = head;
                while(contador < posicion-1){
                    temp = temp.getNext();
                    contador++;
                }
                Node temp2 = temp.getNext();
                Node temp3 = temp2.getNext();
                temp.setNext(temp3);
            }
        }
        else{
            System.err.println("Index out of bounds");
        }
    }
    public Node first(){
        return head;
    }
    public void concat(List lista){
        Node temp = head;
	while(temp.hasNext())
            temp = temp.getNext();
	temp.setNext(lista.first());
    }
    public void print(){
        if(head != null){
            if(head.hasNext()){
                System.out.print("[");
                Node temp = head;
                for (int i = 0; i < size(); i++) {
                    if(temp.hasNext()){
                        System.out.print(temp.toString()+",");
                        temp = temp.getNext();
                    }
                    else{
                        System.out.print(temp.toString()+"]"); 
                    }
                }
            }
            else{
                System.out.println("["+head.toString()+"]");
            }
        }
    }
    public int size(){
        int size = 0;
        if(head != null){
            size++;
            Node temp = head;
            while(temp.hasNext()){
                size++;
                temp = temp.getNext();
            }
        }
        return size;
    }
    public void push_back(Object value){
        insert(size(),value);
    }
    public void setHead(Node head){
        this.head = head;
    }
    public Node last(){
        return elementAt(size()-1);
    }
    
    private Node head;
}
