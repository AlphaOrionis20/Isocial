import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class PostVideo implements Postavel {

    private Video video;
    private LocalDateTime data_postagem;

    private ArrayList<Comentario> Comentarios = new ArrayList();

    Scanner sc = new Scanner(System.in);

    public PostVideo(){
        video = null;
        data_postagem = null;
    }

    public boolean adicionaVideo(Video _vid){
        if(_vid.ID <= video.ID){
            return true;
        }
        else{
            return false;
        }
    }
    @Override
    public boolean posta() {
        if (video != null) {
            data_postagem = LocalDateTime.now();
            return true;
        }
        else {
            System.out.println("Erro: Nenhum vídeo está associado à postagem.");
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
