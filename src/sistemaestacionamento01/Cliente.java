/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaestacionamento01;
import java.util.Date;
import java.text.*;

/**
 *
 * @author SERGIVS
 */
public class Cliente {
    
    private String nomeCliente;
    private String DataNascimento;
    private int deficiencia;
    private String cpf;
    private String Senha;
    private String Login;
    private String email;
    private String placaCarro;
    private String vagatemp;
    

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getDataNascimento() {
        return DataNascimento;
    }

    public void setDataNascimento(String DataNascimento) {
        this.DataNascimento = DataNascimento;
    }

   

    

    public int getDeficiencia() {
        return deficiencia;
    }

    public void setDeficiencia(int deficiencia) {
        this.deficiencia = deficiencia;
    }

   

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String Login) {
        this.Login = Login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPlacaCarro() {
        return placaCarro;
    }

    public void setPlacaCarro(String placaCarro) {
        this.placaCarro = placaCarro;
    }

    public String getVagatemp() {
        return vagatemp;
    }

    public void setVagatemp(String vagatemp) {
        this.vagatemp = vagatemp;
    }
    
    
    
    
}
