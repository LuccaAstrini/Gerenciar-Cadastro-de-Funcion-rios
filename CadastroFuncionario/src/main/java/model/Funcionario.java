package model;

public class Funcionario {
    private String nome;
    private int codigo;
    private double salario;

    public Funcionario(int codigo, String nome, double salario) {
        this.nome = nome;
        this.codigo = codigo;
        this.salario = salario;
    }

    public Funcionario() {
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + nome + ", codigo=" + codigo + ", salario=" + salario + '}';
    }
}
