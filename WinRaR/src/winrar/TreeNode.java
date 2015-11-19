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
public class TreeNode {
    
    private TreeNode rightChild;
    private TreeNode leftChild;
    Huffman value = new Huffman();
    private boolean done;

    public TreeNode(Huffman value) {
        this.value = value;
        rightChild = null;
        leftChild = null;
        done = false;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public Huffman getValue() {
        return value;
    }

    public void setValue(Huffman value) {
        this.value = value;
    }
    
    public boolean hasRightChild(){
        if (rightChild == null){
            return false;
        }
        
        return true;
    }
    
    public boolean hasLeftChild(){
        if (leftChild == null){
            return false;
        }
        
        return true;
    }
    
    public boolean isDone(){
        return done;
    }
    
    public void setDone(boolean done){
        this.done = done;
    }
    
    public boolean isLeaf(){
        if(!hasLeftChild() && !hasRightChild())
            return true;
        return false;
    }
    
}
