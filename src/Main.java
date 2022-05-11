public class Main {
    public static void main(String[] args){
        Cliente ana = new Cliente();
        ana.setNome("Ana");

        Conta cc = new ContaCorrente(ana);
        cc.depositar(220);

        Conta poupanca = new ContaPoupanca(ana);
        cc.transferir(85, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }
}
