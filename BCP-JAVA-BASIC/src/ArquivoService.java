import java.io.File;
import java.util.List;

public class ArquivoService {
    public static void main(String[] args) {

        // Obter o diretório local raiz
        String diretorioLocal = System.getProperty("user.dir");
        // Monta diretorio destino
        diretorioLocal = diretorioLocal + File.separator + "src" + File.separator + "files" + File.separator;

        criarArquivo(diretorioLocal, "Dados.txt");
        criarArquivo(diretorioLocal, "Teste01.txt");
        criarArquivo(diretorioLocal, "Teste02.txt");
        criarArquivo(diretorioLocal, "teste03.txt");
    }

    public static void criarArquivo(String diretorioDoArquivo, String nomeDoArquivo){

        String nameFile = diretorioDoArquivo + nomeDoArquivo;
        File arquivo = new File(nameFile);
        File diretorio = new File(diretorioDoArquivo);

        try {
            Boolean arquivoCriado = arquivo.createNewFile();
            if(arquivoCriado){
                System.out.println("Arquivo Criado");
            } else {
                System.out.println("Arquivo já criado");
                buscaArquivos(diretorio);
            }
            
        } catch (Exception e) {
            System.out.println("Falha ao criar arquivo");
        }
    }

    public static void buscaArquivos(File diretorio){
        if(!diretorio.isDirectory()){
            new Exception("Dado informado nao é um diretorio");
        }

        File[] arquivosSalvos = diretorio.listFiles();

        if(arquivosSalvos != null){
            for(File arquivoCorrente : arquivosSalvos){
                System.out.println("Arquivo salvo: " + arquivoCorrente.getName());
            }
        }
    }
}
