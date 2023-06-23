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
        if (foto.url_recurso != ""){
            Fotos.add(foto);
            qtd_de_fotos++;
            return true;
        }
        else{
            setUrlFotoErro(foto);
            Fotos.add(foto);
            return false;
        }
    }
    public boolean fixado(){
        String resposta = sc.nextLine();
        if (resposta.equals("sim")) {
            qtde_fixados++;
            return true;
        }
        else if (resposta.equals("nao")){
            System.out.println("false");
            return false;
        }
        else{
            System.out.println("Erro: Resposta não aceita, comentário não será fixado.");
            resposta = "nao";
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
        String retorno = "";
        for (Foto x:Fotos) {
            retorno += x + "\n";
        }
        return retorno;
    }
    public LocalDateTime getData_postagem(){
        return this.data_postagem;
    }

    public  String getComentarios(){
        String retorno = "";
        for (Comentario x:Comentarios) {
            retorno += x + "\n";
        }
        return retorno;
    }

    public int getQtde_fixados(){
        return qtde_fixados;
    }

    public void setUrlFotoErro(Foto foto){
        foto.url_recurso = "Erro: Tipo de arquivo inválido.";
    }

    @Override
    public boolean posta() {
        if (qtd_de_fotos>=1 && qtd_de_fotos<=10) {
            data_postagem = LocalDateTime.now();
            System.out.print("Digite a localização das fotos: ");
            String endereço = sc.nextLine();
            setLocalizacao(endereço);
        return true;
        }
        else {
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
                if(Fixado == true) {
                    Comentario comentario = new Comentario(data, Fixado, tamanho, texto);
                    Comentarios.add(0,comentario);
                }
                else{
                    Comentario comentario = new Comentario(data, Fixado, tamanho, texto);
                    Comentarios.add(comentario);
                }
            }
            else{
                System.out.println("Erro: Comentários vazios não são adicionados.");
            }

        }
        return true;
    }

    @Override
    public String toString() {
        if (qtd_de_fotos > 0 && qtd_de_fotos <= 10) {
            return  "Postagem de foto" +
                    "\n"
                    +
                    "Nome das fotos: " + getUrl_foto()
                    +
                    "Data da publicação: " + getData_postagem() +
                    "\n"
                    +
                    "Comentarios: " + "\n" + getComentarios()
                    +
                    "Localização: " + getLocalizacao() +
                    "\n"
                    +
                    "Quantidade de comentarios fixados: " + getQtde_fixados();

        }
        else {
            return "Erro: Foto não encontrada ou quantidade de fotos ultrapassou o limite de 10 unidades";
        }
    }
}
