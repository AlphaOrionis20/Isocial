// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main
{
    public static void main(String[] args)
    {
        Video video1 = new Video("eunaoseitantofazalgumacoisa.jpg.mp4.mov", 30, 120);
        System.out.println(video1.validaUrlRecurso(video1.getUrl_recurso()));

        Foto foto1 = new Foto("eunaoseitantofazalgumacoisa.jpg.png", "seila");
        System.out.println(foto1.validaUrlRecurso(foto1.getUrl_recurso()));
    }
}