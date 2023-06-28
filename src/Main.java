import java.util.ArrayList;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        //Teste criação de postagem com texto para vídeo:
        try{
            PostVideo postTexto1 = PostavelFactory.getPostavelVid("POSTTEXTO");
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        //Teste criação de postagem com texto para foto:
        try{
            PostFoto postTexto2 = PostavelFactory.getPostavelFoto("POSTTEXTO");
        }
        catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.out.println("");
        }

        Foto foto1 = new Foto("alo.png","1440");//Teste de png.
        Foto foto2 = new Foto("alo2.bpm","1430");//Teste de bpm.
        Foto foto3 = new Foto("alo3.jpg","1420");//Teste de jpg.
        Foto foto4 = new Foto("alo4.png","1420");
        Foto foto5 = new Foto("alo5.png","1420");
        Foto foto6 = new Foto("alo6.txt","1420");//Teste com tipo de arquivo invalido.
        Foto foto7 = new Foto("alo7.png","1420");
        Foto foto8 = new Foto("alo8.png","1420");
        Foto foto9 = new Foto("alo9.png","1420");
        Foto foto10 = new Foto("alo10.png","1420");
        Foto foto11 = new Foto("alo11.png","1420");

        //Teste para 5 fotos postadas:
        /*PostFoto postf5 = PostavelFactory.getPostavelFoto("POSTFOTO");
        postf5.adicionaFoto(foto1);
        postf5.adicionaFoto(foto2);
        postf5.adicionaFoto(foto3);
        postf5.adicionaFoto(foto4);
        postf5.adicionaFoto(foto5);
        postf5.posta();
        System.out.println(postf5 + "\n");*/

        //Teste remoção foto - Exemplo: remoção da 2a foto:
        /*PostFoto postf4 = PostavelFactory.getPostavelFoto("POSTFOTO");
        postf4.adicionaFoto(foto1);
        postf4.adicionaFoto(foto2);
        postf4.adicionaFoto(foto3);
        postf4.adicionaFoto(foto4);
        postf4.posta();
        System.out.println(postf4 + "\n");
        postf4.removeFoto(foto3);
        postf4.posta();
        System.out.println(postf4 + "\n");*/     

        //Teste para mais de 10 fotos postadas (sendo a foto6 com arquivo inválido):
        /*PostFoto postf11 = PostavelFactory.getPostavelFoto("POSTFOTO");
        postf11.adicionaFoto(foto1);
        postf11.adicionaFoto(foto2);
        postf11.adicionaFoto(foto3);
        postf11.adicionaFoto(foto4);
        postf11.adicionaFoto(foto5);
        postf11.adicionaFoto(foto6);
        postf11.adicionaFoto(foto7);
        postf11.adicionaFoto(foto8);
        postf11.adicionaFoto(foto9);
        postf11.adicionaFoto(foto10);
        //postf11.adicionaFoto(foto11);
        postf11.posta();
        System.out.println(postf11 + "\n");*/

        //Teste sem foto:
        /*Foto fotovazio = new Foto();//Teste vazio
        PostFoto postfvazio = PostavelFactory.getPostavelFoto("POSTFOTO");
        postfvazio.adicionaFoto(fotovazio);
        postfvazio.posta();
        System.out.println("");*/

        //Teste com comentario para foto:
        /*PostFoto postfcomentario = PostavelFactory.getPostavelFoto("POSTFOTO");
        postfcomentario.adicionaFoto(foto1);
        postfcomentario.comenta();
        postfcomentario.posta();
        System.out.println(postfcomentario + "\n");*/

        //Teste de video:
        /*Video video1 = new Video("videoteste.mp4", 60, 5);
        PostVideo postv = PostavelFactory.getPostavelVid("POSTVIDEO");
        postv.adicionaVideo(video1);
        postv.posta();
        System.out.println(postv + "\n");*/

        //Teste de video vazio:
        /*Video videovazio = new Video();
        PostVideo postvazio = PostavelFactory.getPostavelVid("POSTVIDEO");
        postvazio.adicionaVideo(videovazio);
        postvazio.posta();
        System.out.println("");*/

        //Teste de video invalido:
        /*Video videoinvalido = new Video("alo",60,60);
        PostVideo postinvalido = PostavelFactory.getPostavelVid("POSTVIDEO");
        postinvalido.adicionaVideo(videoinvalido);
        postinvalido.posta();
        System.out.println("");*/

        //Teste de video com comentario:
        /*Video videocomentario = new Video("videoteste.mp4", 60, 5);
        PostVideo postvideocomentario = PostavelFactory.getPostavelVid("POSTVIDEO");
        postvideocomentario.adicionaVideo(videocomentario);
        postvideocomentario.comenta();
        postvideocomentario.posta();
        System.out.println(postvideocomentario + "\n");*/
    }
}