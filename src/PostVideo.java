import java.time.LocalDateTime;
import java.util.ArrayList;

public class PostVideo implements Postavel {

    private Video video;
    private LocalDateTime data_postagem;
    private ArrayList<Video> videos = new ArrayList();

    public PostVideo(){

    }

    public boolean adicionaVideo(){
        if(videos==null){
           return false;
        }
        return true;
    }
    @Override
    public boolean posta() {
        return false;
    }

    @Override
    public boolean comenta() {
        return false;
    }
}
