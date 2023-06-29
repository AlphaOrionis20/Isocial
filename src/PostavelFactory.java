public class PostavelFactory {


    private PostavelFactory(){

    }
    public static Postavel getPostavel(String postavel) {
        if(postavel == "POSTFOTO") {
            return new PostFoto();
        }
        else if(postavel == "POSTVIDEO"){
            return new PostVideo();
        }
        else{
            throw new IllegalArgumentException("Erro: Tipo de postagem inválida para vídeo.");
        }
    }
}

