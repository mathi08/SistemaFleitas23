/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import tools.Util;

/**
 *
 * @author halom
 */
public class MmsTelaUsuarios extends javax.swing.JDialog {
    
    private MaskFormatter mascaraCPF, mascaraDataNascimento;
    /**
     * Creates new form MmsTelaUsuarios
     */
    public MmsTelaUsuarios(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("Usuários");
        setLocationRelativeTo(null);
        Util.habilitar(false, jTxtCodigo,jTxtMMSApelido,jTxtMMSNomeusuario,jFmtMMSCPF,jFmtMMSNascimentoData,jPswMMSSenha,jCboMMSNivel, jCheckBox1, jBtnMMSCancelar1, jBtnMMSConfirmar1 );
    
        try {
            mascaraCPF = new MaskFormatter("###.###.###-##");
            mascaraDataNascimento = new MaskFormatter("##/##/####");
        } catch (ParseException ex) {
            Logger.getLogger(MmsTelaUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
          
         jFmtMMSCPF.setFormatterFactory(new DefaultFormatterFactory(mascaraCPF));
         jFmtMMSNascimentoData.setFormatterFactory(new DefaultFormatterFactory(mascaraDataNascimento));
        
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
        jLabel2 = new javax.swing.JLabel();
        jTxtMMSNomeusuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTxtCodigo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTxtMMSApelido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jFmtMMSNascimentoData = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPswMMSSenha = new javax.swing.JPasswordField();
        jCboMMSNivel = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jBtnMMSIncluir1 = new javax.swing.JButton();
        jBtnMMSAlterar1 = new javax.swing.JButton();
        jBtnMMSPesquisar1 = new javax.swing.JButton();
        jBtnMMSConfirmar1 = new javax.swing.JButton();
        jBtnMMSExcluir1 = new javax.swing.JButton();
        jBtnMMSCancelar1 = new javax.swing.JButton();
        jFmtMMSCPF = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Unispace", 0, 24)); // NOI18N
        jLabel1.setText("Usuario");

        jLabel2.setText("Nome");

        jLabel3.setText("Código");

        jLabel4.setText("Apelido");

        jLabel5.setText("CPF");

        jLabel6.setText("Data Nascimento");

        jLabel7.setText("Senha");

        jCboMMSNivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel8.setText("Nivel");

        jCheckBox1.setText("Ativo");

        jBtnMMSIncluir1.setText("Incluir");
        jBtnMMSIncluir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnMMSIncluir1ActionPerformed(evt);
            }
        });

