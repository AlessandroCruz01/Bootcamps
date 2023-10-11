import java.util.Scanner;

public class ManipulacoesDeExcecoes {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
    
            System.out.println("Digite um número: ");
            int valor1 = Integer.parseInt(scanner.nextLine());
    
            System.out.println("Digite um número: ");
            int valor2 = Integer.parseInt(scanner.nextLine());
    
            System.out.println("A soma dos numeros: " + (valor1 + valor2));
        } catch (NumberFormatException e) { // caso saiba a excecao que vai ser disparada, pode-se adicionar, caso nao saiba pode-se usar a mais generica que é a exception
            System.out.println("Não foi possivel realizar o calculo.");
        }
    }
}
