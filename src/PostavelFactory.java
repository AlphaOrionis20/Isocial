public class PostavelFactory {

    public static Postavel getPostavel(String postagem) {
        if (postagem.equals("POSTVIDEO")) {
            return new PostVideo();

        } else if (postagem.equals("POSTFOTO")) {
            return new PostFoto();

        } else {
            throw new IllegalArgumentException("Tipo de postagem inválido: " + postagem);
        }
    }
    
}