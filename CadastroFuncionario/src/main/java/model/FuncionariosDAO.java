/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author android
 */
public class FuncionariosDAO {
    
    private String nomeArq = null;
    
    public FuncionariosDAO(String nomeArq){
        this.nomeArq = nomeArq;
    } 
    
    public void grava(Funcionario funcionario) throws IOException{  
        FileWriter arquivoSaida; //objeto para o arquivo onde a escrita será realizada
        
        PrintWriter out; //objeto para escrever
        //Instanciar as classes
        arquivoSaida = new FileWriter(nomeArq); //abertura do arquivo
        
        out = new PrintWriter(arquivoSaida);
        
        //gravar os dados no arquivo
        out.println(funcionario);
        
        //fechar o arquivo
        out.close();
        arquivoSaida.close();
    }
    
}
