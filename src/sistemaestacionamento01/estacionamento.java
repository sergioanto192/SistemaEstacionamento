/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaestacionamento01;

import conexao.ConnectionFactory;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;


/**
 *
 * @author SERGIVS
 */
public class estacionamento {
  private String  vagaNumero ;
  private int andar;
   private String coluna;
   private int disponibilidade;

    public void setVagaNumero(String vagaNumero) {
        this.vagaNumero = vagaNumero;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public void setColuna(String coluna) {
        this.coluna = coluna;
    }

    public void setDisponibilidade(int disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
   
 @Override
 public String toString(){
     return this.getVagaNumero();
 }
   
   
   
   
   
   
    public String getVagaNumero() {
        return vagaNumero;
    }

    public int getAndar() {
        return andar;
    }

    public String getColuna() {
        return coluna;
    }

    public int getDisponibilidade() {
        return disponibilidade;
    }
   
  

    
}


 