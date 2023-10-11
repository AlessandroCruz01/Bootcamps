import java.util.ArrayList;
import java.util.List;
// Classe

public class Biblioteca {
    // A classe nao tem atributos, ele executa ações;
    public static void main(String[] args) {
        Livro livro1 = new Livro("Teste01", "Teste01", 2023);
        Livro livro2 = new Livro("Teste02", "Teste02", 2022);
        Livro livro3 = new Livro("Teste03", "Teste03", 2021);

        List<Livro> livros = new ArrayList<Livro>();
        livros.add(livro1);
        livros.add(livro2);
        livros.add(livro3);

        var livrosPorAno = livrosPorAno(livros, 2023);
        System.out.println("Livros por ano: " + livrosPorAno);
    }

    public static List<Livro> livrosPorAno(List<Livro> listLivros, int ano){
        // Método - Uma ação que retorna algo;
        List<Livro> newListLivro = new ArrayList<Livro>();

        for(Livro currentLivro : listLivros){
            if(currentLivro.getAnoLancamento() == ano){
                newListLivro.add(currentLivro);
            }
        }

        return newListLivro;
    }
}
