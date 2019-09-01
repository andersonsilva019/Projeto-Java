
package modeloDao;

import modeloConection.ConexaoBD;
import modeloBeans.BeansMedico;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Logger;
import java.util.logging.Level;
import javax.swing.JOptionPane;


public class DaoMedico {
    
    ConexaoBD conex = new ConexaoBD();
    BeansMedico mod = new BeansMedico();
   
    public void Salvar(BeansMedico mod) throws ClassNotFoundException{
    conex.conexao();
        try {
            
            PreparedStatement pst = conex.con.prepareStatement("insert into medicos(nome_medico,crm,usuario,senha,cpf,rg,telefone,endereco,sexo) values(?,?,?,?,?,?,?,?,?)");
            pst.setString(1,mod.getNome());
            pst.setInt(2, mod.getCrm());
            pst.setString(3, mod.getUsuario());
            pst.setString(4, mod.getSenha());
            pst.setString(5, mod.getCpf());
            pst.setString(6, mod.getRg());
            pst.setString(7, mod.getTelefone());
            pst.setString(8, mod.getEndereco());
            pst.setString(9, mod.getSexo());
            pst.execute();
            
            JOptionPane.showMessageDialog(null,"Dados inseridos com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao inserir os Dados!"+ex.getMessage());
        
    conex.desconecta();
        }
    }
    
    public void Editar(BeansMedico mod){
        conex.conexao();
        try {
            
           PreparedStatement pst = conex.con.prepareStatement("update medicos set nome_medico=?,crm=?,usuario=?,senha=?,cpf=?,rg=?,telefone=?,endereco=?,sexo=? where id_medico=?");
           pst.setString(1, mod.getNome());
           pst.setInt(2, mod.getCrm());
           pst.setString(3,mod.getUsuario());
           pst.setString(4,mod.getSenha());
           pst.setString(5,mod.getCpf());
           pst.setString(6,mod.getRg());
           pst.setString(7,mod.getTelefone());
           pst.setString(8,mod.getEndereco());
           pst.setString(9,mod.getSexo());
           pst.setInt(10,mod.getId());
           pst.execute();
            
            JOptionPane.showMessageDialog(null,"Dados alterados com sucesso");
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro na alteração dos dados!/nErro: "+ex);
        }
        conex.desconecta();
    }
    public void Excluir (BeansMedico mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from medicos where id_medico=?");
            pst.setInt(1,mod.getId());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Dados excluído  com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro na exclusão dos dados!/nErro: "+ex);
        }
        conex.desconecta();
    }
    
    public BeansMedico buscaMedico(BeansMedico mod){
    conex.conexao();
        conex.executaSql("select * from medicos where nome_medico like '%" +mod.getPesquisa()+"%'");
        try {
            conex.rs.first();
            mod.setId(conex.rs.getInt("id_medico"));
            mod.setNome(conex.rs.getString("nome_medico"));
            mod.setEndereco(conex.rs.getString("endereco"));
            mod.setSexo(conex.rs.getString("sexo"));
            mod.setTelefone(conex.rs.getString("telefone"));
            mod.setCrm(conex.rs.getInt("crm"));
            mod.setCpf(conex.rs.getString("cpf"));
            mod.setRg(conex.rs.getString("rg"));
            mod.setUsuario(conex.rs.getString("usuario"));
            mod.setSenha(conex.rs.getString("senha"));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao buscar médico!"+ex.getMessage());
        }
    conex.desconecta();
    return mod;
    
    }
    
}




