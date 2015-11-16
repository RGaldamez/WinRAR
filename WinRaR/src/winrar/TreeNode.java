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
    int value;

    public TreeNode(int value) {
        this.value = value;
        rightChild = null;
        leftChild = null;
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
