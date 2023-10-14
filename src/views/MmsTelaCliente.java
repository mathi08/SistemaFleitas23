/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import bean.MmsCliente;
import dao.MmsClienteDAO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import tools.Util;

/**
 *
 * @author halom
 */
public class MmsTelaCliente extends javax.swing.JDialog {
private MaskFormatter mascaraCPF, mascaraDataNascimento,mascaraRG, mascaraCEP,mascaraTelefone, mascaraCelular;
    /**
     * Creates new form MMSTELACliente1
     */
     boolean incluindo;
     MmsClienteDAO mmsClienteDAO;
     MmsCliente mmsCliente;
     
    public MmsTelaCliente(java.awt.Frame parent, boolean modal) {
         super(parent, modal);
        initComponents();
        setTitle("Clientes");
        setLocationRelativeTo(null);
        Util.habilitar(false,jTxtMMSEndereco, jTxtMMSNacionalidade,jTxtMMSNome, jTxtMMSNumeroCasa, jTxtMMSCodigo,jTxtMMSCidade,jFmtMMSCPF,jFmtMMSCelular,jFmtMMSCep,jFmtMMSDataNascimento,jTxtMMSEmail,jFmtMMSRG,jFmtMMSTelefone, jCboMMSEstadoCivil,jCboMMSSexo, jBtnMMSConfirmar,jBtnMMSCancelar);
   
    try {
        mascaraCPF = new MaskFormatter("###.###.###-##");
        mascaraDataNascimento = new MaskFormatter("##/##/####");
        mascaraRG = new MaskFormatter("#.###.###");
        mascaraCEP = new MaskFormatter("#####-###");
        mascaraCelular = new MaskFormatter("(##)#####-####");
        mascaraTelefone = new MaskFormatter("(##)#####-####");
    } catch (ParseException ex) {
        Logger.getLogger(MmsTelaCliente.class.getName()).log(Level.SEVERE, null, ex);
    }
         jFmtMMSCPF.setFormatterFactory(new DefaultFormatterFactory(mascaraCPF));
         jFmtMMSDataNascimento.setFormatterFactory(new DefaultFormatterFactory(mascaraDataNascimento));   
         jFmtMMSCep.setFormatterFactory(new DefaultFormatterFactory(mascaraCEP));
         jFmtMMSRG.setFormatterFactory(new DefaultFormatterFactory(mascaraRG));
         jFmtMMSCelular.setFormatterFactory(new DefaultFormatterFactory(mascaraCelular));
         jFmtMMSTelefone.setFormatterFactory(new DefaultFormatterFactory(mascaraTelefone));
        
    }

        public MmsCliente ViewBean() {
        MmsCliente mmscliente = new MmsCliente();
        
        mmscliente.setMmsIdcliente(Util.strInt(jTxtMMSCodigo.getText()));
        mmscliente.setMmsNome(jTxtMMSNome.getText());
        mmscliente.setMmsCpf(jFmtMMSCPF.getText());
        mmscliente.setMmsRg(jFmtMMSRG.getText());
         
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    try {
        mmscliente.setMmsDataNasc(formato.parse(jFmtMMSDataNascimento.getText()));
    } catch (ParseException ex) {
        Logger.getLogger(MmsTelaCliente.class.getName()).log(Level.SEVERE, null, ex);
    }
    
        mmscliente.setMmsEmail(jTxtMMSEmail.getText());
        mmscliente.setMmsCep(jFmtMMSCep.getText());
        mmscliente.setMmsEndereco(jTxtMMSEndereco.getText());
        mmscliente.setMmsCidade(jTxtMMSCidade.getText());
        mmscliente.setMmsNumeroCasa(Util.strInt(jTxtMMSNumeroCasa.getText()));
        mmscliente.setMmsNacionalidade(jTxtMMSNacionalidade.getText());
        mmscliente.setMmsCelular(jFmtMMSCelular.getText());
        mmscliente.setMmsTelefoneResidencial(jFmtMMSTelefone.getText());
        mmscliente.setMmsEstadoCivil(jCboMMSEstadoCivil.getSelectedIndex());
        mmscliente.setMmsSexo(jCboMMSSexo.getSelectedIndex());
        
        return mmscliente;
     }
    
