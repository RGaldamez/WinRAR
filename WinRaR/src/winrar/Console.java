/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package winrar;

import java.awt.event.KeyEvent;
import java.io.File;
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
        jb_enter = new javax.swing.JButton();
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

        jt_direccion.setText("Aqui va la direccion actual del cisco C:");

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

        jb_enter.setText("Enter");

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
                        .addGap(44, 44, 44)
                        .addComponent(jb_enter, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
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
                    .addComponent(jb_enter)
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
        if (key == KeyEvent.VK_ENTER){
            JOptionPane.showMessageDialog(this, "Funka", "El evento funka", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jt_comandoKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultListModel model = new DefaultListModel();
        
        File files [] = directory.listFiles();
        for (File file: files) {
            model.addElement(file.getName());
        }
        this.jl_directorio.setModel(model);
        
        
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jb_enter;
    private javax.swing.JButton jb_listaComandos;
    private javax.swing.JDialog jd_comparacion;
    private javax.swing.JList jl_directorio;
    private javax.swing.JDialog jl_listaComandos;
    private javax.swing.JTextField jt_comando;
    private javax.swing.JTextField jt_direccion;
    // End of variables declaration//GEN-END:variables
    private File directory = new File("//home//rick"); 


}
