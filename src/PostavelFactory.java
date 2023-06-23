public class PostavelFactory {


    private PostavelFactory(){

    }

    public static PostVideo getPostavelVid() {
        return  new PostVideo();
    }
    public static PostFoto getPostavelFoto() {
        return  new PostFoto();
    }

    
}