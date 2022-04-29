package ExemplosDeClasses;

import java.util.Scanner;

public class MenuDigitaConta {
    public static void main(String[] args) {
       Scanner tc = new Scanner(System.in);
       int opcao;

       System.out.print("Cadastro da conta");
       System.out.print("\nSelecione o Tipo de Conta : <1> para Corrente <2> para Poupança <0> para sair: ");
       opcao = tc.nextInt();
    if(opcao == 2) {
        ContaPoupanca cp = new ContaPoupanca();
        System.out.println("\n** Cadastro em Poupança** ");
        System.out.print("Numero da Conta: ");
        cp.numeroConta = tc.nextInt();
        System.out.print("Numero cliente: ");
        cp.numeroCliente = tc.nextInt();
        System.out.print("Data Abertura: ");
        cp.dataAbertura = tc.next();
        System.out.print("Digite as datas de aniversario: ");
        tc.nextLine();
        cp.datasAniversarios = tc.nextLine();
        System.out.println("As datas digitadas foram : " + cp.datasAniversarios);
        System.out.print("Valor do depósito: ");
        cp.depositoConta(tc.nextDouble());
        System.out.print("Valor do saque: ");
        cp.saqueConta(tc.nextDouble());
        System.out.println("O saldo atual é: " + cp.saldo);
    }
          if(opcao ==1){
        ContaCorrente cc = new ContaCorrente();
        System.out.println(" Cadastro em Conta Corrente ** ");
        System.out.print("Numero da Conta: ");
        cc.numeroConta = tc.nextInt();
        System.out.print("Numero cliente: ");
        cc.numeroCliente = tc.nextInt();
        System.out.print("Data Abertura: ");
        cc.dataAbertura = tc.next();
        System.out.print("Digite o código do Gerente: ");
        cc.gerente = tc.nextInt();
        System.out.print("Valor da taxa mensal: ");
        cc.taxamensal = tc.nextDouble();
        System.out.print("Limite: ");
        cc.limite = tc.nextDouble ();
        System.out.print("Valor do depósito: ");
        cc.depositoConta(tc.nextDouble());
        System.out.print("Valor do saque: ");
        cc.saqueConta(tc.nextDouble());
        System.out.println("O saldo atual em conta corrente é: " + cc.saldo);
    }
    }

}

