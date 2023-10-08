// No encapsulamento tiramos todas as regras e logica da classe que chama e deixamos apenas na classe responsavel.

public class ContaCorrenteMain {

    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente("123", "1234", 10.00);

        ContaCorrente updatedConta = ContaCorrente.depositaContaCorrente(cc, 1000.00);
        System.out.println(updatedConta);
        System.out.println(updatedConta.getSaldo());
    }
}

