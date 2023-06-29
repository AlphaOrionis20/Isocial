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
        if(_vid.url_recurso == ""){
            video = new Video();
            return true;
        }
        else {
            this.video = new Video(_vid.getUrl_recurso(), _vid.getFrame_rate(), _vid.getDuracao());
            return true;
        }
    }

    public boolean fixado(){
        String resposta = sc.nextLine();
        if (resposta.equals("sim")) {
            qtde_fixados++;
            return true;
        }
        else if (resposta.equals("nao")){
            return false;
        }
        else{
            System.out.println("Erro: Resposta não aceita, comentário não será fixado.");
            resposta = "nao";
            return false;
        }
    }

    public String getUrl_video(){
        return video.url_recurso;
    }
    public LocalDateTime getData_postagem(){
        return this.data_postagem;
    }

    public  String getComentarios(){
        String retorno = "";
        for (Comentario x:Comentarios) {
            retorno += x + "\n";
        }
        return retorno;
    }

    public int getQtde_fixados(){
        return qtde_fixados;
    }

    public void setUrlVideo(String string){
        video.url_recurso = string;
    }

    @Override
    public boolean posta() {
        if (video.url_recurso != "" && video.url_recurso != "Erro: Tipo de arquivo inválido.") {
            data_postagem = LocalDateTime.now();
            return true;
        }
        else if (video.url_recurso == ""){
            System.out.println("Erro: Nenhum vídeo está associado à postagem.");
            return false;
        }
        else{
            System.out.println(getUrl_video());
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
                if(Fixado == true) {
                    Comentario comentario = new Comentario(data, Fixado, tamanho, texto);
                    Comentarios.add(0,comentario);
                }
                else{
                    Comentario comentario = new Comentario(data, Fixado, tamanho, texto);
                    Comentarios.add(comentario);
                }
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
                "Comentarios: "+ "\n" + getComentarios()
                +
                "Quantidade de comentarios fixados: " + getQtde_fixados();

    }
}