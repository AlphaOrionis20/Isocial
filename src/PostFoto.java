import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class PostFoto implements Postavel
{
    private int qtd_de_fotos;
    private LocalDateTime data_postagem;
    private ArrayList<Foto> Fotos = new ArrayList();
    private int qtde_fixados = 0;
    private String localizacao;

    private ArrayList<Comentario> Comentarios = new ArrayList();

    Scanner sc = new Scanner(System.in);
    public PostFoto(){
        qtd_de_fotos = 0;
        data_postagem = null;
    }
    public boolean adicionaFoto(Foto foto)
    {
        if (foto != null){
            Fotos.add(foto);
            qtd_de_fotos++;
            return true;
        }
        else{
            return false;
        }
    }
    public boolean fixado(){
        String resposta = sc.nextLine();
        if (resposta == "sim") {
            qtde_fixados++;
            return true;
        }
        else {
            return false;
        }
    }

    public boolean removeFoto(Foto foto){
        if(Fotos.contains(foto)){
            Fotos.remove(foto);
            qtd_de_fotos--;
            return true;
        }
        else{
            return false;
        }
    }

    public void setLocalizacao(String local){
        this.localizacao = local;
    }
    public String getLocalizacao(){
        return localizacao;
    }
    public String getUrl_foto(){
        for (Foto x:Fotos) {
            System.out.println(x);
            System.out.println("");
        }
        return "";
    }
    public LocalDateTime getData_postagem(){
        return this.data_postagem;
    }
    public  String getComentarios(){
        for (Comentario x:Comentarios) {
            System.out.println(x);
            System.out.println("");
        }
        return "";
    }
    public int getQtde_fixados(){
        return qtde_fixados;
    }
    @Override
    public boolean posta() {
        if (qtd_de_fotos>=1 && qtd_de_fotos<=10) {
            data_postagem = LocalDateTime.now();
            System.out.print("Digite a localização das fotos:");
            String endereço = sc.nextLine();
            setLocalizacao(endereço);
            comenta();
            toString();
        return true;
        }
        else {
            System.out.println("Erro: É aceito apenas 1 foto e no máximo 10. Verifique seus dados.");
            return false;
        }
    }

    @Override
    public boolean comenta() {
        System.out.println("Quantos comentários deseja fazer? ");
        String sNum_comentarios = sc.nextLine();
        int num_comentarios = Integer.valueOf(sNum_comentarios);

        for(int i = 0; i< num_comentarios; i++) {
            LocalDateTime data = LocalDateTime.now();
            System.out.println("Deseja fixar comentario (sim/nao)? ");
            boolean Fixado = fixado();
            System.out.print("Insira o comentário: ");
            String texto = sc.nextLine();
            int tamanho = texto.length();
            if(tamanho != 0) {
                Comentario comentario = new Comentario(data, Fixado, tamanho, texto);
                Comentarios.add(comentario);
            }
            else{
                System.out.println("Erro: Comentários vazios não são adicionados.");
            }

        }
        return true;
    }

    @Override
    public String toString() {
        return "Postagem de foto" +
                "\n"
                +
                "Nome das fotos: " + getUrl_foto() +
                "\n"
                +
                "Data da publicação: " + getData_postagem() +
                "\n"
                +
                "Comentarios: " + getComentarios() +
                "\n"
                +
                "Localização: " + getLocalizacao();
    }
}
