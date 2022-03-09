package dio.bootcamp.desafio;

public class Main {
    public static void main(String[] args) {

        Cliente joao = new Cliente();


        Conta cc = new ContaCorrente(joao);
        Conta poupanca = new ContaPoupanca(joao);

        joao.setNome("João L. Oliveira");
        joao.setCpf("123.456.789-12");
        joao.setNumeroTelefone("(12)12345-1234");
        joao.setDataNascimento("20/05/1998");


        cc.depositar(700.00);


       cc.transferir(387.00, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}
