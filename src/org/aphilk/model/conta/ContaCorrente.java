package org.aphilk.model.conta;

import org.aphilk.model.cliente.Cliente;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente, boolean administrador) {
        super(cliente, administrador);
    }

    @Override
    public void extrato(){
        System.out.println("*** Extrato Conta Corrente ***");
        infosComuns();      
    }
}
