package controller;


import java.io.IOException;
import model.FuncionariosDAO;
import view.Cadastro;

public class CadastroController {
    
     public void grava(String cod, String nome, double salario) throws IOException{
        //Instanciar Produto
        Cadastro cadastro = new cadastro(cod, nome, salario);
        new FuncionariosDAO("produtos.txt").grava(cadastro);
    }
    
}
