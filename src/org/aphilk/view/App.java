package org.aphilk.view;
import java.util.Scanner;

import org.aphilk.model.banco.Banco;
import org.aphilk.model.cliente.Cliente;
import org.aphilk.model.conta.Conta;
import org.aphilk.model.conta.ContaCorrente;
import org.aphilk.model.conta.ContaPoupança;

public class App {
    public static void main(String [] args) {

        Cliente admin = new Cliente("Admin", "000.000.000-00", "admin123");
        Conta contaAdmin = new ContaCorrente(admin, true);
        Banco banco = new Banco();
        banco.adicionarConta(contaAdmin);

        Scanner scanner = new Scanner(System.in);
        int option;

        System.out.println("*** Banco no terminal 2.0 ***");
        System.out.println("1 - Criar nova conta");
        System.out.println("2 - Entrar em uma conta existente");
        System.out.println("3 - Sair");
        option = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character left by nextInt()

        switch (option) {
            case 1:
                System.out.println("\nCriar nova conta selecionada.");
                System.out.println("Digite o nome do cliente:");
                String nomeCliente = scanner.nextLine();

                System.out.println("Digite o CPF do cliente:");
                String cpfCliente = scanner.nextLine();

                System.out.println("Digite a sua senha:");
                String senhaCliente;
                if (System.console() != null) {
                    char[] senhaArray = System.console().readPassword();
                    senhaCliente = new String(senhaArray);
                } else {
                    System.out.println("(Aviso: a senha será visível ao digitar, pois o console não está disponível)");
                    senhaCliente = scanner.nextLine();
                }
                scanner.nextLine(); // Consume the newline character left by nextLong()

                Cliente novoCliente = new Cliente(nomeCliente, cpfCliente, senhaCliente);
                System.out.println("Cliente criado com sucesso:");
                System.out.println(novoCliente);

                System.out.println("Escolha o tipo de conta:");
                System.out.println("1 - Conta Corrente");
                System.out.println("2 - Conta Poupança");
                int tipoConta = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character left by nextInt()
                
                Conta novaConta;
                if (tipoConta == 1) {
                    novaConta = new ContaCorrente(novoCliente, false);
                } else if (tipoConta == 2) {
                    novaConta = new ContaPoupança(novoCliente, false);
                } else {
                    System.out.println("Tipo de conta inválido. Conta não criada. Tente novamente.");
                    break;
                }
                System.out.println("Conta criada com sucesso:");
                banco.adicionarConta(novaConta);
                System.out.println(novaConta);
                break;
            case 2:
                System.out.println("\nEntrar em uma conta existente selecionada.");
                System.out.println("Digite o número da conta:");
                int numeroConta = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character left by nextInt()
                System.out.println("Digite a senha da conta:");
                String senhaConta = scanner.nextLine();
                Conta contaExistente = banco.buscarContaPorNumero(numeroConta);
                if (contaExistente == null || !contaExistente.getCliente().getSenha().equals(senhaConta)) {
                    System.out.println("Conta não encontrada ou senha incorreta.");
                    break;
                }
                if (contaExistente != null) {
                    System.out.println("Conta encontrada:");
                    System.out.println(contaExistente);
                } else {
                    System.out.println("Conta não encontrada.");
                }
                
                break;
            case 3:
                System.out.println("\nSair selecionado.");
                break;
            default:
                System.out.println("\nOpção inválida.");
        }

        scanner.close();
        System.out.println("Obrigado por usar o Banco no terminal 2.0!");
    }
}