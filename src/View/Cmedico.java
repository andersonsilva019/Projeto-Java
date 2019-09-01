
package View;

import modeloConection.ConexaoBD;
import modeloDao.DaoMedico;
import modeloBeans.BeansMedico; 
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modeloBeans.ModeloTabela;

public class Cmedico extends javax.swing.JFrame {

    BeansMedico mod = new BeansMedico();
    DaoMedico control = new DaoMedico();
    ConexaoBD conex = new ConexaoBD();
    int flag= 0;
    
    public Cmedico() {
        initComponents();
        preencherTabela("select * from  medicos order by nome_medico ");
      
    }
    public void cadastrarMedico(){
        
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        sexo = new javax.swing.ButtonGroup();
        jLabel10 = new javax.swing.JLabel();
        jtfendereco_med = new javax.swing.JTextField();
        jbsalvar_med = new javax.swing.JButton();
        jtftelefone_med = new javax.swing.JFormattedTextField();
        jbEditar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtfusuario_med = new javax.swing.JTextField();
        jpsenha_med = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        jbVoltar = new javax.swing.JButton();
        jtfnome_med = new javax.swing.JTextField();
        jtfrg_med = new javax.swing.JTextField();
        jtfcrm_med = new javax.swing.JTextField();
        jtfcpf_med = new javax.swing.JFormattedTextField();
        jcbsexo_medico = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_med = new javax.swing.JTable();
        jbNovo = new javax.swing.JButton();
        jtfpesquisa_med = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jtfid_med = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("SEXO:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(470, 160, 39, 17);

        jtfendereco_med.setEnabled(false);
        getContentPane().add(jtfendereco_med);
        jtfendereco_med.setBounds(130, 210, 320, 30);

        jbsalvar_med.setText("SALVAR");
        jbsalvar_med.setEnabled(false);
        jbsalvar_med.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbsalvar_medActionPerformed(evt);
            }
        });
        getContentPane().add(jbsalvar_med);
        jbsalvar_med.setBounds(61, 430, 90, 23);

        try {
            jtftelefone_med.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jtftelefone_med.setEnabled(false);
        getContentPane().add(jtftelefone_med);
        jtftelefone_med.setBounds(540, 200, 141, 40);

        jbEditar.setText("EDITAR");
        jbEditar.setEnabled(false);
        jbEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarActionPerformed(evt);
            }
        });
        getContentPane().add(jbEditar);
        jbEditar.setBounds(159, 430, 90, 23);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("NOME:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(70, 170, 42, 17);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("ENDEREÇO: ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 220, 80, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("TELEFONE:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(460, 220, 70, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CPF:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(110, 267, 29, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setText("CADASTRO DO MÉDICO");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(200, 10, 430, 70);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("RG:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(290, 260, 40, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("CMR:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(480, 260, 33, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("USUÁRIO:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(60, 320, 62, 17);

        jtfusuario_med.setEnabled(false);
        getContentPane().add(jtfusuario_med);
        jtfusuario_med.setBounds(130, 310, 244, 30);

        jpsenha_med.setEnabled(false);
        jpsenha_med.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpsenha_medActionPerformed(evt);
            }
        });
        getContentPane().add(jpsenha_med);
        jpsenha_med.setBounds(450, 310, 149, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("SENHA:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(390, 300, 47, 40);

        jbVoltar.setText("VOLTAR");
        jbVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(jbVoltar);
        jbVoltar.setBounds(480, 430, 90, 23);

        jtfnome_med.setEnabled(false);
        getContentPane().add(jtfnome_med);
        jtfnome_med.setBounds(130, 160, 330, 30);

        jtfrg_med.setEnabled(false);
        getContentPane().add(jtfrg_med);
        jtfrg_med.setBounds(340, 260, 122, 30);

        jtfcrm_med.setToolTipText("");
        jtfcrm_med.setEnabled(false);
        jtfcrm_med.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfcrm_medActionPerformed(evt);
            }
        });
        getContentPane().add(jtfcrm_med);
        jtfcrm_med.setBounds(530, 260, 141, 30);

        try {
            jtfcpf_med.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jtfcpf_med.setEnabled(false);
        getContentPane().add(jtfcpf_med);
        jtfcpf_med.setBounds(160, 260, 100, 30);

        jcbsexo_medico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MASCULINO", "FEMININO" }));
        jcbsexo_medico.setEnabled(false);
        getContentPane().add(jcbsexo_medico);
        jcbsexo_medico.setBounds(530, 150, 166, 30);

        table_med.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Cpf", "Rg", "Crm"
            }
        ));
        jScrollPane1.setViewportView(table_med);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(90, 490, 630, 107);

        jbNovo.setText("NOVO");
        jbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoActionPerformed(evt);
            }
        });
        getContentPane().add(jbNovo);
        jbNovo.setBounds(258, 430, 90, 23);
        getContentPane().add(jtfpesquisa_med);
        jtfpesquisa_med.setBounds(160, 360, 244, 30);

        jbBuscar.setText("BUSCAR ");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(jbBuscar);
        jbBuscar.setBounds(420, 360, 90, 30);

        jbExcluir.setText("EXCLUIR");
        jbExcluir.setEnabled(false);
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(jbExcluir);
        jbExcluir.setBounds(370, 430, 100, 23);

        jbCancelar.setText("CANCELAR");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jbCancelar);
        jbCancelar.setBounds(590, 430, 110, 23);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("ID:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(90, 110, 19, 17);

        jtfid_med.setEnabled(false);
        getContentPane().add(jtfid_med);
        jtfid_med.setBounds(130, 100, 69, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("PESQUISA:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(70, 360, 80, 30);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/stethoscope.jpg"))); // NOI18N
        jLabel12.setText("jLabel12");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(0, -6, 840, 630);

        setSize(new java.awt.Dimension(851, 659));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVoltarActionPerformed
        Secretaria sec = new Secretaria();
        sec.setVisible(true);
        dispose();
    }//GEN-LAST:event_jbVoltarActionPerformed

    private void jpsenha_medActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpsenha_medActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpsenha_medActionPerformed

    private void jbsalvar_medActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbsalvar_medActionPerformed
  
        try {
             if (flag==1){
        mod.setNome(jtfnome_med.getText());
        mod.setCrm(Integer.parseInt(jtfcrm_med.getText()));
        mod.setUsuario(jtfusuario_med.getText());
        mod.setSenha(jpsenha_med.getText());
        mod.setCpf(jtfcpf_med.getText());
        mod.setRg(jtfrg_med.getText());
        mod.setTelefone(jtftelefone_med.getText());
        mod.setEndereco(jtfendereco_med.getText());
        mod.setSexo((String)jcbsexo_medico.getSelectedItem());
        control.Salvar(mod);
        jtfnome_med.setEnabled(false);
        jtfendereco_med.setEnabled(false);
        jcbsexo_medico.setEnabled(false);
        jtfusuario_med.setEnabled(false);
        jpsenha_med.setEnabled(false);
        jtftelefone_med.setEnabled(false);
        jtfrg_med.setEnabled(false);
        jtfcpf_med.setEnabled(false);
        jbsalvar_med.setEnabled(false);
        jtfcrm_med.setEnabled(false);
             }else{
        mod.setId((Integer.parseInt(jtfid_med.getText())));
        mod.setNome(jtfnome_med.getText());
        mod.setCrm(Integer.parseInt(jtfcrm_med.getText()));
        mod.setUsuario(jtfusuario_med.getText());
        mod.setSenha(jpsenha_med.getText());
        mod.setCpf(jtfcpf_med.getText());
        mod.setRg(jtfrg_med.getText());
        mod.setTelefone(jtftelefone_med.getText());
        mod.setEndereco(jtfendereco_med.getText());
        mod.setSexo((String)jcbsexo_medico.getSelectedItem());
        control.Editar(mod);
        jtfid_med.setText("");
        jtfnome_med.setText("");
        jtfendereco_med.setText("");
        jtfusuario_med.setText("");
        jpsenha_med.setText("");
        jtftelefone_med.setText("");
        jtfrg_med.setText("");
        jtfcpf_med.setText("");
        jtfnome_med.setEnabled(false);
        jtfendereco_med.setEnabled(false);
        jcbsexo_medico.setEnabled(false);
        jtfusuario_med.setEnabled(false);
        jpsenha_med.setEnabled(false);
        jtftelefone_med.setEnabled(false);
        jtfrg_med.setEnabled(false);
        jtfcpf_med.setEnabled(false);
        jbsalvar_med.setEnabled(false);
        jtfcrm_med.setEnabled(false);
        jbNovo.setEnabled(true);
        jbCancelar.setEnabled(false);
             }
   
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao Salvar!"+ex.getMessage());
        }
    }//GEN-LAST:event_jbsalvar_medActionPerformed

    private void jtfcrm_medActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfcrm_medActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfcrm_medActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
       mod.setPesquisa(jtfpesquisa_med.getText());
       BeansMedico model = control.buscaMedico(mod);
       jtfnome_med.setText(model.getNome());
       jtfid_med.setText(String.valueOf(model.getId()));
       jtfendereco_med.setText(model.getEndereco());
       jcbsexo_medico.setSelectedItem(model.getSexo());
       jtfusuario_med.setText(model.getUsuario());
       jpsenha_med.setText(model.getSenha());
       jtftelefone_med.setText(model.getTelefone());
       jtfrg_med.setText(model.getRg());
       jtfcpf_med.setText(model.getCpf());
       jtfcrm_med.setText(String.valueOf(model.getCrm()));
       jbEditar.setEnabled(true);
       jbExcluir.setEnabled(true);
       
       
       
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
        flag=1;
        jtfnome_med.setEnabled(true);
        jtfendereco_med.setEnabled(true);
        jcbsexo_medico.setEnabled(true);
        jtfusuario_med.setEnabled(true);
        jpsenha_med.setEnabled(true);
        jtftelefone_med.setEnabled(true);
        jtfrg_med.setEnabled(true);
        jtfcpf_med.setEnabled(true);
        jbsalvar_med.setEnabled(true);
        jtfcrm_med.setEnabled(true);
        jbCancelar.setEnabled(true);
        
    }//GEN-LAST:event_jbNovoActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
            jtfnome_med.setEnabled(!true);
        jtfendereco_med.setEnabled(!true);
        jcbsexo_medico.setEnabled(!true);
        jtfusuario_med.setEnabled(!true);
        jpsenha_med.setEnabled(!true);
        jtftelefone_med.setEnabled(!true);
        jtfrg_med.setEnabled(!true);
        jtfcpf_med.setEnabled(!true);
        jbsalvar_med.setEnabled(!true);
        jtfcrm_med.setEnabled(!true);
        jbCancelar.setEnabled(!true);
        jbEditar.setEnabled(false);
       jbExcluir.setEnabled(false);
        
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
        flag =2;
        jtfnome_med.setEnabled(true);
        jtfendereco_med.setEnabled(true);
        jcbsexo_medico.setEnabled(true);
        jtfusuario_med.setEnabled(true);
        jpsenha_med.setEnabled(true);
        jtftelefone_med.setEnabled(true);
        jtfrg_med.setEnabled(true);
        jtfcpf_med.setEnabled(true);
        jbsalvar_med.setEnabled(true);
        jtfcrm_med.setEnabled(true);
        jbCancelar.setEnabled(true);
        jbNovo.setEnabled(false);
        jbExcluir.setEnabled(false);
        jbEditar.setEnabled(false);
    }//GEN-LAST:event_jbEditarActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
       int resposta = 0;
       resposta = JOptionPane.showConfirmDialog(rootPane,"Deseja realmente excluir?");
       if(resposta == JOptionPane.YES_OPTION){
           mod.setId(Integer.parseInt(jtfid_med.getText()));
           control.Excluir(mod);
        jtfid_med.setText("");
        jtfnome_med.setText("");
        jtfendereco_med.setText("");
        jtfusuario_med.setText("");
        jpsenha_med.setText("");
        jtftelefone_med.setText("");
        jtfrg_med.setText("");
        jtfcpf_med.setText("");
        jtfnome_med.setEnabled(false);
        jtfendereco_med.setEnabled(false);
        jcbsexo_medico.setEnabled(false);
        jtfusuario_med.setEnabled(false);
        jpsenha_med.setEnabled(false);
        jtftelefone_med.setEnabled(false);
        jtfrg_med.setEnabled(false);
        jtfcpf_med.setEnabled(false);
        jbsalvar_med.setEnabled(false);
        jtfcrm_med.setEnabled(false);
        jbNovo.setEnabled(true);
        jbCancelar.setEnabled(false);
        jbEditar.setEnabled(false);
        jbExcluir.setEnabled(false);
       }
    }//GEN-LAST:event_jbExcluirActionPerformed
    public void preencherTabela(String Sql){
        ArrayList dados = new ArrayList();
        String [] colunas = new String[]{"Nome","Cpf","Rg","Crm"};
        conex.conexao();
            conex.executaSql(Sql);
            
            try{
                conex.rs.first();
                do{
                dados.add(new Object[] {conex.rs.getString("nome_medico"),conex.rs.getString("cpf"),conex.rs.getString("rg"),conex.rs.getInt("crm")});
                }while(conex.rs.next());
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(rootPane,"Erro ao preencher ArrayList"+ex);
            }
            ModeloTabela modelo = new ModeloTabela(dados,colunas);
            
            table_med.setModel(modelo);
            table_med.getColumnModel().getColumn(0).setPreferredWidth(200);
            table_med.getColumnModel().getColumn(0).setResizable(false);
            table_med.getColumnModel().getColumn(1).setPreferredWidth(160);
            table_med.getColumnModel().getColumn(1).setResizable(false);
            table_med.getColumnModel().getColumn(2).setPreferredWidth(160);
            table_med.getColumnModel().getColumn(2).setResizable(false);
            table_med.getColumnModel().getColumn(3).setPreferredWidth(100);
            table_med.getColumnModel().getColumn(3).setResizable(false);
            table_med.getTableHeader().setReorderingAllowed(false);
            table_med.setAutoResizeMode(table_med.AUTO_RESIZE_OFF);
            table_med.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        conex.desconecta();
    }
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
            java.util.logging.Logger.getLogger(Cmedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cmedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cmedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cmedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cmedico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbNovo;
    private javax.swing.JButton jbVoltar;
    private javax.swing.JButton jbsalvar_med;
    private javax.swing.JComboBox<String> jcbsexo_medico;
    private javax.swing.JPasswordField jpsenha_med;
    private javax.swing.JFormattedTextField jtfcpf_med;
    private javax.swing.JTextField jtfcrm_med;
    private javax.swing.JTextField jtfendereco_med;
    private javax.swing.JTextField jtfid_med;
    private javax.swing.JTextField jtfnome_med;
    private javax.swing.JTextField jtfpesquisa_med;
    private javax.swing.JTextField jtfrg_med;
    private javax.swing.JFormattedTextField jtftelefone_med;
    private javax.swing.JTextField jtfusuario_med;
    private javax.swing.ButtonGroup sexo;
    private javax.swing.JTable table_med;
    // End of variables declaration//GEN-END:variables
}
