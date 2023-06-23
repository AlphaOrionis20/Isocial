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
        System.out.println(postavel2.posta());
        PostVideo a = null;
        a.adicionaVideo(video1);


        Postavel postavel3 = PostavelFactory.getPostavel(false);

        System.out.println(postavel3);*/
        Video video1 = new Video("aaaaaaaaaa.mp4", 60, 5);
        PostVideo postv = new PostVideo();
        postv.adicionaVideo(video1);
        //postv.posta();
        //System.out.println(postv);
        Foto foto1 = new Foto("alo.png","1440");//Teste png.
        Foto foto2 = new Foto("alo2.bpm","1430");//Teste bpm.
        Foto foto3 = new Foto("alo3.jpg","1420");//Teste jpg.
        Foto foto4 = new Foto("alo4.png","1420");
        Foto foto5 = new Foto("alo5.png","1420");
        Foto foto6 = new Foto("alo6.txt","1420");
        Foto foto7 = new Foto("alo7.png","1420");
        Foto foto8 = new Foto("alo8.png","1420");
        Foto foto9 = new Foto("alo9.png","1420");
        Foto foto10 = new Foto("alo10.png","1420");
        Foto foto11 = new Foto("alo11.png","1420");
        PostFoto postf = new PostFoto();
        //Teste com mais de 10 fotos:
        postf.adicionaFoto(foto1);
        postf.adicionaFoto(foto2);
        postf.adicionaFoto(foto3);
        postf.adicionaFoto(foto4);
        postf.adicionaFoto(foto5);
        postf.adicionaFoto(foto6);
        postf.adicionaFoto(foto7);
        postf.adicionaFoto(foto8);
        postf.adicionaFoto(foto9);
        postf.adicionaFoto(foto10);
        //postf.adicionaFoto(foto11);
        postf.posta();
        System.out.println(postf);

        //Teste foto inválida:
        Foto foto = new Foto();//Teste vazio
        PostFoto postfi = new PostFoto();
        postfi.adicionaFoto(foto);
        //postfi.posta();
        //System.out.println(postfi);


    }
}