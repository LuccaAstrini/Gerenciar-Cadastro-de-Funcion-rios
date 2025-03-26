package controller;


import java.io.IOException;
import model.Funcionario;
import model.FuncionariosDAO;

public class CadastroController {
    
     public void grava(String cod, String nome, double salario) throws IOException{
        //Instanciar Produto
        Funcionario cadastro = new Funcionario(cod, nome, salario);
        new FuncionariosDAO("produtos.txt").grava(cadastro);
    }
    
}
