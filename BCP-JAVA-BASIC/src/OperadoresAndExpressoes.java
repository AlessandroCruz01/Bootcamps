public class OperadoresAndExpressoes {
    public static void main(String[] args) {
        // Operadores Aritméticos no JAVA
        int a = 1;
        int b = 1;

        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        int divisao = a / b;
        int restoDaDivisao = a % b;

        System.out.println("SOMA " + soma);
        System.out.println("SUB " + subtracao);
        System.out.println("MUL " + multiplicacao);
        System.out.println("DIV " + divisao);
        System.out.println("RES DIV " + restoDaDivisao);

        //Operadores de atribuição
        a += 5; // a recebe a + 5
        a -= 5; // a recebe a - 5
        a *= 5; // a recebe a * 5
        a /= 5; // a recebe a / 5
        a %= 5; // a recebe o resto da divisao de a por 5

        //Operadores de comparação
        System.out.println( a == b); // == IGUAL
        System.out.println( a != b); // != DIFERENTE 
        System.out.println( a > b); // != MAIOR QUE 
        System.out.println( a < b); // != MENOR QUE 
        System.out.println( a >= b); // != MAIOR OU IGUAL A 
        System.out.println( a <= b); // != MENOR OU IGUAL A 

        //Operadores Logicos
        Boolean verdadeiro = true;
        Boolean falso = false;

        Boolean e = verdadeiro && falso; // "e" -> Se um dos lados for falso  = FALSO
        Boolean ou = verdadeiro || falso; // "ou" -> Se um for verdadeiro = VERDADE
        Boolean nao = !verdadeiro; // "nao" -> mostra a negacao = Se for verdade retorna falso

        System.out.println(e); 
        System.out.println(ou); 
        System.out.println(nao); 

        //Operadores de incremento e decremento
        System.out.println(a++); // a = a + 1 
        System.out.println(a--); // a = a - 1 

        //Operador Ternario
            //If-Else de forma resumida
        
        int x = 2;
        int y = 5;

        //if padrao
        if(x<y){
            System.out.println("X menor que Y");
        } else {
            System.out.println("X maior que Y");
        }

        //com operador ternario
        System.out.println(x > y ? "X " + x : "Y " +y);
    }   
}
