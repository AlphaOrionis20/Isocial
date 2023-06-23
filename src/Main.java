import java.util.ArrayList;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        /*System.out.println("Deseja postar uma foto ou vídeo(foto/video)?");
        String escolha = sc.nextLine();
        if (escolha == "foto"){
            System.out.println("Quantas fotos deseja postar (de 1 a 10 fotos)?");
        }
        else if(escolha == "video"){

        }
        else{
            System.out.println("Opção selecionada não disponível para postagem.");
        }*/
        /*System.out.println("Deseja postar uma foto ou video (Postfoto para foto e Postvideo para video)? ");
        String postagem = sc.next();
        Postavel postavel = PostavelFactory.getPostavel(true);

        System.out.println(postavel);

        Postavel postavel2 = PostavelFactory.getPostavel("POSTVIDEO");
        Video video1 = new Video("aaaaaaaaaa.mp4", 60, 5);
        postavel2.;
        System.out.println(postavel2.posta());n
        PostVideo a = null;
        a.adicionaVideo(video1);


        Postavel postavel3 = PostavelFactory.getPostavel(false);

        System.out.println(postavel3);*/





        Foto foto1 = new Foto("alo.png","1440");//Teste de png.
        Foto foto2 = new Foto("alo2.bpm","1430");//Teste de bpm.
        Foto foto3 = new Foto("alo3.jpg","1420");//Teste de jpg.
        Foto foto4 = new Foto("alo4.png","1420");
        Foto foto5 = new Foto("alo5.png","1420");
        Foto foto6 = new Foto("alo6.txt","1420");//Teste de texto para foto juntamente com tipo de arquivo invalido.
        Foto foto7 = new Foto("alo7.png","1420");
        Foto foto8 = new Foto("alo8.png","1420");
        Foto foto9 = new Foto("alo9.png","1420");
        Foto foto10 = new Foto("alo10.png","1420");
        Foto foto11 = new Foto("alo11.png","1420");

        //Teste para 5 fotos postadas:
        /*PostFoto postf5 = PostavelFactory.getPostavelFoto();
        postf5.adicionaFoto(foto1);
        postf5.adicionaFoto(foto2);
        postf5.adicionaFoto(foto3);
        postf5.adicionaFoto(foto4);
        postf5.adicionaFoto(foto5);
        postf5.posta();
        System.out.println(postf5);
        System.out.println("");

        //Teste para mais de 10 fotos postadas:
        PostFoto postf11 = PostavelFactory.getPostavelFoto();
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
        System.out.println(postf11);
        System.out.println("");

        //Teste sem foto:
        Foto foto = new Foto();//Teste vazio
        PostFoto postfi = PostavelFactory.getPostavelFoto();
        postfi.adicionaFoto(foto);
        //postfi.posta();
        //System.out.println(postfi);
        //System.out.println("");

        //Teste com comentario para foto:
        PostFoto postfcomentario = PostavelFactory.getPostavelFoto();
        postfcomentario.adicionaFoto(foto1);
        postfcomentario.comenta();
        postfcomentario.posta();
        System.out.println(postfcomentario);
        System.out.println("");*/

        //Teste de video:
        /*Video video1 = new Video("videoteste.mp4", 60, 5);
        PostVideo postv = PostavelFactory.getPostavelVid();
        postv.adicionaVideo(video1);
        postv.posta();
        System.out.println(postv);
        System.out.println("");*/

        //Teste de video vazio:
        Video videovazio = new Video();
        PostVideo postvazio = PostavelFactory.getPostavelVid();
        postvazio.adicionaVideo(videovazio);
        postvazio.posta();
        System.out.println(postvazio);
        System.out.println("");

    }
}