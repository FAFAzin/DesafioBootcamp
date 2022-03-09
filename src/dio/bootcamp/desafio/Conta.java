package dio.bootcamp.desafio;

public abstract class Conta implements iConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    // atributos
    protected int agencia;
    protected int numero;
    protected Double saldo;
    protected Cliente cliente;


    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.saldo = 0.00;
        this.cliente = cliente;
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
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Cpf: %s", this.cliente.getCpf()));
        System.out.println(String.format("Data de Nascimento: %s", this.cliente.getDataNascimento()));
        System.out.println(String.format("Número de Telefone: %s", this.cliente.getNumeroTelefone()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}
