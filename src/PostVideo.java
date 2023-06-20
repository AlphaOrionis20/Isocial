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
    public boolean fixado(String resposta){
        if (resposta == "sim") {
            qtde_fixados++;
            return true;
        }
        else {
            return false;
        }
    }
    @Override
    public boolean posta() {
        if (video != null) {
            data_postagem = LocalDateTime.now();
            comenta();
            this.toString();
            return true;
        }
        else {
            System.out.println("Erro: Nenhum vídeo está associado à postagem.");
            return false;
        }
    }

    @Override
    public boolean comenta() {
        System.out.println("Quantos comentários deseja fazer? ");
        int num_comentarios = sc.nextInt();
        for(int i = 0; i< num_comentarios; i++) {
            LocalDateTime data = LocalDateTime.now();
            System.out.print("Deseja fixar comentario (sim/nao)? ");
            System.out.println("chega aqui nunca");
            String resposta = sc.nextLine();
            System.out.println("chegou");
            boolean Fixado = fixado(resposta);
            System.out.println("a");
            System.out.print("Insira comentário: ");
            System.out.println("b");
            String texto = sc.nextLine();
            int tamanho = texto.length();
            if(tamanho != 0) {
                Comentario comentario = new Comentario(data, Fixado, tamanho, texto);
                Comentarios.add(comentario);
            }
            else{
                System.out.println("Comentários vazios não são adicionados.");
            }

        }
        return true;

    }

    @Override
    public String toString() {
        return "Postagem de Vídeo" +
                "\n"
                +
                "Nome do video: " + video.url_recurso +
                "\n"
                +
                "Data da publicação: " + data_postagem +
                "\n"
                +
                "Comentarios: " + Comentarios +
                "\n"
                +
                "Quantidade de comentarios fixados" + qtde_fixados;
    }
}