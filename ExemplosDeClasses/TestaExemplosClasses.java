package ExemplosDeClasses;

public class TestaExemplosClasses {
    public static void main(String[] args) {
        ContaPoupanca cp = new ContaPoupanca();
        cp.saqueConta(30);
        System.out.println("Saldo em Poupança:" +cp.saldo);
    
        ContaCorrente cc = new ContaCorrente();
        cc.saqueConta(500);
        System.out.println("Saldo em Conta Corrente:"+ cc.saldo);
} 
}
