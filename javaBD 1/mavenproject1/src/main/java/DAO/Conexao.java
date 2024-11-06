/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno.den
 */
public class Conexao {

    public Connection conectaBD(){
        Connection conn = null;
        
        try /*/É utilizado como um if else e o cath mostra o erro (se tiver)/*/{
            String url = "jdbc:mysql://localhost/banco?user=root&pasword";
            conn = DriverManager.getConnection(url); /*/Envia a conexão /*/
            
        } catch (SQLException e/*/Variavel onde o erro é jogado/*/) {
            JOptionPane.showMessageDialog(null, e.getMessage/*/getMessage puxa o erro e joga na variavel designada para mostrar/*/());
        }
    return conn;
    }
    
}
