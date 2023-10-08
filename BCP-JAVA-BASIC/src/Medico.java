public class Medico extends Funcionario implements AbonoSalarial {//Neste momento após implementar uma interface, devemos obrigatoriamente implementar seus metodos.
    // Herança basicamente é quando herdamos todos os atributos e funcoes de outra classe "pai";

    private String especialidade;
    private String crm;
    private Double abono;

    // Quando trabalhamos com herança, é necesario criar um constructor contendo um super() onde traz todos os atributos da classe pai;
    public Medico (String nome, Integer idade, Double Salario, String especialidade, String crm){
        super(nome, idade, Salario);
        this.especialidade = especialidade;
        this.crm = crm;
        this.abono = calculaAbonoSalario(Salario);
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

    @Override
    public Double calculaAbonoSalario(Double salario) {
        Double abono = salario + salario * 0.50;
        return abono;
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
        System.out.println("O abono deste medico será " + medico.abono);

    }
}
