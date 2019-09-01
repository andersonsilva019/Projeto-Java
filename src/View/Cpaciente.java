
package View;


import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modeloBeans.BeansPaciente;
import modeloBeans.ModeloTabela;
import modeloDao.DaoPaciente;
import modeloConection.ConexaoBD;
import static sun.util.calendar.CalendarUtils.mod;
import static sun.util.calendar.CalendarUtils.mod;
import static sun.util.calendar.CalendarUtils.mod;
import static sun.util.calendar.CalendarUtils.mod;
import static sun.util.calendar.CalendarUtils.mod;
import static sun.util.calendar.CalendarUtils.mod;
import static sun.util.calendar.CalendarUtils.mod;
import static sun.util.calendar.CalendarUtils.mod;

public class Cpaciente extends javax.swing.JFrame {

      
    BeansPaciente mod = new BeansPaciente();
    DaoPaciente control = new DaoPaciente();
    ConexaoBD conex = new ConexaoBD();
    int flag = 0;
            
        public Cpaciente() {
        initComponents();
        preencherConvenio();
    }
    
    public void CadastrarPaciente(){
     
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jtfendereco_paciente = new javax.swing.JTextField();
        cpf_paciente = new javax.swing.JTextField();
        jtfusuario_paciente = new javax.swing.JTextField();
        rg_paciente = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        convenio_paciente = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtfnome_paciente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtftefefone_paciente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jpsenha_paciente = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        salvar_paciente = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jtfpesquisa_paci = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();
        jcbsexo_paciente = new javax.swing.JComboBox<>();
        jbVoltar = new javax.swing.JButton();
        jbNovo = new javax.swing.JButton();
        jbEditar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        id_paciente = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        jtfendereco_paciente.setEnabled(false);
        jPanel1.add(jtfendereco_paciente);
        jtfendereco_paciente.setBounds(140, 190, 437, 30);

        cpf_paciente.setEnabled(false);
        jPanel1.add(cpf_paciente);
        cpf_paciente.setBounds(140, 270, 141, 30);

        jtfusuario_paciente.setEnabled(false);
        jtfusuario_paciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfusuario_pacienteActionPerformed(evt);
            }
        });
        jPanel1.add(jtfusuario_paciente);
        jtfusuario_paciente.setBounds(140, 360, 150, 30);

        rg_paciente.setEnabled(false);
        jPanel1.add(rg_paciente);
        rg_paciente.setBounds(400, 270, 189, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("SEXO:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(80, 240, 39, 17);

        convenio_paciente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SUS" }));
        convenio_paciente.setEnabled(false);
        convenio_paciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convenio_pacienteActionPerformed(evt);
            }
        });
        jPanel1.add(convenio_paciente);
        convenio_paciente.setBounds(140, 310, 160, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("NOME:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(80, 160, 42, 17);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("ENDEREÇO: ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 200, 80, 17);

        jtfnome_paciente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfnome_paciente.setAlignmentX(1.0F);
        jtfnome_paciente.setEnabled(false);
        jPanel1.add(jtfnome_paciente);
        jtfnome_paciente.setBounds(140, 150, 437, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("TELEFONE:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(300, 240, 70, 17);

        jtftefefone_paciente.setEnabled(false);
        jPanel1.add(jtftefefone_paciente);
        jtftefefone_paciente.setBounds(400, 230, 190, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("CPF:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(90, 280, 29, 17);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setText("CADASTRO DO PACIENTE");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(140, 30, 461, 44);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("RG:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(360, 280, 23, 17);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("CONVÊNIO:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(50, 320, 72, 17);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("USUÁRIO:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(60, 370, 62, 17);

        jpsenha_paciente.setEnabled(false);
        jPanel1.add(jpsenha_paciente);
        jpsenha_paciente.setBounds(390, 360, 149, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("SENHA:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(340, 357, 47, 30);

        salvar_paciente.setText("SALVAR");
        salvar_paciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvar_pacienteActionPerformed(evt);
            }
        });
        jPanel1.add(salvar_paciente);
        salvar_paciente.setBounds(30, 460, 90, 23);

        jbCancelar.setText("CANCELAR");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(jbCancelar);
        jbCancelar.setBounds(140, 460, 100, 23);
        jPanel1.add(jtfpesquisa_paci);
        jtfpesquisa_paci.setBounds(140, 400, 250, 30);

        jbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/search.png"))); // NOI18N
        jbBuscar.setText("BUSCAR");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jbBuscar);
        jbBuscar.setBounds(400, 400, 110, 30);

        jcbsexo_paciente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MASCULINO", "FEMININO" }));
        jcbsexo_paciente.setEnabled(false);
        jcbsexo_paciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbsexo_pacienteActionPerformed(evt);
            }
        });
        jPanel1.add(jcbsexo_paciente);
        jcbsexo_paciente.setBounds(140, 240, 140, 20);

        jbVoltar.setText("VOLTAR");
        jbVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVoltarActionPerformed(evt);
            }
        });
        jPanel1.add(jbVoltar);
        jbVoltar.setBounds(390, 460, 90, 23);

        jbNovo.setText("NOVO");
        jbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoActionPerformed(evt);
            }
        });
        jPanel1.add(jbNovo);
        jbNovo.setBounds(270, 460, 90, 23);

        jbEditar.setText("EDITAR");
        jbEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarActionPerformed(evt);
            }
        });
        jPanel1.add(jbEditar);
        jbEditar.setBounds(510, 460, 90, 23);

        jbExcluir.setText("EXCLUIR");
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });
        jPanel1.add(jbExcluir);
        jbExcluir.setBounds(630, 460, 90, 23);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("ID:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(110, 120, 19, 17);

        id_paciente.setEnabled(false);
        jPanel1.add(id_paciente);
        id_paciente.setBounds(140, 110, 40, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("PESQUISA:");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(50, 410, 90, 17);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/paciente.jpg"))); // NOI18N
        jPanel1.add(jLabel13);
        jLabel13.setBounds(0, 0, 750, 530);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 750, 530);

        setSize(new java.awt.Dimension(767, 568));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void preencherConvenio(){
        conex.conexao();
        
            conex.executaSql("select * from convenio order by nome_convenio");
        try {
            conex.rs.first();
            convenio_paciente.removeAllItems();
            do{
                convenio_paciente.addItem(conex.rs.getString("nome_convenio"));
            }while(conex.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,"Erro ao preencher Convenio"+ex);
        }
        
        conex.desconecta();
    }
    
    private void convenio_pacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convenio_pacienteActionPerformed
        
        
    }//GEN-LAST:event_convenio_pacienteActionPerformed

    private void salvar_pacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvar_pacienteActionPerformed
        
        try {
        if(flag==1){
        mod.setNome(jtfnome_paciente.getText());
        mod.setEndereco(jtfendereco_paciente.getText());
        mod.setSexo((String)jcbsexo_paciente.getSelectedItem());
        mod.setTelefone(Integer.parseInt(jtftefefone_paciente.getText()));
        mod.setCpf(cpf_paciente.getText());
        mod.setRg(rg_paciente.getText());
        mod.setConvenio((String)convenio_paciente.getSelectedItem());
        mod.setUsuario(jtfusuario_paciente.getText());
        mod.setSenha(jpsenha_paciente.getText());
        control.Salvar(mod);
        jtfnome_paciente.setEnabled(false);
        jtfendereco_paciente.setEnabled(false);
        jcbsexo_paciente.setEnabled(false);
        jtftefefone_paciente.setEnabled(false);
        cpf_paciente.setEnabled(false);
        rg_paciente.setEnabled(false);
        convenio_paciente.setEnabled(false);
        jtfusuario_paciente.setEnabled(false);
        jpsenha_paciente.setEnabled(false);
        }else{
        mod.setNome(jtfnome_paciente.getText());
        mod.setEndereco(jtfendereco_paciente.getText());
        mod.setSexo((String)jcbsexo_paciente.getSelectedItem());
        mod.setTelefone(Integer.parseInt(jtftefefone_paciente.getText()));
        mod.setCpf(cpf_paciente.getText());
        mod.setRg(rg_paciente.getText());
        mod.setConvenio((String)convenio_paciente.getSelectedItem());
        mod.setUsuario(jtfusuario_paciente.getText());
        mod.setSenha(jpsenha_paciente.getText());
        control.Editar(mod);
        jtfnome_paciente.setText("");
        jtfendereco_paciente.setText("");
        jtftefefone_paciente.setText("");
        cpf_paciente.setText("");
        rg_paciente.setText("");
        jtfusuario_paciente.setText("");
        jpsenha_paciente.setText("");
        jtfnome_paciente.setEnabled(false);
        jtfendereco_paciente.setEnabled(false);
        jcbsexo_paciente.setEnabled(false);
        jtftefefone_paciente.setEnabled(false);
        cpf_paciente.setEnabled(false);
        rg_paciente.setEnabled(false);
        convenio_paciente.setEnabled(false);
        jtfusuario_paciente.setEnabled(false);
        jpsenha_paciente.setEnabled(false);
        jbNovo.setEnabled(true);
        jbCancelar.setEnabled(false);
        
            }
        } catch (SQLException ex) {
            Logger.getLogger(Cpaciente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_salvar_pacienteActionPerformed

    private void jtfusuario_pacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfusuario_pacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfusuario_pacienteActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        mod.setPesquisa(jtfpesquisa_paci.getText());
       BeansPaciente model = control.buscaPaciente(mod);
       id_paciente.setText(String.valueOf(model.getId_paciente()));
       jtfnome_paciente.setText(model.getNome());
       jtfendereco_paciente.setText(model.getEndereco());
       jcbsexo_paciente.setSelectedItem(model.getSexo());
       jtftefefone_paciente.setText(String.valueOf(model.getTelefone()));
       cpf_paciente.setText(model.getCpf());
       rg_paciente.setText(model.getRg());
       convenio_paciente.setSelectedItem(model.getConvenio());
       jtfusuario_paciente.setText(model.getUsuario());
       jpsenha_paciente.setText(model.getSenha());
       jbEditar.setEnabled(true);
       jbExcluir.setEnabled(true);
       
       
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jcbsexo_pacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbsexo_pacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbsexo_pacienteActionPerformed

    private void jbVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVoltarActionPerformed
        Secretaria sec = new Secretaria();
        sec.setVisible(true);
        dispose();
    }//GEN-LAST:event_jbVoltarActionPerformed

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
        flag=1;
            jtfnome_paciente.setEnabled(true);
            jtfendereco_paciente.setEnabled(true);
            jcbsexo_paciente.setEnabled(true);
            jtftefefone_paciente.setEnabled(true);
            cpf_paciente.setEnabled(true);
            convenio_paciente.setEnabled(true);
            rg_paciente.setEnabled(true);
            jtfusuario_paciente.setEnabled(true);
            jpsenha_paciente.setEnabled(true);
            
            
            
    }//GEN-LAST:event_jbNovoActionPerformed

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
        flag=2;
        jtfnome_paciente.setEnabled(true);
            jtfendereco_paciente.setEnabled(true);
            jcbsexo_paciente.setEnabled(true);
            jtftefefone_paciente.setEnabled(true);
            cpf_paciente.setEnabled(true);
            convenio_paciente.setEnabled(true);
            rg_paciente.setEnabled(true);
            jtfusuario_paciente.setEnabled(true);
            jpsenha_paciente.setEnabled(true);
            jbCancelar.setEnabled(true);
            jbNovo.setEnabled(false);
            jbExcluir.setEnabled(false);
            jbEditar.setEnabled(false);
            
            
        
    }//GEN-LAST:event_jbEditarActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
         jtfendereco_paciente.setEnabled(!true);
            jcbsexo_paciente.setEnabled(!true);
            jtftefefone_paciente.setEnabled(!true);
            cpf_paciente.setEnabled(!true);
            convenio_paciente.setEnabled(!true);
            rg_paciente.setEnabled(!true);
            jtfusuario_paciente.setEnabled(!true);
            jpsenha_paciente.setEnabled(!true);
            jbCancelar.setEnabled(!true);
            jbExcluir.setEnabled(false);
            jbEditar.setEnabled(false);
            jtfnome_paciente.setEnabled(false);
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
         int resposta = 0;
       resposta = JOptionPane.showConfirmDialog(rootPane,"Deseja realmente excluir?");
       if(resposta == JOptionPane.YES_OPTION){
           mod.setId_paciente(Integer.parseInt(id_paciente.getText()));
           control.Excluir(mod);
           jtfnome_paciente.setText("");
        jtfendereco_paciente.setText("");
        jtftefefone_paciente.setText("");
        cpf_paciente.setText("");
        rg_paciente.setText("");
        jtfusuario_paciente.setText("");
        jpsenha_paciente.setText("");
        id_paciente.setText("");
        jtfnome_paciente.setEnabled(false);
        jtfendereco_paciente.setEnabled(false);
        jcbsexo_paciente.setEnabled(false);
        jtftefefone_paciente.setEnabled(false);
        cpf_paciente.setEnabled(false);
        rg_paciente.setEnabled(false);
        convenio_paciente.setEnabled(false);
        jtfusuario_paciente.setEnabled(false);
        jpsenha_paciente.setEnabled(false);
        jbNovo.setEnabled(true);
        jbCancelar.setEnabled(false);
        jbExcluir.setEnabled(false);
        jbEditar.setEnabled(false);
           
       }
    }//GEN-LAST:event_jbExcluirActionPerformed
     public void preencherTabela(String Sql){
        ArrayList dados = new ArrayList();
        String [] colunas = new String[]{"NOME","CPF","RG","CONVENIO"};
        conex.conexao();
            conex.executaSql(Sql);
            
            try{
                conex.rs.first();
                do{
                dados.add(new Object[] {conex.rs.getString("nome_paciente"),conex.rs.getString("cpf"),conex.rs.getString("rg"),conex.rs.getInt("crm")});
                }while(conex.rs.next());
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(rootPane,"Erro ao preencher ArrayList"+ex);
            }
            ModeloTabela modelo = new ModeloTabela(dados,colunas);
            
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
            java.util.logging.Logger.getLogger(Cpaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cpaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cpaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cpaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cpaciente().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> convenio_paciente;
    private javax.swing.JTextField cpf_paciente;
    private javax.swing.JTextField id_paciente;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbNovo;
    private javax.swing.JButton jbVoltar;
    private javax.swing.JComboBox<String> jcbsexo_paciente;
    private javax.swing.JPasswordField jpsenha_paciente;
    private javax.swing.JTextField jtfendereco_paciente;
    private javax.swing.JTextField jtfnome_paciente;
    private javax.swing.JTextField jtfpesquisa_paci;
    private javax.swing.JTextField jtftefefone_paciente;
    private javax.swing.JTextField jtfusuario_paciente;
    private javax.swing.JTextField rg_paciente;
    private javax.swing.JButton salvar_paciente;
    // End of variables declaration//GEN-END:variables
}
