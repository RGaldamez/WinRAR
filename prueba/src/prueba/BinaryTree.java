/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

/**
 *
 * @author rick
 */
public class BinaryTree {
    
    
    private TreeNode root;

    public BinaryTree(TreeNode root) {
        this.root = root;
    }

    public BinaryTree() {
        root = null;
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }
    
    public void add(int value) {
        
        /*if (value > root.getValue() && !root.hasRightChild()){
            root.setRightChild(new TreeNode(value));   
            
        }else if (value > root.getValue() && root.hasRightChild()){
            BinaryTree arbolTemp = new BinaryTree(root.getRightChild());
            arbolTemp.add(value);
            
        }else if (value < root.getValue() && !root.hasLeftChild()){
            root.setLeftChild(new TreeNode(value));
            
        }else if (value < root.getValue() && root.hasLeftChild()){
            BinaryTree arbolTemp = new BinaryTree (root.getLeftChild());
            arbolTemp.add(value);
        }else if (value == root.getValue()){
            if (root.hasLeftChild() && root.hasRightChild()){
                //Comprobar luego
                BinaryTree arbolTemp = new BinaryTree(root.getLeftChild());
                arbolTemp.add(value);
                
            }else if (!root.hasLeftChild() && root.hasRightChild()){
                root.setLeftChild(new TreeNode(value));
                
            }else if (root.hasLeftChild() && !root.hasRightChild()){
                root.setRightChild(new TreeNode(value));
            }else{
                // Revisar luego
            }
        }*/
    }
    
    
    
    

    
}
    
    
    
    