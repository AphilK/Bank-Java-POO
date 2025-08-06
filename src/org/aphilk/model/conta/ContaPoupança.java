package org.aphilk.model.conta;

import org.aphilk.model.cliente.Cliente;

public class ContaPoupança extends Conta {
    public ContaPoupança(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void extrato(){
        System.out.println("*** Extrato Conta Poupança ***");   
        infosComuns();
    }
}