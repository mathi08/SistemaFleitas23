/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import javax.swing.JOptionPane;
import tools.Util;

/**
 *
 * @author u07875284120
 */
public class MmsTelaCategoria extends javax.swing.JDialog {

    /**
     * Creates new form MmsTelCategoria
     */
    public MmsTelaCategoria(java.awt.Frame parent, boolean modal) {
         super(parent, modal);
        initComponents();
        setTitle("Categoria");
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTblMMSTabela = new javax.swing.JTable();
        jBtnMMSIncluir = new javax.swing.JButton();
        jBtnMMSExcluir = new javax.swing.JButton();
        jBtnMMSAlterar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Unispace", 0, 24)); // NOI18N
        jLabel1.setText("Categoria");

        jTblMMSTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTblMMSTabela);

        jBtnMMSIncluir.setText("Incluir");
        jBtnMMSIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnMMSIncluirActionPerformed(evt);
            }
        });

        jBtnMMSExcluir.setText("Excluir");
        jBtnMMSExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnMMSExcluirActionPerformed(evt);
            }
        });

        jBtnMMSAlterar.setText("Alterar");
        jBtnMMSAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnMMSAlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBtnMMSIncluir)
                        .addGap(131, 131, 131)
                        .addComponent(jBtnMMSAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnMMSExcluir))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(86, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(244, 244, 244))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnMMSIncluir)
                    .addComponent(jBtnMMSExcluir)
                    .addComponent(jBtnMMSAlterar))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnMMSIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnMMSIncluirActionPerformed
        MmsTelaCategoriaIA mmsTelaCategoriaIA = new MmsTelaCategoriaIA(null, true);
        mmsTelaCategoriaIA.setVisible(true);
    }//GEN-LAST:event_jBtnMMSIncluirActionPerformed

    private void jBtnMMSAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnMMSAlterarActionPerformed
        MmsTelaCategoriaIA mmsTelaCategoriaIA = new MmsTelaCategoriaIA(null, true);
        mmsTelaCategoriaIA.setVisible(true);
    }//GEN-LAST:event_jBtnMMSAlterarActionPerformed

    private void jBtnMMSExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnMMSExcluirActionPerformed
         if (Util.perguntar("Deseja excluir o projeto?") == true){
       
       }else {
                Util.mensagem("Exclusão cancelada.");
                }
    }//GEN-LAST:event_jBtnMMSExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(MmsTelaCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MmsTelaCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MmsTelaCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MmsTelaCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MmsTelaCategoria dialog = new MmsTelaCategoria(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnMMSAlterar;
    private javax.swing.JButton jBtnMMSExcluir;
    private javax.swing.JButton jBtnMMSIncluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTblMMSTabela;
    // End of variables declaration//GEN-END:variables
}