        public void beanView(MmsCliente mmscliente){
              
        jTxtMMSCodigo.setText(Util.intStr(mmscliente.getMmsIdcliente()));
        jTxtMMSNome.setText(mmscliente.getMmsNome());
        jFmtMMSCPF.setText(mmscliente.getMmsCpf());
        jFmtMMSRG.setText(mmscliente.getMmsRg());
        jFmtMMSDataNascimento.setText(Util.dateStr(mmscliente.getMmsDataNasc()));
        jFmtMMSCep.setText(mmscliente.getMmsCep());
        jTxtMMSEmail.setText(mmscliente.getMmsEmail());
        jTxtMMSEndereco.setText(mmscliente.getMmsEndereco());
        jTxtMMSCidade.setText(mmscliente.getMmsCidade());
        jTxtMMSNumeroCasa.setText(Util.intStr(mmscliente.getMmsNumeroCasa()));
        jTxtMMSNacionalidade.setText(mmscliente.getMmsNacionalidade());
        jFmtMMSCelular.setText(mmscliente.getMmsCelular());
        jFmtMMSTelefone.setText(mmscliente.getMmsTelefoneResidencial());
        jCboMMSEstadoCivil.setSelectedIndex(mmscliente.getMmsEstadoCivil());
        jCboMMSSexo.setSelectedIndex(mmscliente.getMmsSexo());
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
        jTxtMMSCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTxtMMSNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTxtMMSEmail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTxtMMSEndereco = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTxtMMSCidade = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTxtMMSNumeroCasa = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTxtMMSNacionalidade = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jCboMMSEstadoCivil = new javax.swing.JComboBox<>();
        jCboMMSSexo = new javax.swing.JComboBox<>();
        jFmtMMSCPF = new javax.swing.JFormattedTextField();
        jFmtMMSRG = new javax.swing.JFormattedTextField();
        jFmtMMSDataNascimento = new javax.swing.JFormattedTextField();
        jLabel16 = new javax.swing.JLabel();
        jFmtMMSCelular = new javax.swing.JFormattedTextField();
        jFmtMMSTelefone = new javax.swing.JFormattedTextField();
        jFmtMMSCep = new javax.swing.JFormattedTextField();
        jBtnMMSIncluir = new javax.swing.JButton();
        jBtnMMSAlterar = new javax.swing.JButton();
        jBtnMMSPesquisar = new javax.swing.JButton();
        jBtnMMSExcluir = new javax.swing.JButton();
        jBtnMMSConfirmar = new javax.swing.JButton();
        jBtnMMSCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Unispace", 0, 24)); // NOI18N
        jLabel1.setText("Clientes");

        jLabel2.setText("Código");

        jLabel3.setText("Nome");

        jLabel4.setText("Cpf");

        jLabel5.setText("RG");

        jLabel6.setText("Data Nascimento");

        jLabel7.setText("Email");

        jLabel8.setText("CEP");

        jLabel9.setText("Endereço");

        jLabel10.setText("Cidade");

        jLabel11.setText("Numero da Residencia");

        jLabel12.setText("Nacionalidade");

        jLabel13.setText("Celular");

        jLabel14.setText("Estado Civil");

        jLabel15.setText("Sexo");

        jCboMMSEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Solteiro", "Casado", "Divorciado", "Viúvo", " " }));

        jCboMMSSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino", "Outro", " " }));

        jLabel16.setText("Telefone Fixo");

        jBtnMMSIncluir.setText("Incluir");
        jBtnMMSIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnMMSIncluirActionPerformed(evt);
            }
        });

        jBtnMMSAlterar.setText("Alterar");
        jBtnMMSAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnMMSAlterarActionPerformed(evt);
            }
        });

        jBtnMMSPesquisar.setText("Pesquisar");
        jBtnMMSPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnMMSPesquisarActionPerformed(evt);
            }
        });

        jBtnMMSExcluir.setText("Excluir");
        jBtnMMSExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnMMSExcluirActionPerformed(evt);
            }
        });

        jBtnMMSConfirmar.setText("Confirmar");
        jBtnMMSConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnMMSConfirmarActionPerformed(evt);
            }
        });

        jBtnMMSCancelar.setText("Cancelar");
        jBtnMMSCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnMMSCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(222, 222, 222)
                .addComponent(jLabel1)
                .addGap(211, 211, 211))
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBtnMMSIncluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnMMSAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnMMSPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnMMSConfirmar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnMMSExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnMMSCancelar)
                        .addContainerGap(79, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jFmtMMSCPF)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTxtMMSNacionalidade, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jTxtMMSCidade, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTxtMMSCodigo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addComponent(jLabel10)))
                                .addComponent(jLabel12))
                            .addComponent(jFmtMMSDataNascimento, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel16)
                            .addComponent(jFmtMMSTelefone)
                            .addComponent(jFmtMMSCep))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jCboMMSEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(68, 68, 68)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCboMMSSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15)))
                            .addComponent(jLabel3)
                            .addComponent(jTxtMMSNome)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jTxtMMSEmail)
                            .addComponent(jLabel9)
                            .addComponent(jTxtMMSEndereco)
                            .addComponent(jLabel11)
                            .addComponent(jTxtMMSNumeroCasa)
                            .addComponent(jLabel13)
                            .addComponent(jFmtMMSRG)
                            .addComponent(jFmtMMSCelular))
                        .addGap(80, 80, 80))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtMMSCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtMMSNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFmtMMSCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFmtMMSRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtMMSEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFmtMMSDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtMMSEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFmtMMSCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtMMSCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtMMSNumeroCasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtMMSNacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFmtMMSCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCboMMSEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCboMMSSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFmtMMSTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnMMSIncluir)
                    .addComponent(jBtnMMSAlterar)
                    .addComponent(jBtnMMSPesquisar)
                    .addComponent(jBtnMMSExcluir)
                    .addComponent(jBtnMMSConfirmar)
                    .addComponent(jBtnMMSCancelar))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnMMSIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnMMSIncluirActionPerformed
       Util.habilitar(true,jTxtMMSEndereco, jTxtMMSNacionalidade,jTxtMMSNome, jTxtMMSNumeroCasa, jTxtMMSCodigo,jTxtMMSCidade,jFmtMMSCPF,jFmtMMSCelular,jFmtMMSCep,jFmtMMSDataNascimento,jTxtMMSEmail,jFmtMMSRG,jFmtMMSTelefone, jCboMMSEstadoCivil,jCboMMSSexo, jBtnMMSConfirmar,jBtnMMSCancelar);
       Util.habilitar(false,jBtnMMSAlterar,jBtnMMSExcluir,jBtnMMSPesquisar,jBtnMMSIncluir );
       Util.limparCampos(jTxtMMSCidade, jTxtMMSCodigo, jTxtMMSEmail, jTxtMMSEndereco, jTxtMMSNacionalidade, jTxtMMSNome,jTxtMMSNumeroCasa, jFmtMMSCPF, jFmtMMSCelular, jFmtMMSCep, jFmtMMSDataNascimento, jFmtMMSRG, jFmtMMSTelefone, jCboMMSEstadoCivil, jCboMMSSexo);
       incluindo = true;
    }//GEN-LAST:event_jBtnMMSIncluirActionPerformed

    private void jBtnMMSAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnMMSAlterarActionPerformed
        Util.habilitar(true,jTxtMMSEndereco, jTxtMMSNacionalidade,jTxtMMSNome, jTxtMMSNumeroCasa, jTxtMMSCodigo,jTxtMMSCidade,jFmtMMSCPF,jFmtMMSCelular,jFmtMMSCep,jFmtMMSDataNascimento,jTxtMMSEmail,jFmtMMSRG,jFmtMMSTelefone, jCboMMSEstadoCivil,jCboMMSSexo, jBtnMMSConfirmar,jBtnMMSCancelar);
        Util.habilitar(false,jBtnMMSAlterar,jBtnMMSExcluir,jBtnMMSPesquisar,jBtnMMSIncluir );
       incluindo = false;
    }//GEN-LAST:event_jBtnMMSAlterarActionPerformed

    private void jBtnMMSConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnMMSConfirmarActionPerformed
         Util.habilitar(false,jTxtMMSEndereco, jTxtMMSNacionalidade,jTxtMMSNome, jTxtMMSNumeroCasa, jTxtMMSCodigo,jTxtMMSCidade,jFmtMMSCPF,jFmtMMSCelular,jFmtMMSCep,jFmtMMSDataNascimento,jTxtMMSEmail,jFmtMMSRG,jFmtMMSTelefone, jCboMMSEstadoCivil,jCboMMSSexo, jBtnMMSConfirmar,jBtnMMSCancelar);
         Util.habilitar(true,jBtnMMSAlterar,jBtnMMSExcluir,jBtnMMSPesquisar,jBtnMMSIncluir );
         Util.limparCampos(jTxtMMSCidade, jTxtMMSCodigo, jTxtMMSEmail, jTxtMMSEndereco, jTxtMMSNacionalidade, jTxtMMSNome,jTxtMMSNumeroCasa, jFmtMMSCPF, jFmtMMSCelular, jFmtMMSCep, jFmtMMSDataNascimento, jFmtMMSRG, jFmtMMSTelefone, jCboMMSEstadoCivil, jCboMMSSexo);
       
        MmsCliente mmsCliente = ViewBean();
       
       MmsClienteDAO mmsClienteDAO = new MmsClienteDAO();
       mmsClienteDAO.insert(mmsCliente);
       
        if(incluindo == true){
            mmsClienteDAO.insert(mmsCliente);
        }else{
            mmsClienteDAO.update(mmsCliente);
        }
       
    }//GEN-LAST:event_jBtnMMSConfirmarActionPerformed

    private void jBtnMMSCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnMMSCancelarActionPerformed
        Util.habilitar(false,jTxtMMSEndereco, jTxtMMSNacionalidade,jTxtMMSNome, jTxtMMSNumeroCasa, jTxtMMSCodigo,jTxtMMSCidade,jFmtMMSCPF,jFmtMMSCelular,jFmtMMSCep,jFmtMMSDataNascimento,jTxtMMSEmail,jFmtMMSRG,jFmtMMSTelefone, jCboMMSEstadoCivil,jCboMMSSexo, jBtnMMSConfirmar,jBtnMMSCancelar);
       Util.habilitar(true,jBtnMMSAlterar,jBtnMMSExcluir,jBtnMMSPesquisar,jBtnMMSIncluir );
       Util.limparCampos(jTxtMMSCidade, jTxtMMSCodigo, jTxtMMSEmail, jTxtMMSEndereco, jTxtMMSNacionalidade, jTxtMMSNome,jTxtMMSNumeroCasa, jFmtMMSCPF, jFmtMMSCelular, jFmtMMSCep, jFmtMMSDataNascimento, jFmtMMSRG, jFmtMMSTelefone, jCboMMSEstadoCivil, jCboMMSSexo);
    }//GEN-LAST:event_jBtnMMSCancelarActionPerformed

    private void jBtnMMSExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnMMSExcluirActionPerformed
         if (Util.perguntar("Deseja excluir o projeto?") == true){
            MmsCliente cliente = ViewBean();
            MmsClienteDAO clienteDAO = new MmsClienteDAO();
            clienteDAO.delete(cliente);
       }else {
                Util.mensagem("Exclusão cancelada.");
                }  
         Util.limparCampos(jTxtMMSCidade, jTxtMMSCodigo, jTxtMMSEmail, jTxtMMSEndereco, jTxtMMSNacionalidade, jTxtMMSNome,jTxtMMSNumeroCasa, jFmtMMSCPF, jFmtMMSCelular, jFmtMMSCep, jFmtMMSDataNascimento, jFmtMMSRG, jFmtMMSTelefone, jCboMMSEstadoCivil, jCboMMSSexo);
    }//GEN-LAST:event_jBtnMMSExcluirActionPerformed
        
    private void jBtnMMSPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnMMSPesquisarActionPerformed
        Util.limparCampos(jTxtMMSCidade, jTxtMMSCodigo, jTxtMMSEmail, jTxtMMSEndereco, jTxtMMSNacionalidade, jTxtMMSNome,jTxtMMSNumeroCasa, jFmtMMSCPF, jFmtMMSCelular, jFmtMMSCep, jFmtMMSDataNascimento, jFmtMMSRG, jFmtMMSTelefone, jCboMMSEstadoCivil, jCboMMSSexo);
        
        MmsTelaClientesPesquisar mmsTelaClientePesquisar = new MmsTelaClientesPesquisar(null, true);
        mmsTelaClientePesquisar.setTelaAnterior(this);     
        mmsTelaClientePesquisar.setVisible(true);
        
    }//GEN-LAST:event_jBtnMMSPesquisarActionPerformed

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
            java.util.logging.Logger.getLogger(MmsTelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MmsTelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MmsTelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MmsTelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MmsTelaCliente dialog = new MmsTelaCliente(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jBtnMMSCancelar;
    private javax.swing.JButton jBtnMMSConfirmar;
    private javax.swing.JButton jBtnMMSExcluir;
    private javax.swing.JButton jBtnMMSIncluir;
    private javax.swing.JButton jBtnMMSPesquisar;
    private javax.swing.JComboBox<String> jCboMMSEstadoCivil;
    private javax.swing.JComboBox<String> jCboMMSSexo;
    private javax.swing.JFormattedTextField jFmtMMSCPF;
    private javax.swing.JFormattedTextField jFmtMMSCelular;
    private javax.swing.JFormattedTextField jFmtMMSCep;
    private javax.swing.JFormattedTextField jFmtMMSDataNascimento;
    private javax.swing.JFormattedTextField jFmtMMSRG;
    private javax.swing.JFormattedTextField jFmtMMSTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTxtMMSCidade;
    private javax.swing.JTextField jTxtMMSCodigo;
    private javax.swing.JTextField jTxtMMSEmail;
    private javax.swing.JTextField jTxtMMSEndereco;
    private javax.swing.JTextField jTxtMMSNacionalidade;
    private javax.swing.JTextField jTxtMMSNome;
    private javax.swing.JTextField jTxtMMSNumeroCasa;
    // End of variables declaration//GEN-END:variables
}
