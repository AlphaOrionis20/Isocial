import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class PostVideo implements Postavel {

    private Video video;
    private LocalDateTime data_postagem;

    private ArrayList<Comentario> Comentarios = new ArrayList();

    private int qtde_fixados = 0;

    Scanner sc = new Scanner(System.in);

    public PostVideo(){
        video = null;
        data_postagem = null;
    }

    public boolean adicionaVideo(Video _vid){
        if(_vid.url_recurso != ""){
        this.video = new Video(_vid.url_recurso, _vid.getFrame_rate(), _vid.getDuracao());
        return true;
        }
        else{
            System.out.println("Erro: Tipo de arquivo inválido.");
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
        boolean adiciona = true;
        System.out.println("Para sair da página de comentário, aperte Enter duas vez após realizar o último comentário.");
        while(adiciona == true) {
            LocalDateTime data = LocalDateTime.now();
            System.out.print("Deseja fixar comentario (sim/nao)? ");
            String resposta = sc.nextLine();
            boolean fixado;
            if (resposta == "sim") {
                fixado = true;
                qtde_fixados++;
            } else {
                fixado = false;
            }
            System.out.println("Insira comentário: ");
            String texto = sc.nextLine();
            int tamanho = texto.length();
            if(tamanho>=1) {
                Comentario comentario = new Comentario(data, fixado, tamanho, texto);
                Comentarios.add(comentario);
            }
            else{
                System.out.println("");
                adiciona = false;
            }
        }

        return true;
    }

    @Override
    public String toString() {
        return "PostVideo{" +
                "video=" + video +
                ", data_postagem=" + data_postagem +
                ", Comentarios=" + Comentarios +
                ", qtde_fixados=" + qtde_fixados +
                '}';
    }
}