package pacote1;

public class Main {

    public static void main(String[] args) {
        Cliente cli[] = new Cliente[5];
        cli[0] = new Cliente("Maurício");
        cli[1] = new Cliente("Carlos");
        cli[2] = new Cliente("Mariana");
        cli[3] = new Cliente("Cláudia");
        cli[4] = new Cliente("Patrick");

        Conta cc = new ContaCorrente(cli[1]);
        Conta cp = new ContaPoupanca(cli[2]);

        cc.depositar(350);
        cc.transferir(100, cp);
        cc.extratoCC();
        cp.extratoCP();
    }
}
