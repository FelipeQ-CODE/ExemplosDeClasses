package ExemplosDeClasses;

import java.util.Scanner;

import java.util.Scanner;
public class DigitaContaCorrente {
    public static void main (String x []){
        Scanner tc = new Scanner(System.in);
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
       System.out.print("Limite");
       cc.limite = tc.nextDouble ();
       System.out.print("Valor do depósito: ");
       cc.depositoConta(tc.nextDouble());
       System.out.print("Valor do saque: ");
       cc.saqueConta(tc.nextDouble());
       System.out.println("O saldo atual em conta corrente é: " + cc.saldo);

    }
}
