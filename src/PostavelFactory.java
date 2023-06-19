public class PostavelFactory {


    private PostavelFactory(){

    }

    public static Postavel getPostavel(boolean imagem) {
        return imagem ? new PostFoto(): new PostVideo();
    }
    
}