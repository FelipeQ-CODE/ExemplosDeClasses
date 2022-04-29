package ExemplosDeClasses;

public class ContaPoupanca extends Conta{
    String datasAniversarios;
    @Override
    void saqueConta(double valor){
        if((saldo - valor) < 0)
            System.out.println("ERRO: O saldo ficará negativo!!");

        else
            saldo-= valor;
      }

    ContaPoupanca(){

    }

    ContaPoupanca(double x, double y){
      saldo = y + x;
    }

    ContaPoupanca(int numeroConta, String dataAbertura, double saldo){
        this.numeroConta = numeroConta;
        this.dataAbertura = dataAbertura;
        this.saldo = saldo;
    }
       
   }
          