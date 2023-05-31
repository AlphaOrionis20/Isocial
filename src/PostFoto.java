import java.time.LocalDateTime;
import java.util.ArrayList;

public class PostFoto implements Postavel
{
    private int qtd_de_fotos;
    private LocalDateTime data_postagem;
    private ArrayList<Foto> Fotos = new ArrayList();
    private String localizacao;

    public PostFoto(){}
    public boolean adicionaFoto()
    {
        return true;
    }
    @Override
    public boolean posta() {
        return false;
    }

    @Override
    public boolean comenta() {
        return false;
    }
}
