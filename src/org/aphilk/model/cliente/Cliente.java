package org.aphilk.model.cliente;

public class Cliente {
    private String nome;
    private String cpf;
    private String senha;

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
    public Cliente(String nome, String cpf, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
