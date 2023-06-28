public class PostavelFactory {


    private PostavelFactory(){

    }

    public static PostFoto getPostavelFoto(String postavel) {
        if(postavel == "POSTFOTO") {
            return new PostFoto();
        }
        else{
            throw new IllegalArgumentException("Erro: Tipo de postagem inválida para foto.");
        }
    }
    public static PostVideo getPostavelVid(String postavel) {
        if(postavel == "POSTVIDEO") {
            return new PostVideo();
        }
        else{
            throw new IllegalArgumentException("Erro: Tipo de postagem inválida para vídeo.");
        }
    }
}