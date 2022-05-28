package pacote1;

public abstract class Conta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;//gerar um valor sequencial criado pela própria classe

    protected int agencia; // protected pode ser acessado pelas classes filhas
    protected int num;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.num = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public void sacar(double valor) {
        saldo = saldo - valor;
        // OU saldo -= valor;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void extratoCC() {
        System.out.println("----- Extrato da Conta Corrente ----- ");
        System.out.println(String.format("- Titular da Conta Corrente: %s", this.cliente.getNome()));
        System.out.println(String.format("- Agência: %d", this.agencia));
        System.out.println(String.format("- Número da Conta: %d", this.num));
        System.out.println(String.format("- Saldo: %.2f \n", this.saldo));
    }

    protected void extratoCP() {
        System.out.println("----- Extrato da Conta Poupança ----- ");
        System.out.println(String.format("- Titular da Conta Poupança: %s", this.cliente.getNome()));
        System.out.println(String.format("- Agência: %d", this.agencia));
        System.out.println(String.format("- Número da Conta: %d", this.num));
        System.out.println(String.format("- Saldo: %.2f \n", this.saldo));
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNum() {
        return num;
    }

    public double getSaldo() {
        return saldo;
    }

}
