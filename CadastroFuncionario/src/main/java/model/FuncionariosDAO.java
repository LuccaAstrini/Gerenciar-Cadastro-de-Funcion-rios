/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

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
    
     public Funcionario recupera(String codigo) throws FileNotFoundException{
        FileReader arquivoIn = new FileReader("funcionarios.txt");
        Scanner leitor = new Scanner(arquivoIn);
        
        //Procurar o código do produto através da leitura enquanto houver 
        while(leitor.hasNext()){
             String nome = leitor.nextLine();
            String cod = leitor.nextLine();
            String salario = leitor.nextLine();
            
            System.out.println(codigo+"-"+cod);
            
            if(cod.equalsIgnoreCase(codigo)){
                return new Funcionario(cod,nome,Double.parseDouble(salario));
            }
        }
        return null;
    }
    
}
