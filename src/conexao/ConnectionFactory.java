/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexao;
//importações 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author SERGIVS
 */

//Metodo para criar conexão ao banco de dados
public class ConnectionFactory {
    public Connection getConnection() {
try {
return DriverManager.getConnection(
"jdbc:mysql://localhost:3306/sistemaEstacionamento", "root", "admin123");
} catch (SQLException e) {
throw new RuntimeException(e);
}
}
}
