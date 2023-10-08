public class DadosPrimitivos_VARIAVEL {
    // No java a variavel é composta por TIPO NOME = VALOR
    
    public static void main(String[] args) {        
        String variavelString = "String";

        // O valor nao é obrigatorio no momento da declaração da variavel;
        String variavelSemValor; //String

        // Tipos primitivos (OBS: Sempre começam com letra minuscula)
        
        // Inteiros

            // OBS:
            // byte: 8 bits, intervalo de -128 a 127.
            // short: 16 bits, intervalo de -32.768 a 32.767.
            // int: 32 bits, intervalo de -2^31 a 2^31 - 1.
            // long: 64 bits, intervalo de -2^63 a 2^63 - 1.x'x'

            byte numeroByte = 127;
            short numeroShort = 32767;
            int numeroInteiro = 2147483647;
            long numeroLongo = 9223372036854775807L;

        // Ponto Flutuante - Numeros reais

            // OBS:
            // float: 32 bits, IEEE 754 de precisão simples.
            // double: 64 bits, IEEE 754 de dupla precisão.

            float numeroFlutuante = 3.14f; // o "f" é orbrigatorio para que o compilador entenda que se trata de um float e nao de um double
            double numeroDuplo = 2.71828;

        // Caractere - Texto

            //OBS:
            //char: 16 bits, representa um único caractere Unicode.

            char caractere = 'A';

        // Boolean

            boolean ehVerdadeiro = true;        

        
    }
}
