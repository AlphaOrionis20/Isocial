import java.time.LocalDateTime;

public class Comentario {
    private LocalDateTime data;
    private boolean fixado;
    private int tamanho;
    private String texto;

    public Comentario(LocalDateTime Data, boolean Fixado, int Tamanho, String Texto){
        this.data = Data;
        this.fixado = Fixado;
        this.tamanho = Tamanho;
        this.texto = Texto;
    }
}
