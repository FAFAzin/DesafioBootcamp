package dio.bootcamp.desafio;

public abstract class Conta implements iConta {

    private static int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    // atributos
    protected int agencia;
    protected int numero;
    protected int saldo;


    public Conta() {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }

    //Getters - Não existe lógica para inserir os setters

    public int getAgencia() {
        return agencia;
    }


    public int getNumero() {
        return numero;
    }


    public int getSaldo() {
        return saldo;
    }

    // Implementando a interface

    @Override
    public void sacar(Double valor) {

    }

    @Override
    public void depositar(Double valor) {

    }

    @Override
    public void transferir(Double valor, Conta contaDestino) {

    }
}