        jBtnMMSAlterar1.setText("Alterar");
        jBtnMMSAlterar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnMMSAlterar1ActionPerformed(evt);
            }
        });

        jBtnMMSPesquisar1.setText("Pesquisar");
        jBtnMMSPesquisar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnMMSPesquisar1ActionPerformed(evt);
            }
        });

        jBtnMMSConfirmar1.setText("Confirmar");
        jBtnMMSConfirmar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnMMSConfirmar1ActionPerformed(evt);
            }
        });

        jBtnMMSExcluir1.setText("Excluir");
        jBtnMMSExcluir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnMMSExcluir1ActionPerformed(evt);
            }
        });

        jBtnMMSCancelar1.setText("Cancelar");
        jBtnMMSCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnMMSCancelar1ActionPerformed(evt);
            }
        });

        jFmtMMSCPF.setText("jFormattedTextField1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(221, 221, 221))
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTxtMMSApelido, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jTxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jTxtMMSNomeusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addComponent(jPswMMSSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                    .addComponent(jFmtMMSCPF))
                                .addGap(89, 89, 89)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jFmtMMSNascimentoData)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel8))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jCboMMSNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jCheckBox1)))))
                        .addGap(34, 34, 34))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBtnMMSIncluir1)
                                .addGap(18, 18, 18)
                                .addComponent(jBtnMMSAlterar1)
                                .addGap(18, 18, 18)
                                .addComponent(jBtnMMSPesquisar1)
                                .addGap(18, 18, 18)
                                .addComponent(jBtnMMSConfirmar1)
                                .addGap(18, 18, 18)
                                .addComponent(jBtnMMSExcluir1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtnMMSCancelar1)))
                        .addContainerGap(26, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtMMSNomeusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtMMSApelido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFmtMMSNascimentoData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFmtMMSCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPswMMSSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCboMMSNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnMMSIncluir1)
                    .addComponent(jBtnMMSAlterar1)
                    .addComponent(jBtnMMSPesquisar1)
                    .addComponent(jBtnMMSConfirmar1)
                    .addComponent(jBtnMMSExcluir1)
                    .addComponent(jBtnMMSCancelar1))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnMMSCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnMMSCancelar1ActionPerformed
        Util.habilitar(false, jTxtCodigo,jTxtMMSApelido,jTxtMMSNomeusuario,jFmtMMSCPF,jFmtMMSNascimentoData,jPswMMSSenha,jCboMMSNivel, jCheckBox1, jBtnMMSCancelar1, jBtnMMSConfirmar1 );
        Util.habilitar(true, jBtnMMSAlterar1, jBtnMMSIncluir1, jBtnMMSPesquisar1, jBtnMMSExcluir1);
        Util.limparCampos(jTxtCodigo,jTxtMMSApelido, jFmtMMSCPF,jTxtMMSNomeusuario, jFmtMMSNascimentoData, jPswMMSSenha, jCboMMSNivel, jCheckBox1);
    }//GEN-LAST:event_jBtnMMSCancelar1ActionPerformed

    private void jBtnMMSConfirmar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnMMSConfirmar1ActionPerformed
        Util.habilitar(false, jTxtCodigo,jTxtMMSApelido,jTxtMMSNomeusuario,jFmtMMSCPF,jFmtMMSNascimentoData,jPswMMSSenha,jCboMMSNivel, jCheckBox1, jBtnMMSCancelar1, jBtnMMSConfirmar1 );
        Util.habilitar(true, jBtnMMSAlterar1, jBtnMMSIncluir1, jBtnMMSPesquisar1, jBtnMMSExcluir1);
        Util.limparCampos(jTxtCodigo,jTxtMMSApelido, jFmtMMSCPF,jTxtMMSNomeusuario, jFmtMMSNascimentoData, jPswMMSSenha, jCboMMSNivel, jCheckBox1);
    }//GEN-LAST:event_jBtnMMSConfirmar1ActionPerformed

    private void jBtnMMSExcluir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnMMSExcluir1ActionPerformed
     if (Util.perguntar("Deseja excluir o projeto?") == true){
       
       }else {
                Util.mensagem("Exclusão cancelada.");
                }  
     Util.limparCampos(jTxtCodigo,jTxtMMSApelido, jFmtMMSCPF,jTxtMMSNomeusuario, jFmtMMSNascimentoData, jPswMMSSenha, jCboMMSNivel, jCheckBox1);
    }//GEN-LAST:event_jBtnMMSExcluir1ActionPerformed

    private void jBtnMMSIncluir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnMMSIncluir1ActionPerformed
        Util.habilitar(true, jTxtCodigo,jTxtMMSApelido,jTxtMMSNomeusuario,jFmtMMSCPF,jFmtMMSNascimentoData,jPswMMSSenha,jCboMMSNivel, jCheckBox1, jBtnMMSCancelar1, jBtnMMSConfirmar1 );
        Util.habilitar(false, jBtnMMSAlterar1, jBtnMMSIncluir1, jBtnMMSPesquisar1, jBtnMMSExcluir1);
        Util.limparCampos(jTxtCodigo,jTxtMMSApelido, jFmtMMSCPF,jTxtMMSNomeusuario, jFmtMMSNascimentoData, jPswMMSSenha, jCboMMSNivel, jCheckBox1);
    }//GEN-LAST:event_jBtnMMSIncluir1ActionPerformed

    private void jBtnMMSAlterar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnMMSAlterar1ActionPerformed
        Util.habilitar(true, jTxtCodigo,jTxtMMSApelido,jTxtMMSNomeusuario,jFmtMMSCPF,jFmtMMSNascimentoData,jPswMMSSenha,jCboMMSNivel, jCheckBox1, jBtnMMSCancelar1, jBtnMMSConfirmar1 );
        Util.habilitar(false, jBtnMMSAlterar1, jBtnMMSIncluir1, jBtnMMSPesquisar1, jBtnMMSExcluir1);
        Util.limparCampos(jTxtCodigo,jTxtMMSApelido, jFmtMMSCPF,jTxtMMSNomeusuario, jFmtMMSNascimentoData, jPswMMSSenha, jCboMMSNivel, jCheckBox1);
    }//GEN-LAST:event_jBtnMMSAlterar1ActionPerformed

    private void jBtnMMSPesquisar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnMMSPesquisar1ActionPerformed
        Util.limparCampos(jTxtCodigo,jTxtMMSApelido, jFmtMMSCPF,jTxtMMSNomeusuario, jFmtMMSNascimentoData, jPswMMSSenha, jCboMMSNivel, jCheckBox1);
    }//GEN-LAST:event_jBtnMMSPesquisar1ActionPerformed

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
            java.util.logging.Logger.getLogger(MmsTelaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MmsTelaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MmsTelaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MmsTelaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MmsTelaUsuarios dialog = new MmsTelaUsuarios(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jBtnMMSAlterar1;
    private javax.swing.JButton jBtnMMSCancelar1;
    private javax.swing.JButton jBtnMMSConfirmar1;
    private javax.swing.JButton jBtnMMSExcluir1;
    private javax.swing.JButton jBtnMMSIncluir1;
    private javax.swing.JButton jBtnMMSPesquisar1;
    private javax.swing.JComboBox<String> jCboMMSNivel;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JFormattedTextField jFmtMMSCPF;
    private javax.swing.JFormattedTextField jFmtMMSNascimentoData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPasswordField jPswMMSSenha;
    private javax.swing.JTextField jTxtCodigo;
    private javax.swing.JTextField jTxtMMSApelido;
    private javax.swing.JTextField jTxtMMSNomeusuario;
    // End of variables declaration//GEN-END:variables
}
