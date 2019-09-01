
package modeloDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloBeans.BeansConvenio;
import modeloConection.ConexaoBD;




 
    public class DaoConvenio {
    
     ConexaoBD conex = new ConexaoBD();
     BeansConvenio mod = new BeansConvenio();

     public void Salvar(BeansConvenio mod) throws SQLException{
     conex.conexao();
     
     PreparedStatement pst = conex.con.prepareStatement("insert into convenio(nome_convenio,planos,telefone,cnpj) values(?,?,?,?)");
     
     
     try{
            
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getPlano());
             pst.setString(3,mod.getTelefone());
              pst.setString(4, mod.getCnpj());
            
            pst.execute();
            
            JOptionPane.showMessageDialog(null,"Convenio cadastrado com sucesso!");
     }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao cadastrar o Convenio!"+ex.getMessage());
        }
            conex.desconecta();
     }
    }

