package controller;

import java.io.IOException;
import model.Produto;
import model.ProdutoDAO;

import java.io.IOException;

public class CadastroController {
    
     public void grava(String cod, String nome, double salario) throws IOException{
        //Instanciar Produto
        Cadastro cadastro = new cadastro(cod, nome, salario);
        new FuncionarioDAO("produtos.txt").grava(cadastro);
    }
    
}
