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
public class estacionamentoDao {
      private Connection con;
      
    
   
   public estacionamentoDao(){
       this.con = new ConnectionFactory().getConnection();
   }
   
   public void update(estacionamento d){
       try{
           
            
            
             
           //Criar o comando sql
           String sql = "UPDATE estacionamento\n" +
"SET  disponibilidade = 0\n" +
"WHERE vagaNumero = ?;";
           
          
           PreparedStatement stmt = con.prepareStatement(sql);
          
           
           stmt.setInt(1, d.getDisponibilidade());
            
             
             stmt.executeUpdate();
           
           
          
           
           
         
           
       } catch (SQLException error) {
           JOptionPane.showMessageDialog(null, "Erro: " + error);
           
       } finally {
           
       }
       
        
      
   }
   
   
   public List<estacionamento> listaEstacionamento(){
       try{
           
             List<estacionamento> list = new ArrayList<>();
             
           //Criar o comando sql
           String sql = "select * from estacionamento where vagaDeficiente = 0 and disponibilidade = 1";
           
           //conectar o banco de dados e organizar o comando
           PreparedStatement stmt = con.prepareStatement(sql);
           
           //cria o result set e incia o comando sql
           ResultSet rs = stmt.executeQuery();
           
           while(rs.next()) {
                 estacionamento obj = new estacionamento();
                 
               obj.setAndar(rs.getInt("Andar"));
               obj.setColuna(rs.getString("Coluna"));
          
               obj.setVagaNumero(rs.getString("VagaNumero"));
               
              
               
               list.add(obj);
           }
           return list;
           
           
         
           
       } catch (SQLException error) {
           JOptionPane.showMessageDialog(null, "Erro: " + error);
           return null;
       }
      
   }
   public List<estacionamento> listaEstacionamento1(){
       try{
           
             List<estacionamento> list = new ArrayList<>();
             
           //Criar o comando sql
           String sql = "select * from estacionamento where vagaDeficiente = 1 and disponibilidade = 1";
           
           //conectar o banco de dados e organizar o comando
           PreparedStatement stmt = con.prepareStatement(sql);
           
           //cria o result set e incia o comando sql
           ResultSet rs = stmt.executeQuery();
           
           while(rs.next()) {
                 estacionamento obj = new estacionamento();
                 
               obj.setAndar(rs.getInt("Andar"));
               obj.setColuna(rs.getString("Coluna"));
          
               obj.setVagaNumero(rs.getString("VagaNumero"));
               
              
               
               list.add(obj);
           }
           return list;
           
           
         
           
       } catch (SQLException error) {
           JOptionPane.showMessageDialog(null, "Erro: " + error);
           return null;
       }
      
   }

}
