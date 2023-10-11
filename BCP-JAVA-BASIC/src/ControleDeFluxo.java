import java.util.Scanner;

public class ControleDeFluxo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner é uma classe nativa do JAVA (java util) que serve para receber
                                             // dados simples do terminal;

        System.out.println("Qual sua idade? \n");
        int idade = Integer.parseInt(sc.nextLine());
        // System.out.println("Sua idade é " + idade);

        // IF-ELSE
        if (idade >= 18) {
            System.out.println("Você é Maior de idade");
        } else {
            System.out.println("Você é Menor de idade!");
        }

        // Switch Case
        System.out.println("Qual o dia da semana que vc estuda? \n");

        Integer diaSemana = Integer.parseInt(sc.nextLine());

        switch (diaSemana) {
            case 1:
                System.out.println("Voce estuda domingo");
                break;
            case 2:
                System.out.println("Voce estuda Segunda");
                break;
            case 3:
                System.out.println("Voce estuda Terça");
                break;
            case 4:
                System.out.println("Voce estuda Quarta");
                break;
            case 5:
                System.out.println("Voce estuda Quinta");
                break;
            case 6:
                System.out.println("Voce estuda Sexta");
                break;
            case 7:
                System.out.println("Voce estuda Sabado");
                break;
            default:
                System.out.println("Numero da semana invalido");
                break;
        }

        // For
        for (var contador = 1; contador < 5; contador++) {
            System.out.println(contador);
        }

        // while
        int valor = 0;
        while (valor < 5) {
            System.out.println("Valor ainda menor de 5 " + valor);
            valor++;
        }
    }
}
