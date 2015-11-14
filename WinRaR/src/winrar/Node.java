/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package winrar;

/**
 *
 * @author rick
 */
public class Node {
    
    private Node rightChild;
    private Node leftChild;
    int value;

    public Node(int value) {
        this.value = value;
        rightChild = null;
        leftChild = null;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    
    public boolean hasRightChild(){
        if (rightChild == null){
            return false;
        }
        
        return false;
    }
    
    public boolean hasLeftChild(){
        if (leftChild == null){
            return false;
        }
        
        return false;
    }
    
    
    
    
}
