package dio.bootcamp.desafio;

public abstract class Conta implements iConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    // atributos
    protected int agencia;
    protected int numero;
    protected Double saldo;


    public Conta() {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }

    // Implementando a interface

    @Override
    public void sacar(Double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(Double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(Double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);

    }
    //Getters - Não existe lógica para inserir os setters

    public int getAgencia() {
        return agencia;
    }


    public int getNumero() {
        return numero;
    }


    public Double getSaldo() {
        return saldo;
    }

    protected void imprimirInfoComuns(){
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}
