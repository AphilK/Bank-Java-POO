package org.aphilk.model.banco;
import java.util.List;

import org.aphilk.model.conta.Conta;

public class Banco {
    private String nome;
    private List<Conta> contas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
