package org.aphilk.view;
import org.aphilk.model.cliente.Cliente;
import org.aphilk.model.conta.Conta;
import org.aphilk.model.conta.ContaCorrente;
import org.aphilk.model.conta.ContaPoupança;

public class App {
    public static void main(String[] args) throws Exception {
        Cliente joao = new Cliente();
        joao.setNome("João Pedro");
        
        Conta cc = new ContaCorrente(joao);
        cc.depositar(100);

        Conta poupança = new ContaPoupança(joao);
        cc.tranferir(poupança, 100);

        cc.extrato();
        poupança.extrato();
    }
}
