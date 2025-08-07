package org.aphilk.model.banco;
import java.util.List;

import org.aphilk.model.conta.Conta;

public class Banco {
    private List<Conta> contas;

    public List<Conta> getContas() {
        return contas;
    }

    public void adicionarConta(Conta conta) {
        this.contas.add(conta);
    }

    public Conta buscarContaPorNumero(int numeroConta) {
        for (Conta conta : contas) {
            if (conta.getNumero() == numeroConta) {
                return conta;
            }
        }
        return null;
    }
}
