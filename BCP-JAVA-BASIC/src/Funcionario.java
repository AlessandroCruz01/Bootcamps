// ABSTRAÇÃO - Quando trazemos algo abstrato do mundo real para usar em codigo. 
// EXEMPLO - Quando temo o objeto VENDEDOR, é algo abstrato pois nao temos a informação sobre o que ele vende ou quando ele vende. Mas temos atributos genericos que sao comuns a todos os vendedores. Ou seja, todos os vendedores recebem salario, todos os vendedores tem uma idade ou todos os vendedores tem um nome

public class Funcionario {

    private String name;
    private Integer idade;
    private Double salario;
    
    // Constructor
    public Funcionario(String name, Integer idade, Double salario){
        this.idade = idade;
        this.name = name;
        this.salario = salario;
    }

    public static Double calcularDecimoTerceiroSalario(Double salario){
        return salario + salario * 0.10;
    }

    public static void main(String[] args){
        Funcionario funcionarioInstance = new Funcionario("Alessandro", 24, 200.00);

        System.out.println(
            "Funcionario nome " + funcionarioInstance.name + "Funcionario idade " + funcionarioInstance.idade
        );  

        Double decimoTerceiro = calcularDecimoTerceiroSalario(funcionarioInstance.salario);

        System.out.println(
            "Decimo Terceiro " + decimoTerceiro
        );
    }
}
