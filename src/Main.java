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
        postv.posta();

    }
}