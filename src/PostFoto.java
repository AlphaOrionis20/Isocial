import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class PostFoto implements Postavel
{
    private int qtd_de_fotos;
    private LocalDateTime data_postagem;
    private ArrayList<Foto> Fotos = new ArrayList();
    private String localizacao;

    private ArrayList<Comentario> Comentarios = new ArrayList();

    Scanner sc = new Scanner(System.in);
    public PostFoto(){
        qtd_de_fotos = 0;
        data_postagem = null;
    }
    public boolean adicionaFoto(Foto foto)
    {
        if (foto != null){
            Fotos.add(foto);
            qtd_de_fotos++;
            return true;
        }
        else{
            return false;
        }
    }

    public boolean removeFoto(Foto foto){
        if(Fotos.contains(foto)){
            Fotos.remove(foto);
            qtd_de_fotos--;
            return true;
        }
        else{
            return false;
        }
    }
    @Override
    public boolean posta() {
        if (qtd_de_fotos>=1 && qtd_de_fotos<=10) {
            data_postagem = LocalDateTime.now();
            return true;
        }
        else {
            System.out.println("Erro: É aceito apenas 1 foto e no máximo 10. Verifique seus dados.");
            return false;
        }
    }

    @Override
    public boolean comenta() {
        LocalDateTime data = LocalDateTime.now();
        System.out.print("Deseja fixar comentario (sim/nao)? ");
        String resposta = sc.nextLine();
        boolean fixado;
        if (resposta == "sim"){
            fixado = true;
        }
        else {
            fixado = false;
        }
        System.out.println("Insira comentário: ");
        String texto = sc.nextLine();
        int tamanho = texto.length();

        Comentario comentario = new Comentario(data, fixado, tamanho, texto);
        Comentarios.add(comentario);

        return true;
    }
}
