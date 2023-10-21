/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import javax.swing.text.MaskFormatter;

/**
 *
 * @author halom
 */
public class jFrmMenu extends javax.swing.JFrame {
    

    /**
     * Creates new form jFrmMenu
     */
    public jFrmMenu() {
        initComponents();
        setTitle("Sistema de compra de Placas de Video");
        setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jBtnClientes = new javax.swing.JButton();
        jSeparator8 = new javax.swing.JToolBar.Separator();
        jBtnUsuarios = new javax.swing.JButton();
        jSeparator9 = new javax.swing.JToolBar.Separator();
        jBtnProdutos = new javax.swing.JButton();
        jSeparator10 = new javax.swing.JToolBar.Separator();
        jBtnCategorias = new javax.swing.JButton();
        jSeparator11 = new javax.swing.JToolBar.Separator();
        jBtnVendas = new javax.swing.JButton();
        jSeparator13 = new javax.swing.JToolBar.Separator();
        jBtnDesligar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMnuPrincipal = new javax.swing.JMenu();
        jMnuClientes = new javax.swing.JMenuItem();
        jMnuUsuarios = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMnuMovimento = new javax.swing.JMenu();
        jMnuVendas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);
        jToolBar1.add(jSeparator2);

        jBtnClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/usuario.png"))); // NOI18N
        jBtnClientes.setFocusable(false);
        jBtnClientes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnClientes.setMaximumSize(new java.awt.Dimension(60, 45));
        jBtnClientes.setMinimumSize(new java.awt.Dimension(60, 45));
        jBtnClientes.setPreferredSize(new java.awt.Dimension(60, 45));
        jBtnClientes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnClientesActionPerformed(evt);
            }
        });
        jToolBar1.add(jBtnClientes);
        jToolBar1.add(jSeparator8);

        jBtnUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/usuarios-do-grupo.png"))); // NOI18N
        jBtnUsuarios.setFocusable(false);
        jBtnUsuarios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnUsuarios.setMaximumSize(new java.awt.Dimension(60, 45));
        jBtnUsuarios.setMinimumSize(new java.awt.Dimension(60, 45));
        jBtnUsuarios.setPreferredSize(new java.awt.Dimension(60, 45));
        jBtnUsuarios.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnUsuariosActionPerformed(evt);
            }
        });
        jToolBar1.add(jBtnUsuarios);
        jToolBar1.add(jSeparator9);

        jBtnProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/entregavel.png"))); // NOI18N
        jBtnProdutos.setFocusable(false);
        jBtnProdutos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnProdutos.setMaximumSize(new java.awt.Dimension(60, 45));
        jBtnProdutos.setMinimumSize(new java.awt.Dimension(60, 45));
        jBtnProdutos.setPreferredSize(new java.awt.Dimension(60, 45));
        jBtnProdutos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtnProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnProdutosActionPerformed(evt);
            }
        });
        jToolBar1.add(jBtnProdutos);
        jToolBar1.add(jSeparator10);

        jBtnCategorias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/12345.png"))); // NOI18N
        jBtnCategorias.setFocusable(false);
        jBtnCategorias.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnCategorias.setMaximumSize(new java.awt.Dimension(60, 45));
        jBtnCategorias.setMinimumSize(new java.awt.Dimension(60, 45));
        jBtnCategorias.setPreferredSize(new java.awt.Dimension(60, 45));
        jBtnCategorias.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtnCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCategoriasActionPerformed(evt);
            }
        });
        jToolBar1.add(jBtnCategorias);
        jToolBar1.add(jSeparator11);

        jBtnVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/adicionar-ao-carrinho.png"))); // NOI18N
        jBtnVendas.setFocusable(false);
        jBtnVendas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnVendas.setMaximumSize(new java.awt.Dimension(60, 45));
        jBtnVendas.setMinimumSize(new java.awt.Dimension(60, 45));
        jBtnVendas.setPreferredSize(new java.awt.Dimension(60, 45));
        jBtnVendas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jBtnVendas);
        jToolBar1.add(jSeparator13);

        jBtnDesligar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/desligar.png"))); // NOI18N
        jBtnDesligar.setFocusable(false);
        jBtnDesligar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnDesligar.setMaximumSize(new java.awt.Dimension(60, 45));
        jBtnDesligar.setMinimumSize(new java.awt.Dimension(60, 45));
        jBtnDesligar.setPreferredSize(new java.awt.Dimension(60, 45));
        jBtnDesligar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtnDesligar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDesligarActionPerformed(evt);
            }
        });
        jToolBar1.add(jBtnDesligar);

        jMnuPrincipal.setMnemonic('P');
        jMnuPrincipal.setText("Principal");

        jMnuClientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMnuClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/09 - cliente.png"))); // NOI18N
        jMnuClientes.setText("Clientes");
        jMnuClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuClientesActionPerformed(evt);
            }
        });
        jMnuPrincipal.add(jMnuClientes);

        jMnuUsuarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMnuUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/08 - usuario.png"))); // NOI18N
        jMnuUsuarios.setMnemonic('U');
        jMnuUsuarios.setText("Usuários");
        jMnuUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuUsuariosActionPerformed(evt);
            }
        });
        jMnuPrincipal.add(jMnuUsuarios);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/11 - cartao.png"))); // NOI18N
        jMenuItem3.setText("Categoria");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMnuPrincipal.add(jMenuItem3);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/14 - compra.png"))); // NOI18N
        jMenuItem2.setText("Produto");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMnuPrincipal.add(jMenuItem2);
        jMnuPrincipal.add(jSeparator1);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/exit.png"))); // NOI18N
        jMenuItem1.setText("Sair");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMnuPrincipal.add(jMenuItem1);

        jMenuBar1.add(jMnuPrincipal);

        jMnuMovimento.setText("Movimento");

        jMnuVendas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jMnuVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/13 - venda.png"))); // NOI18N
        jMnuVendas.setText("Vendas");
        jMnuVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuVendasActionPerformed(evt);
            }
        });
        jMnuMovimento.add(jMnuVendas);

        jMenuBar1.add(jMnuMovimento);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(379, 379, 379))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMnuVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuVendasActionPerformed
       
    }//GEN-LAST:event_jMnuVendasActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
      
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
         MmsTelaCategoria mmsTelaCategoria = new MmsTelaCategoria(null, true);
        mmsTelaCategoria.setVisible(true);
      
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMnuUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuUsuariosActionPerformed
         MmsTelaUsuarios mmsTelaUsuarios = new MmsTelaUsuarios(null, true);
        mmsTelaUsuarios.setVisible(true);
       
    }//GEN-LAST:event_jMnuUsuariosActionPerformed

    private void jMnuClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuClientesActionPerformed
         MmsTelaCliente mmsTelaClientes = new MmsTelaCliente(null, true);
        mmsTelaClientes.setVisible(true);
   
    }//GEN-LAST:event_jMnuClientesActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        MmsTelaProduto mmsTelaProduto = new MmsTelaProduto(null, true);
        mmsTelaProduto.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jBtnDesligarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDesligarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jBtnDesligarActionPerformed

    private void jBtnCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCategoriasActionPerformed
        MmsTelaCategoria mmsTelaCategoria = new MmsTelaCategoria(null, true);
        mmsTelaCategoria.setVisible(true);
    }//GEN-LAST:event_jBtnCategoriasActionPerformed

    private void jBtnProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnProdutosActionPerformed

        MmsTelaProduto mmsTelaProduto = new MmsTelaProduto(null, true);
        mmsTelaProduto.setVisible(true);
    }//GEN-LAST:event_jBtnProdutosActionPerformed

    private void jBtnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnUsuariosActionPerformed

        MmsTelaUsuarios mmsTelaUsuarios = new MmsTelaUsuarios(null, true);
        mmsTelaUsuarios.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnUsuariosActionPerformed

    private void jBtnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnClientesActionPerformed

        MmsTelaCliente mmsTelaClientes = new MmsTelaCliente(null, true);
        mmsTelaClientes.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnClientesActionPerformed

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
            java.util.logging.Logger.getLogger(jFrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jFrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jFrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jFrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jFrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnCategorias;
    private javax.swing.JButton jBtnClientes;
    private javax.swing.JButton jBtnDesligar;
    private javax.swing.JButton jBtnProdutos;
    private javax.swing.JButton jBtnUsuarios;
    private javax.swing.JButton jBtnVendas;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMnuClientes;
    private javax.swing.JMenu jMnuMovimento;
    private javax.swing.JMenu jMnuPrincipal;
    private javax.swing.JMenuItem jMnuUsuarios;
    private javax.swing.JMenuItem jMnuVendas;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator10;
    private javax.swing.JToolBar.Separator jSeparator11;
    private javax.swing.JToolBar.Separator jSeparator13;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator8;
    private javax.swing.JToolBar.Separator jSeparator9;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
