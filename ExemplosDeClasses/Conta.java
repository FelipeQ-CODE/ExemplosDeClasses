package ExemplosDeClasses;

public class Conta {
     int numeroConta;
     int numeroCliente;
     double saldo;
     String dataAbertura;
     
     void saqueConta(double valor){
         saldo = saldo - valor;
     }
     void depositoConta(double valor){
         saldo = saldo + saldo;
     }
     Conta(){
     saldo=100.00;
    }
 }