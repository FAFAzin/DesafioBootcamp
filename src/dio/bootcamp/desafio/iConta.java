package dio.bootcamp.desafio;

// Interface para realizar as ações de saque, deposito e transferência.
public interface iConta {

    void sacar(Double valor);

    void depositar(Double valor);

    void transferir(Double valor, Conta contaDestino);

    void imprimirExtrato();
}
