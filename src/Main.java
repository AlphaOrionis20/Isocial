
public class Main
{
    public static void main(String[] args)
    {
        Video video = new Video("YoTube.mp4",60,5);
        System.out.println(video.validaUrlRecurso(video.url_recurso));
        Video video1 = new Video("alo",60,5);
        System.out.println(video1.validaUrlRecurso(video1.url_recurso));
        Video video2 = new Video();
        System.out.println(video2.validaUrlRecurso(video2.url_recurso));
        Foto foto = new Foto();
        PostFoto postagem = new PostFoto();
        postagem.adicionaFoto();
        postagem.adicionaFoto();
        postagem.adicionaFoto();

    }
}