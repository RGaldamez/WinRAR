/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package winrar;

import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
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
        jButton1 = new javax.swing.JButton();

        jl_listaComandos.setTitle("HELP");
        jl_listaComandos.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                jl_listaComandosWindowClosing(evt);
            }
        });

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "cd <folder name>: cambiara la ruta actual de la consola a la del folder.", "Ejemplo:", "cd Desktop", " ", "ls: listara los archivos y directorios de la carpeta actual.", " ", "compress <filename.txt> <prioridad> | ... | <filename.txt> <priodidad>:", "comprimira los archivos seleccionados en el orden de prioridad especificado;", "como resultado se tendra un archivo de salida con extension hff.", "Ejemplo:", "compress <texto.hff> <1> | <texto2.hff> <2> |<texto3.hff> <3>", " ", "decompress <filename.txt> <prioridad> | ... | <filename.txt> <prioridad>:", "Ejemplo:", "decompress <texto.txt> <1> | <texto2.txt> <2> | <texto3.txt> <3>", " ", "diff <filename.txt>: mostrara una venta de comparacion entre ", "el archivo comprimido y el archivo original." };
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

        jButton1.setText("Testing directories in /home/rick (modify later)");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
                        .addGap(211, 211, 211)
                        .addComponent(jButton1)
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_listaComandos)
                    .addComponent(jButton1))
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
                DefaultListModel model = new DefaultListModel();
                
                for (File listFile : directory.listFiles()) {
                    if (listFile.isFile()){
                        model.addElement("File: "+listFile.getName());
                    }else if (listFile.isDirectory()){
                        model.addElement("Directory: "+listFile.getName());
                    }
                    
                }

                this.jl_directorio.setModel(model);
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
                        if (command.charAt(i)!='>'){
                            newDirectory.push_back(command.charAt(i));

                        }else{
                            break;
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
                                System.out.println("si era pleca");
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
                            DefaultListModel model = new DefaultListModel();
                            
                            for (File file: directory.listFiles()) {
                                model.addElement(file.getName());
                            }
                            this.jl_directorio.setModel(model);
                            this.jt_direccion.setText(directory.getAbsolutePath());
                        }
                        
                       
                    }
                    
                }else{
                    JOptionPane.showMessageDialog(this, "Directorio no valido", "Error de Dirección", JOptionPane.ERROR_MESSAGE);
                }
                
            }else{
                JOptionPane.showMessageDialog(this, "Comando no existente", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        
    }//GEN-LAST:event_jt_comandoKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

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
        } catch (Exception ex) {
            Logger.getLogger(Console.class.getName()).log(Level.SEVERE, null, ex);
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
            BinaryTree arbol = new BinaryTree();
            arbol = llenarArbol(nodes, arbol);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
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


}
