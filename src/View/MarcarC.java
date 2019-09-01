/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modeloBeans.BeansMarcarC;
import modeloBeans.ModeloTabela;
import modeloConection.ConexaoBD;
import modeloDao.DaoConsulta;





public class MarcarC extends javax.swing.JFrame {
    
   
    ConexaoBD conex = new ConexaoBD();
    BeansMarcarC consulta = new BeansMarcarC();
    

    
    public MarcarC() {
        initComponents();
        preencherMedico();
        
    }
public void preencherMedico(){
        conex.conexao();
        
            conex.executaSql("select * from medicos order by nome_medico");
        try {
            conex.rs.first();
            jcbmedico_con.removeAllItems();
            do{
                jcbmedico_con.addItem(conex.rs.getString("nome_medico"));
            }while(conex.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,"Erro ao preencher o campo Medico"+ex);
        }
        
        conex.desconecta();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jBpesquisa = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CancelarConsulta = new javax.swing.JButton();
        MarcarConsulta = new javax.swing.JButton();
        jtfpesquisa_paci_con = new javax.swing.JTextField();
        jcbmedico_con = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_consulta = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jtfmotivo = new javax.swing.JTextField();
        jDateChooser = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jcbturno = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 0));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setText("VOLTAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 400, 110, 40));

        jBpesquisa.setText("Pesquisar");
        jBpesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBpesquisaActionPerformed(evt);
            }
        });
        jPanel1.add(jBpesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, -1, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("MARCAR CONSULTA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("PACIENTE:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("MÉDICO:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("DATA:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, -1, 30));

        CancelarConsulta.setText("CANCELAR CONSULTA");
        CancelarConsulta.setEnabled(false);
        CancelarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarConsultaActionPerformed(evt);
            }
        });
        jPanel1.add(CancelarConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, 180, 40));

        MarcarConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/novo.png"))); // NOI18N
        MarcarConsulta.setText("MARCAR CONSULTA");
        MarcarConsulta.setEnabled(false);
        MarcarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarcarConsultaActionPerformed(evt);
            }
        });
        jPanel1.add(MarcarConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 200, 40));
        jPanel1.add(jtfpesquisa_paci_con, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 210, 30));

        jcbmedico_con.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbmedico_con.setEnabled(false);
        jPanel1.add(jcbmedico_con, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 170, 30));

        table_consulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Cpf", "Rg", "Usuario"
            }
        ));
        table_consulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_consultaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_consulta);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 590, 90));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("MOTIVO:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, -1, -1));

        jtfmotivo.setEnabled(false);
        jPanel1.add(jtfmotivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 510, 60));

        jDateChooser.setEnabled(false);
        jPanel1.add(jDateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, 230, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("TURNO:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, -1, 30));

        jcbturno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MANHÃ", "TARDE", "NOITE" }));
        jcbturno.setToolTipText("");
        jcbturno.setEnabled(false);
        jPanel1.add(jcbturno, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, 140, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Wallpapers-For-Doctors-Gallery-73-Plus-PIC-WPW1010220.jpg"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 480));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 720, 480);

        setSize(new java.awt.Dimension(736, 513));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBpesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBpesquisaActionPerformed
        preencherTabela("Select * from paciente where nome_paciente like '%"+jtfpesquisa_paci_con.getText()+"%'");
    }//GEN-LAST:event_jBpesquisaActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Secretaria sec = new Secretaria();
        sec.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void table_consultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_consultaMouseClicked
       String nome_paciente = ""+table_consulta.getValueAt(table_consulta.getSelectedRow(), 0);
       conex.conexao();
       conex.executaSql("select * from paciente where nome_paciente='"+nome_paciente+"'");
        try {
            conex.rs.first();
            jtfpesquisa_paci_con.setText(conex.rs.getString("nome_paciente"));
            conex.desconecta();
            jcbturno.setEnabled(true);
            jcbmedico_con.setEnabled(true);
            jDateChooser.setEnabled(true);
            jcbmedico_con.setEnabled(true);
            jtfmotivo.setEnabled(true);
            MarcarConsulta.setEnabled(true);
            CancelarConsulta.setEnabled(true);
        } catch (SQLException ex) {
            Logger.getLogger(MarcarC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_table_consultaMouseClicked

    private void MarcarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MarcarConsultaActionPerformed
        consulta.setNomePac(jtfpesquisa_paci_con.getText());
        consulta.setNomeMed((String) jcbmedico_con.getSelectedItem());
        consulta.setMotivo(jtfmotivo.getText());
        consulta.setTurno((String) jcbturno.getSelectedItem());
        consulta.setData(jDateChooser.getDate());
        consulta.setStatus("Aberto");
        DaoConsulta dao = new DaoConsulta();
        dao.Salvar(consulta);
        
        dispose();
        jtfpesquisa_paci_con.setText("");
        jDateChooser.setDateFormatString("00-00-0000");
        jtfmotivo.setText("");
        jcbturno.setEnabled(!true);
            jcbmedico_con.setEnabled(!true);
            jDateChooser.setEnabled(!true);
            jcbmedico_con.setEnabled(!true);
            jtfmotivo.setEnabled(!true);
            MarcarConsulta.setEnabled(!true);
            CancelarConsulta.setEnabled(!true);
    }//GEN-LAST:event_MarcarConsultaActionPerformed

    private void CancelarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarConsultaActionPerformed
       jtfpesquisa_paci_con.setText("");
        jDateChooser.setDateFormatString(null);
        jtfmotivo.setText("");
        jcbturno.setEnabled(!true);
            jcbmedico_con.setEnabled(!true);
            jDateChooser.setEnabled(!true);
            jcbmedico_con.setEnabled(!true);
            jtfmotivo.setEnabled(!true);
            MarcarConsulta.setEnabled(!true);
            CancelarConsulta.setEnabled(!true);
    }//GEN-LAST:event_CancelarConsultaActionPerformed
public void preencherTabela(String Sql){
     ArrayList dados = new ArrayList();
        String [] colunas = new String[]{"Nome","Cpf","Rg","Usuario"};
        conex.conexao();
        conex.executaSql(Sql);
            
            try{
                conex.rs.first();
                do{
                dados.add(new Object[] {conex.rs.getString("nome_paciente"),conex.rs.getString("cpf"),conex.rs.getString("rg"),conex.rs.getString("usuario")});
                }while(conex.rs.next());
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(rootPane,"Erro ao preencher ArrayList"+ex);
            }
            ModeloTabela modelo = new ModeloTabela(dados,colunas);
            
            table_consulta.setModel(modelo);
            table_consulta.getColumnModel().getColumn(0).setPreferredWidth(150);
            table_consulta.getColumnModel().getColumn(0).setResizable(false);
            table_consulta.getColumnModel().getColumn(1).setPreferredWidth(180);
            table_consulta.getColumnModel().getColumn(1).setResizable(false);
            table_consulta.getColumnModel().getColumn(2).setPreferredWidth(180);
            table_consulta.getColumnModel().getColumn(2).setResizable(false);
            table_consulta.getColumnModel().getColumn(3).setPreferredWidth(180);
            table_consulta.getColumnModel().getColumn(3).setResizable(false);
            table_consulta.getTableHeader().setReorderingAllowed(false);
            table_consulta.setAutoResizeMode(table_consulta.AUTO_RESIZE_OFF);
            table_consulta.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
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
            java.util.logging.Logger.getLogger(MarcarC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MarcarC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MarcarC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MarcarC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MarcarC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelarConsulta;
    private javax.swing.JButton MarcarConsulta;
    private javax.swing.JButton jBpesquisa;
    private javax.swing.JButton jButton3;
    private com.toedter.calendar.JDateChooser jDateChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcbmedico_con;
    private javax.swing.JComboBox<String> jcbturno;
    private javax.swing.JTextField jtfmotivo;
    private javax.swing.JTextField jtfpesquisa_paci_con;
    private javax.swing.JTable table_consulta;
    // End of variables declaration//GEN-END:variables
}
