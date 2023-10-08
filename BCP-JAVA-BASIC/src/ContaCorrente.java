public class ContaCorrente {
    private String agencia;
    private String numConta;
    private Double saldo;

    // O constructor serve para que quando essa classe seja estaniciada, tenhamos acesso aos valores dos atributos atraves dos getters e setters
    public ContaCorrente( String agencia, String numConta, Double saldo){
        this.agencia = agencia;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    // Atributos Getters e Setters

    // Getters - servem para pegar os valores dos atributos
    public String getAgencia(){
        return agencia;
    }

    public String getNumConta() {
        return numConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    // Setters - servem para atribuir os valores dos atributos
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    // ENCAPSULAMENTO - Resumidamente é quando colocamos um metodo em uma classe especifica onde faz sentido, para que quem o chame nao saiba quais regras esse metodo segue, ele apenas chama e ver o resultado sem conhecimento das regras.
    public static ContaCorrente depositaContaCorrente(ContaCorrente contaCorrente, Double valor){
        if(valor <= 0){
            System.out.println("Deposito nao efetuado, valor menor ou igual a 0");
            return null;
        }

        Double saldoAtualizado = contaCorrente.getSaldo() + valor;

        System.out.println("Depósito Realizado com sucesso");

        ContaCorrente cc = new ContaCorrente(contaCorrente.getAgencia(), contaCorrente.getNumConta(), saldoAtualizado);

        return cc;
    }


}
