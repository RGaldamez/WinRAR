/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author megarokr
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File file = new File("//home//megarokr//NetBeansProjects//prueba//src//prueba//otronombre.txt");
        compress(file);
        for (int i = 0; i < diccionario.size(); i++) {
            System.out.println(((Word)diccionario.elementAt(i).getValue()).toString());
        }
    }
    public static void compress(File file){
        //leer file
        String buffer = "";
        try {
            FileReader reader = null;
            reader = new FileReader(file);
            BufferedReader buffer_reader = new BufferedReader(reader);
            String temp;
            while((temp = buffer_reader.readLine()) != null){
                buffer += temp;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        List huffmen = new List();
        boolean exists;
        for (int i = 0; i < buffer.length(); i++) {
            exists = false;
            for (int j = 0; j < huffmen.size(); j++) {
                if(((Huffman)huffmen.elementAt(j).getValue()).getValue() == buffer.charAt(i)){
                    ((Huffman)huffmen.elementAt(j).getValue()).addFrecuency();
                    exists = true;
                    break;
                }
            }
            if(!exists){
                huffmen.push_back(new Huffman(buffer.charAt(i)));
            }
        }
        List nodes = new List();
        int min = 0;
        while(huffmen.size() > 0){
            min = ((Huffman)huffmen.elementAt(0).getValue()).getFrecuency();
            for(int i = 0; i < huffmen.size(); ++i){
                if(((Huffman)huffmen.elementAt(i).getValue()).getFrecuency() < min){
                    min = ((Huffman)huffmen.elementAt(i).getValue()).getFrecuency();
                }
            }
            for(int i = 0; i < huffmen.size(); ++i){
                if(((Huffman)huffmen.elementAt(i).getValue()).getFrecuency() == min){
                    nodes.push_back(new TreeNode((Huffman)huffmen.elementAt(i).getValue()));
                    huffmen.remove(i);
                }
            }
        }
        BinaryTree arbol = new BinaryTree();
        arbol = llenarArbol(nodes, arbol);
        String temp ="";  // :D
        diccionario = diccionario(arbol.getRoot(), arbol.getRoot(), diccionario, temp);

    }
    public static BinaryTree llenarArbol(List nodes, BinaryTree tree){
        if(nodes.size() == 2){
            int suma = ((TreeNode)nodes.elementAt(0).getValue()).getValue().getFrecuency() + ((TreeNode)nodes.elementAt(1).getValue()).getValue().getFrecuency();
            TreeNode nodo_temp = new TreeNode(new Huffman(suma));
            nodo_temp.setLeftChild((TreeNode)nodes.elementAt(0).getValue());
            nodo_temp.setRightChild((TreeNode)nodes.elementAt(1).getValue());
            tree.setRoot(nodo_temp);
            nodes = new List();
            return tree;
        }
        else{
            int suma = ((TreeNode)nodes.elementAt(0).getValue()).getValue().getFrecuency() + ((TreeNode)nodes.elementAt(1).getValue()).getValue().getFrecuency();
            TreeNode nodo_temp = new TreeNode(new Huffman(suma));
            nodo_temp.setLeftChild((TreeNode)nodes.elementAt(0).getValue());
            nodo_temp.setRightChild((TreeNode)nodes.elementAt(1).getValue());
            nodes.remove(0);
            nodes.remove(0);

            boolean menor = false;
            for (int i = 0;i < nodes.size() ;++i ) {
                if(suma < ((TreeNode)nodes.elementAt(i).getValue()).getValue().getFrecuency()){
                    nodes.insert(i, nodo_temp);
                    menor = true;
                    break;
                }
            }
            if(!menor){
                nodes.push_back(nodo_temp);
            }
            return llenarArbol(nodes,tree);
        }
    }
    public static List diccionario(TreeNode node,TreeNode root, List diccionario, String word){
        if(node.hasLeftChild() && node.getLeftChild().isDone() && node.hasRightChild() && node.getRightChild().isDone()){
            if(node == root){
                System.out.println("ya volvi");
                return diccionario;
            }
            else{
                node.setDone(true);
                return diccionario(root,root,diccionario,"");
            } 
        }
        else if(node.hasLeftChild() && !node.getLeftChild().isDone()){
            if(node.getLeftChild().isLeaf()){
                word += "0";
                diccionario.push_back(new Word(word,node.getValue().getValue()));
                node.getLeftChild().setDone(true);
                System.out.println("agregue left");
                return diccionario(root,root,diccionario,"");
            }
            System.out.println("me movi left");
            return diccionario(node.getLeftChild(),root,diccionario, word += "0");
        }
        else if(node.hasRightChild() && !node.getRightChild().isDone()){
            if(node.getRightChild().isLeaf()){
                word += "1";
                diccionario.push_back(new Word(word,node.getValue().getValue()));
                node.getRightChild().setDone(true);
                System.out.println("agregue right");
                return diccionario(root,root,diccionario,"");
            }
            System.out.println("Me movi right");
            return diccionario(node.getRightChild(),root,diccionario,word += "1");
        }        
        
        System.out.println("cai aca");
        return diccionario;
    }
    private static List diccionario = new List(); 
}
