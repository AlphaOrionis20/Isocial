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
    public boolean fixado(){
        String resposta = sc.nextLine();
        if (resposta == "sim") {
            qtde_fixados++;
            return true;
        }
        else {
            return false;
        }
    }
    public String getUrl_video(){
        return this.video.url_recurso;
    }
    public LocalDateTime getData_postagem(){
        return this.data_postagem;
    }
    public  String getComentarios(){
        for (Comentario x:Comentarios) {
            System.out.println(x);
            System.out.println("");
        }
        return "";
    }
    public int getQtde_fixados(){
        return qtde_fixados;
    }
    @Override
    public boolean posta() {
        if (video != null) {
            data_postagem = LocalDateTime.now();
            comenta();
            toString();
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
        String sNum_comentarios = sc.nextLine();
        int num_comentarios = Integer.valueOf(sNum_comentarios);

        for(int i = 0; i< num_comentarios; i++) {
            LocalDateTime data = LocalDateTime.now();
            System.out.println("Deseja fixar comentario (sim/nao)? ");
            boolean Fixado = fixado();
            System.out.print("Insira o comentário: ");
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
                "Nome do video: " + getUrl_video() +
                "\n"
                +
                "Data da publicação: " + getData_postagem() +
                "\n"
                +
                "Comentarios: " + getComentarios() +
                "\n"
                +
                "Quantidade de comentarios fixados" + getQtde_fixados();

    }
}