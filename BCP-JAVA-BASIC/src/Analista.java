public class Analista extends Funcionario implements AbonoSalarial {

    private String senioridade;
    private String cargo;
    private Double abono;

    public Analista(String name, Integer idade, Double salario, String senioridade, String cargo) {
        super(name, idade, salario);
        this.senioridade = senioridade;
        this.cargo = cargo;
        this.abono = calculaAbonoSalario(salario);
    }

    public static void main(String[] args) {
        Analista analista = new Analista("Alessandro", 24, 2500.00, "Pleno","Tech Lead");

        System.out.println(analista);
        System.out.println("Abono Analista " + analista.abono);
    }

    @Override
    public Double calculaAbonoSalario(Double salario) {
        Double abono = salario + salario * 0.20;
        return abono;
    }

    @Override
    public String toString() {
        return "Analista [senioridade=" + senioridade + ", cargo=" + cargo + ", abono=" + abono + "]";
    } 
    

}
