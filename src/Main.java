import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Deseja postar uma foto ou vídeo(foto/video)?");
        String escolha = sc.nextLine();
        if (escolha == "foto"){
            System.out.println("Quantas fotos deseja postar (de 1 a 10 fotos)?");
        }
        else if(escolha == "video"){

        }
        else{
            System.out.println("Opção selecionada não disponível para postagem.");
        }
    }
}