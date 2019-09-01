
package modeloDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modeloBeans.BeansMarcarC;
import modeloConection.ConexaoBD;


public class DaoConsulta {
    
    BeansMarcarC consulta = new BeansMarcarC();
    ConexaoBD conex = new ConexaoBD();
    ConexaoBD conexPaciente = new ConexaoBD();
    ConexaoBD conexMedico = new ConexaoBD();
    int codMed;
    int codPac;
    
    public void Salvar (BeansMarcarC consulta ){
    buscaMedico(consulta.getNomeMed());
    buscaPaciente(consulta.getNomePac());
    conex.conexao();
        try {
           
            PreparedStatement pst = conex.con.prepareStatement("insert into consulta (consulta_idpac, consulta_idmed,consulta_motivo,consulta_turno,consulta_data,consulta_status)values(?,?,?,?,?,?)");
            pst.setInt(1,codPac);
            pst.setInt(2,codMed);
            pst.setString(3,consulta.getMotivo());
            pst.setString(4,consulta.getTurno());
            pst.setDate(5,new java.sql.Date(consulta.getData().getTime()));
            pst.setString(6,consulta.getStatus());
            pst.execute();
            
            JOptionPane.showMessageDialog(null,"Consulta marcada com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao salvar consulta"+ex);
        }
    conex.desconecta();
    
    }
    public void buscaMedico(String nome_medico){
    conexMedico.conexao();
    
    conexMedico.executaSql("select * from medicos where nome_medico='"+nome_medico+"'");
        try {
            conexMedico.rs.first();
            codMed = conexMedico.rs.getInt("id_medico");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Medico não cadastrado");
        }
    }
    
    public void buscaPaciente(String nome_paciente){
    conexPaciente.conexao();
    
    conexPaciente.executaSql("select * from paciente where nome_paciente='"+nome_paciente+"'");
        try {
            conexPaciente.rs.first();
            codPac = conexPaciente.rs.getInt("id_paciente");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Paciente não cadastrado");
        }
    }
}
