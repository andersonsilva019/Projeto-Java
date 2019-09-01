
package modeloDao;

import modeloConection.ConexaoBD;
import modeloBeans.BeansPaciente;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Logger;
import java.util.logging.Level;
import javax.swing.JOptionPane;


public class DaoPaciente {
    
     ConexaoBD conex = new ConexaoBD();
     BeansPaciente mod = new BeansPaciente();

     public void Salvar(BeansPaciente mod) throws SQLException{
     conex.conexao();
     
     PreparedStatement pst = conex.con.prepareStatement("insert into paciente(nome_paciente,endereco,sexo,telefone,cpf,rg,convenio,usuario,senha) values(?,?,?,?,?,?,?,?,?)");
     
     
     try{
            
            pst.setString(1, mod.getNome());
            pst.setString(2,mod.getEndereco());
            pst.setString(3, mod.getSexo());
            pst.setInt(4, mod.getTelefone());
            pst.setString(5, mod.getCpf());
            pst.setString(6, mod.getRg());
            pst.setString(7, mod.getConvenio());
            pst.setString(8, mod.getUsuario());
            pst.setString(9, mod.getSenha());
            pst.execute();
            
            JOptionPane.showMessageDialog(null,"Usuário inserido com sucesso!");
     }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao inserir o Usuário!"+ex.getMessage());
        }
            conex.desconecta();
     }
      public void Editar(BeansPaciente mod){
        conex.conexao();
        try {
            
           PreparedStatement pst = conex.con.prepareStatement("update paciente set nome_paciente=?,endereco=?,sexo=?,telefone=?,cpf=?,rg=?,convenio=?,usuario=?,senha=? where id_paciente=?");
           pst.setString(1, mod.getNome());
           pst.setString(2, mod.getEndereco());
           pst.setString(3,mod.getSexo());
           pst.setInt(4,mod.getTelefone());
           pst.setString(5,mod.getCpf());
           pst.setString(6,mod.getRg());
           pst.setString(7,mod.getConvenio());
           pst.setString(8,mod.getUsuario());
           pst.setString(9,mod.getSenha());
           pst.setInt(10,mod.getId_paciente());
           pst.execute();
            
            JOptionPane.showMessageDialog(null,"Dados alterados com sucesso");
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro na alteração dos dados!/nErro: "+ex);
        }
        conex.desconecta();
    }
        public void Excluir (BeansPaciente mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from paciente where id_paciente=?");
            pst.setInt(1,mod.getId_paciente());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Dados excluído  com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro na exclusão dos dados!/nErro: "+ex);
        }
        conex.desconecta();
    }
     public BeansPaciente buscaPaciente(BeansPaciente mod){
         conex.conexao();
         conex.executaSql("Select * from paciente where nome_paciente like '%"+mod.getPesquisa()+"%'");
         try {
             conex.rs.first();
             mod.setId_paciente(conex.rs.getInt("id_paciente"));
             mod.setNome(conex.rs.getString("nome_paciente"));
             mod.setEndereco(conex.rs.getString("endereco"));
             mod.setSexo(conex.rs.getString("sexo"));
             mod.setTelefone(conex.rs.getInt("telefone"));
             mod.setCpf(conex.rs.getString("cpf"));
             mod.setRg(conex.rs.getString("rg"));
             mod.setConvenio(conex.rs.getString("convenio"));
             mod.setUsuario(conex.rs.getString("usuario"));
             mod.setSenha(conex.rs.getString("senha"));
             
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Erro ao buscar o paciente!"+ex.getMessage());
         }
         conex.desconecta();
        return mod;
    
     }

}


