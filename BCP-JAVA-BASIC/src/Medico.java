public class Medico extends Funcionario {
    // Herança basicamente é quando herdamos todos os atributos e funcoes de outra classe "pai";

    private String especialidade;
    private String crm;

    // Quando trabalhamos com herança, é necesario criar um constructor contendo um super() onde traz todos os atributos da classe pai;
    public Medico (String nome, Integer idade, Double Salario, String especialidade, String crm){
        super(nome, idade, Salario);
        this.especialidade = especialidade;
        this.crm = crm;
    }

    @Override
    public String toString() {
        return "Medico [\n" +
        "    name=" + name + ",\n" +
        "    idade=" + idade + ",\n" +
        "    salario=" + salario + ",\n" +
        "    especialidade=" + especialidade + ",\n" +
        "    crm=" + crm + "\n" +
        "]";    
    }


    public static void main(String[] args) {
        Medico medico = new Medico(
            "Alessandro",
            24,
            1500.00,
            "Pediatra",
            "1234"
        );

        System.out.println("Medico " + medico);
        Double decimoTerceiroMedico = medico.calcularDecimoTerceiroSalario(1000.00);
        System.out.println("Medico decimo terceiro salario " + decimoTerceiroMedico);

    }
}
