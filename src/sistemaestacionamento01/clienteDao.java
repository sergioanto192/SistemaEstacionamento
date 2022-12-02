/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaestacionamento01;

import conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author SERGIVS
 */
public class clienteDao {
      private Connection con;
      Cliente c = new Cliente();
      estacionamento e = new estacionamento();
      
     
    
   
   public clienteDao(){
       this.con = new ConnectionFactory().getConnection();
   }
   
   public void update(Cliente c){
       try{
           
            
            
             
           //Criar o comando sql
           String sql = "UPDATE estacionamento\n" +
"SET placaCarro = ?, clienteNome = ?, disponibilidade = 0\n" +
"WHERE vagaNumero = ?;";
           
          
           PreparedStatement stmt = con.prepareStatement(sql);
          
           
           stmt.setString(1, c.getPlacaCarro());
            stmt.setString(2, c.getNomeCliente());
             stmt.setString(3, c.getVagatemp() );
             
             stmt.executeUpdate();
           JOptionPane.showMessageDialog(null, "sucesso" + c.getNomeCliente() + c.getPlacaCarro());
           
          
           
           
         
           
       } catch (SQLException error) {
           JOptionPane.showMessageDialog(null, "Erro: " + error);
           
       } finally {
           
       }
       
        
      
   }
   
   public void login(String login, String senha){
       try{
           
            //Criar o comando sql
           String sql = "select * from cliente where clienteLogin = ? and ClienteSenha = ?  ";
           
           //conectar o banco de dados e organizar o comando
           PreparedStatement stmt = con.prepareStatement(sql);
           
           
            
             
        
                 stmt.setString(1, login);
                 stmt.setString(2, senha);
                 
                 //cria o result set e incia o comando sql
           ResultSet rs = stmt.executeQuery();
                 
                 if (rs.next()){
                     c.setNomeCliente(rs.getString("clienteNome"));
                     c.setPlacaCarro(rs.getString("placaCarro"));
                     
                     JOptionPane.showMessageDialog(null, "login encontrado");
                     JOptionPane.showMessageDialog(null, "sucesso" + c.getNomeCliente() + c.getPlacaCarro());
                      TelaEstacionamento te = new TelaEstacionamento();
                     te.nomeTemp = c.getNomeCliente();
                     te.placaTemp = c.getPlacaCarro();
                     
                     te.setVisible(true);
                 }
                 
                 else{
                     JOptionPane.showMessageDialog(null, "login não encontrado");
                 }
          
               
          
           
           
             
             
           
          
           
           
         
           
       } catch (SQLException error) {
           JOptionPane.showMessageDialog(null, "Erro: " + error);
           
       } finally {
           
       }
   }
}
