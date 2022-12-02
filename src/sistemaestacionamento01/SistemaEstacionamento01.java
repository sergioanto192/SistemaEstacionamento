/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemaestacionamento01;

import conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author SERGIVS
 */
public class SistemaEstacionamento01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
     
        //TelaCadastro1 tc = new TelaCadastro1();
        TelaInicio ti = new TelaInicio();
        ti.setVisible(true);

   
       
    }
    
}
