/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package winrar;

import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author rick
 */
public class Console extends javax.swing.JFrame {

    /**
     * Creates new form Console
     */
    public Console() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        this.jt_direccion.setText(directory.getAbsolutePath());
        this.jt_comando.setText("");
        this.jl_directorio.setModel(new DefaultListModel());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl_listaComandos = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jd_comparacion = new javax.swing.JDialog();
        jt_direccion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jl_directorio = new javax.swing.JList();
        jt_comando = new javax.swing.JTextField();
        jb_listaComandos = new javax.swing.JButton();

        jl_listaComandos.setTitle("HELP");
        jl_listaComandos.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                jl_listaComandosWindowClosing(evt);
            }
        });

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "cd <folder name>: cambiara la ruta actual de la consola a la del folder.", "Ejemplo:", "cd <Desktop>", " ", "ls: listara los archivos y directorios de la carpeta actual.", " ", "compress <filename.txt> ", "Ejemplo:", " ", "diff <filename.txt>: mostrara una venta de comparacion entre ", "el archivo comprimido y el archivo original.", " ", "help", "Muestra esta ventana" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        javax.swing.GroupLayout jl_listaComandosLayout = new javax.swing.GroupLayout(jl_listaComandos.getContentPane());
        jl_listaComandos.getContentPane().setLayout(jl_listaComandosLayout);
        jl_listaComandosLayout.setHorizontalGroup(
            jl_listaComandosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jl_listaComandosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
                .addContainerGap())
        );
        jl_listaComandosLayout.setVerticalGroup(
            jl_listaComandosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jl_listaComandosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jd_comparacionLayout = new javax.swing.GroupLayout(jd_comparacion.getContentPane());
        jd_comparacion.getContentPane().setLayout(jd_comparacionLayout);
        jd_comparacionLayout.setHorizontalGroup(
            jd_comparacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jd_comparacionLayout.setVerticalGroup(
            jd_comparacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jt_direccion.setText("Aqui va la direccion actual del disco C:");

        jl_directorio.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Aqui se listan todos los objetos de un directorio" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jl_directorio);

        jt_comando.setText("Aqui va el comando que se ingresa en la consola (ajustar para que se pueda apretar enter para enviar el comando)");
        jt_comando.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jt_comandoKeyPressed(evt);
            }
        });

        jb_listaComandos.setText("Lista de Comandos");
        jb_listaComandos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_listaComandosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jt_direccion, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jt_comando, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jb_listaComandos)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jt_comando, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jb_listaComandos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jl_listaComandosWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jl_listaComandosWindowClosing
        this.jl_listaComandos.dispose();
    }//GEN-LAST:event_jl_listaComandosWindowClosing

    private void jb_listaComandosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_listaComandosActionPerformed
        openDialog(jl_listaComandos);
    }//GEN-LAST:event_jb_listaComandosActionPerformed

    private void jt_comandoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_comandoKeyPressed
         int key = evt.getKeyCode();
        String command = jt_comando.getText();
        if (key == KeyEvent.VK_ENTER){
            //JOptionPane.showMessageDialog(this, "Funka", "El evento funka", JOptionPane.INFORMATION_MESSAGE);
            if (command.equals("ls")){
                
                refreshList();
                
                this.jt_comando.setText("");
            } else if (command.charAt(0)== 'c' || command.charAt(1)== 'd' ){
                
                
                boolean flechaDer = false;
                boolean flechaIzq = false;
                
                for (int i = 0; i < command.length(); i++) {
                    if (command.charAt(i) == '>'){
                        flechaDer = true;
                    }
                    
                    if (command.charAt(i) == '<'){
                        flechaIzq = true;
                    }
                }
                
                if (flechaIzq && flechaDer){
                    
                    Stack newDirectory = new Stack();
                    int  arrowPosition = -1;
                    for (int i = 0; i < command.length(); i++) {
                        if (command.charAt(i)== '<'){
                            arrowPosition = i-1;
                            break;
                        }
                    }
                    for (int i = arrowPosition; i < command.length(); i++) {
                        if (command.charAt(i)=='>'){
                            break;
                        }else{
                            newDirectory.push_back(command.charAt(i));
                        }
                    }
                    String Directory = "";
                    String newPath = "";
                    for (int i = 0; i < newDirectory.size(); i++) {
                        Directory+= (char)newDirectory.pop_back().getValue();
                    }
                    if (Directory.equals("..")){
                        int cantidadPlecas = 0;
                        for (int i = 0; i < directory.getAbsolutePath().length(); i++) {
                            if (directory.getAbsolutePath().charAt(i) == '/' ){
                                cantidadPlecas++;
                            }
                        }
                        
                        StringTokenizer splitDirectory = new StringTokenizer(directory.getAbsolutePath(),"/");
                        
                        int contadorPlecas=0;
                        while (splitDirectory.hasMoreTokens() && contadorPlecas+1<cantidadPlecas){
                            newPath+="/"+splitDirectory.nextToken();
                            contadorPlecas++;
                        }
                        if(contadorPlecas==0){
                            JOptionPane.showMessageDialog(this, "No hay directorio anterior", "error", JOptionPane.ERROR_MESSAGE);
                        }else{
                            directory = new File(newPath);
                            refreshList();
                        }
                        
                       
                    }else{
                        Directory = "";
                        int contadorDirectorio = 4;
                        while (command.charAt(contadorDirectorio) != '>'){
                            Directory+= command.charAt(contadorDirectorio);
                            contadorDirectorio++;
                        }
                        File testFile = new File(directory.getAbsolutePath()+"/"+Directory);
                        if (testFile.isDirectory() && testFile.exists() && !Directory.equals(".")){
                            directory = new File(testFile.getAbsolutePath());
                            refreshList();
                        }else{
                            JOptionPane.showMessageDialog(this, "Directorio no válido", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                        
                        
                    }
                    
                }else{
                    JOptionPane.showMessageDialog(this, "Directorio no valido", "Error de Dirección", JOptionPane.ERROR_MESSAGE);
                }
                
            }else if (command.equalsIgnoreCase("help")){
                openDialog(this.jl_listaComandos);
                this.jt_comando.setText("");
            }else if (command.charAt(0) == 'c'
                    && command.charAt(1) == 'o'
                    && command.charAt(2) == 'm'
                    && command.charAt(3) == 'p'
                    && command.charAt(4) == 'r'
                    && command.charAt(5) == 'e'
                    && command.charAt(6) == 's'
                    && command.charAt(7) == 's'){
                
               
                String newCommand = "";
                
                for (int i = 9; i < command.length(); i++) {
                    newCommand+=command.charAt(i);
                }
                
                /*
                String operaciones = "";
                Queue ordenArchivos = new Queue(); 
                List priority  = new List();
                List files = new List();
                List splits = new List();
                List newList = new List();
                for (int i = 9; i < command.length(); i++) {
                    operaciones += command.charAt(i);
                }
                StringTokenizer splitOperaciones = new StringTokenizer(operaciones,"|");
                while(splitOperaciones.hasMoreTokens()){
                    splits.push_back(splitOperaciones.nextToken());
                }
                boolean addToFiles = true;
                String tempToken="";
                String temp = "";
                for (int i = 0; i < splits.size(); i++) {
                    
                    StringTokenizer token  = new StringTokenizer((String)splits.elementAt(i).getValue(),"<");
                    
                    while (token.hasMoreTokens()){
                        for (int j = 0; j < (tempToken=token.nextToken()).length(); j++) {
                            if (tempToken.charAt(i)!= '>'){
                                temp+=tempToken.charAt(i);
                            }else{
                                break;
                            }
                        }
                        if (addToFiles){
                            files.push_back(temp);
                            addToFiles = false;
                        }else{
                            priority.push_back(temp);
                            addToFiles = true;
                        }
                        
                    }
                }
                
                //ordenar en una nueva lista para agregar al queue
                int menor;
                int temporary;
                for (int i = 0; i < priority.size(); i++) {
                    menor = i;
                    for (int j = 0; j < priority.size(); j++) {
                        
                        if (Integer.parseInt((String)priority.elementAt(j).getValue()) 
                                > Integer.parseInt((String)priority.elementAt(menor).getValue())){
                            menor = j;
                        }
                        
                    }
                    swap(files,priority,i,menor);
                }
                
                */
                
                
                
                
                
            }else{
                JOptionPane.showMessageDialog(this, "Comando no existente", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        
    }//GEN-LAST:event_jt_comandoKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Console.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Console.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Console.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Console.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Console().setVisible(true);
            }
        });
    }
    
    
    public void openDialog(JDialog dialog){
        dialog.setLocationRelativeTo(this);
        dialog.setModal(true);
        dialog.pack();
        dialog.setVisible(true);
    }
    
    public void swap(List files,List list,int i,int j){
        int temp = Integer.parseInt((String)list.elementAt(i).getValue());
        File tempFile = (File)files.elementAt(i).getValue();
        list.elementAt(i).setValue(Integer.parseInt((String)list.elementAt(j).getValue()));
        files.elementAt(i).setValue(files.elementAt(j).getValue());
        list.elementAt(j).setValue(temp);
        files.elementAt(j).setValue(tempFile);
    }
    
    public void compress(File file){
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
            
            buffer_reader.close();
            reader.close();
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
        
        String binary_string = toBinaryString(buffer,diccionario);
        
        String nueva_file="";
        for (int i = 0; i < file.getPath().length(); i++) {
            if(file.getPath().charAt(i) == '.')
                break;
            nueva_file += file.getPath().charAt(i);
        }
        try {
            FileWriter writer = new FileWriter(new File(nueva_file+".hff"));
            BufferedWriter b_writer = new BufferedWriter(writer);
            
            b_writer.append(binary_string);
            
            b_writer.flush();
            b_writer.close();
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(Console.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    public BinaryTree llenarArbol(List nodes, BinaryTree tree){
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
    public List diccionario(TreeNode node,TreeNode root, List diccionario, String word){
        if(node.hasLeftChild() && node.getLeftChild().isDone() && node.hasRightChild() && node.getRightChild().isDone()){
            if(node == root){
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
                diccionario.push_back(new Word(word,node.getLeftChild().getValue().getValue()));
                node.getLeftChild().setDone(true);
                return diccionario(root,root,diccionario,"");
            }
            System.out.println("me movi left");
            return diccionario(node.getLeftChild(),root,diccionario, word += "0");
        }
        else if(node.hasRightChild() && !node.getRightChild().isDone()){
            if(node.getRightChild().isLeaf()){
                word += "1";
                diccionario.push_back(new Word(word,node.getRightChild().getValue().getValue()));
                node.getRightChild().setDone(true);
                return diccionario(root,root,diccionario,"");
            }
            return diccionario(node.getRightChild(),root,diccionario,word += "1");
        }        
        
        return diccionario;
    }
    private String toBinaryString(String cadena, List diccionario){
        String nueva_cadena = "";
        for (int i = 0; i < cadena.length(); i++) {
            for (int j = 0; j < diccionario.size(); j++) {
                if(cadena.charAt(i) == ((Word)diccionario.elementAt(j).getValue()).getCharacter()){
                    nueva_cadena += ((Word)diccionario.elementAt(j).getValue()).getBinary_code();
                }
            }
        }
        return nueva_cadena;
    }
    
    public void refreshList(){
        DefaultListModel model = new DefaultListModel();

        for (File file: directory.listFiles()) {
            if (file.isDirectory()){
                model.addElement("Directory: "+file.getName());
            }
        }
        
         for (File file: directory.listFiles()) {
            if (file.isFile()){
                model.addElement("File: "+file.getName());
            }
        }
        this.jl_directorio.setModel(model);
        this.jt_direccion.setText(directory.getAbsolutePath());
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jb_listaComandos;
    private javax.swing.JDialog jd_comparacion;
    private javax.swing.JList jl_directorio;
    private javax.swing.JDialog jl_listaComandos;
    private javax.swing.JTextField jt_comando;
    private javax.swing.JTextField jt_direccion;
    // End of variables declaration//GEN-END:variables
    private File directory = new File("//home//rick"); 
    private List diccionario = new List();

}
