import java.time.LocalDateTime;
import java.util.ArrayList;

public class PostVideo implements Postavel {

    private Video video;
    private LocalDateTime data_postagem;


    public PostVideo(){

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

    }
}
