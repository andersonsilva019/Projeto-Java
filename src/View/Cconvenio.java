
package View;

import modeloConection.ConexaoBD;
import modeloDao.DaoConvenio;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import modeloBeans.BeansConvenio;
import static sun.util.calendar.CalendarUtils.mod;
import static sun.util.calendar.CalendarUtils.mod;
import static sun.util.calendar.CalendarUtils.mod;
import static sun.util.calendar.CalendarUtils.mod;
import static sun.util.calendar.CalendarUtils.mod;
import static sun.util.calendar.CalendarUtils.mod;
import static sun.util.calendar.CalendarUtils.mod;
import static sun.util.calendar.CalendarUtils.mod;


public class Cconvenio extends javax.swing.JFrame {
    
    BeansConvenio mod = new BeansConvenio();
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    DaoConvenio control = new DaoConvenio();
    
    
    public Cconvenio() throws ClassNotFoundException {
        initComponents();
        setLocationRelativeTo(null);
        
    }
    public void cadastrarConvenio(){
    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtfnome_con = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        telefone_con = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jtfcnpj_con = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jcbplano_con = new javax.swing.JComboBox<>();
        jbnovo = new javax.swing.JButton();
        jbsalvar = new javax.swing.JButton();
        jbvoltar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        id_con = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jtfpesquisa_con = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jbexcluir = new javax.swing.JButton();
        jbcancelar = new javax.swing.JButton();
        jbeditar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/lOGONOVO.jpg"))); // NOI18N

        jButton3.setText("jButton3");

        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel3.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CADASTRAR CONVÊNIO");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(120, 20, 330, 29);

        jtfnome_con.setEnabled(false);
        jPanel3.add(jtfnome_con);
        jtfnome_con.setBounds(120, 110, 330, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NOME:");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(50, 120, 42, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("TELEFONE:");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(40, 170, 70, 17);

        try {
            telefone_con.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter(" (##) #########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        telefone_con.setEnabled(false);
        jPanel3.add(telefone_con);
        telefone_con.setBounds(120, 160, 118, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CNPJ:");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(70, 220, 37, 17);

        jtfcnpj_con.setEnabled(false);
        jPanel3.add(jtfcnpj_con);
        jtfcnpj_con.setBounds(120, 210, 141, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("PLANOS:");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(280, 170, 55, 17);

        jcbplano_con.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "R$ 19.00", "R$ 29.99", "R$ 39.99" }));
        jcbplano_con.setEnabled(false);
        jPanel3.add(jcbplano_con);
        jcbplano_con.setBounds(350, 160, 86, 30);

        jbnovo.setText("NOVO");
        jbnovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnovoActionPerformed(evt);
            }
        });
        jPanel3.add(jbnovo);
        jbnovo.setBounds(120, 330, 90, 23);

        jbsalvar.setText("SALVAR");
        jbsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbsalvarActionPerformed(evt);
            }
        });
        jPanel3.add(jbsalvar);
        jbsalvar.setBounds(120, 360, 90, 23);

        jbvoltar.setText("VOLTAR");
        jbvoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbvoltarActionPerformed(evt);
            }
        });
        jPanel3.add(jbvoltar);
        jbvoltar.setBounds(120, 390, 90, 23);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("ID:");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(80, 80, 19, 17);

        id_con.setEnabled(false);
        jPanel3.add(id_con);
        id_con.setBounds(120, 70, 60, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("PESQUISA:");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(40, 270, 80, 17);
        jPanel3.add(jtfpesquisa_con);
        jtfpesquisa_con.setBounds(120, 260, 200, 30);

        jButton5.setText("BUSCAR");
        jPanel3.add(jButton5);
        jButton5.setBounds(340, 260, 90, 30);

        jbexcluir.setText("EXCLUIR");
        jPanel3.add(jbexcluir);
        jbexcluir.setBounds(330, 330, 100, 23);

        jbcancelar.setText("CANCELAR");
        jPanel3.add(jbcancelar);
        jbcancelar.setBounds(330, 360, 100, 23);

        jbeditar.setText("EDITAR");
        jPanel3.add(jbeditar);
        jbeditar.setBounds(330, 390, 100, 23);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/PIC-WSW30916.jpg"))); // NOI18N
        jPanel3.add(jLabel9);
        jLabel9.setBounds(0, 0, 580, 450);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 580, 460);

        setSize(new java.awt.Dimension(595, 489));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbnovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnovoActionPerformed
    jtfnome_con.setEnabled(true);
    telefone_con.setEnabled(true);
    jcbplano_con.setEnabled(true);
    jtfcnpj_con.setEnabled(true);
    }//GEN-LAST:event_jbnovoActionPerformed

    private void jbsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbsalvarActionPerformed
    
        try {
    mod.setNome(jtfnome_con.getText());
    mod.setTelefone(telefone_con.getText());
    mod.setPlano((String)jcbplano_con.getSelectedItem());
    mod.setCnpj(jtfcnpj_con.getText());
    control.Salvar(mod);
    jtfnome_con.setEnabled(false);
    telefone_con.setEnabled(false);
    jcbplano_con.setEnabled(false);
    jtfcnpj_con.setEnabled(false);
        } catch (SQLException ex) {
            Logger.getLogger(Cconvenio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbsalvarActionPerformed

    private void jbvoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbvoltarActionPerformed
        Secretaria sec = new Secretaria();
        sec.setVisible(true);
        dispose();
    }//GEN-LAST:event_jbvoltarActionPerformed

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
            java.util.logging.Logger.getLogger(Cconvenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cconvenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cconvenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cconvenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Cconvenio().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Cconvenio.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField id_con;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jbcancelar;
    private javax.swing.JButton jbeditar;
    private javax.swing.JButton jbexcluir;
    private javax.swing.JButton jbnovo;
    private javax.swing.JButton jbsalvar;
    private javax.swing.JButton jbvoltar;
    private javax.swing.JComboBox<String> jcbplano_con;
    private javax.swing.JTextField jtfcnpj_con;
    private javax.swing.JTextField jtfnome_con;
    private javax.swing.JTextField jtfpesquisa_con;
    private javax.swing.JFormattedTextField telefone_con;
    // End of variables declaration//GEN-END:variables
}
