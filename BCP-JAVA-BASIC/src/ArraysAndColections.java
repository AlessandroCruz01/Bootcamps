import java.util.ArrayList;

public class ArraysAndColections {
    public static void main(String[] args) {
        // Array puro
        int[] numeros = new int[5];
        numeros[3] = 14;

        System.out.println(numeros[3]);

        // Array utilizando collection
        ArrayList<String> nomes = new ArrayList<String>();
        nomes.add("Alessandro");
        nomes.add("Fernando");
        nomes.add("Sarah Levenstein");

        System.out.println(nomes);

        nomes.remove("Fernando");
        System.out.println(nomes);
        System.out.println(nomes.size());




    }

}
