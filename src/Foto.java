public class Foto extends Recurso{
    private String resolucao;

    public Foto(){
        url_recurso = null;

    }
    public Foto(String url_recurso, String resolucao) {
        super(url_recurso);
        if(!this.validaUrlRecurso(url_recurso)){
            setUrl_foto("");
        }
        this.resolucao = resolucao;
    }

    @Override
    public boolean validaUrlRecurso(String url) {
        return url.toLowerCase().matches(".+\\.(jpg|png|bpm)$");
    }

    public String getResolucao() {
        return resolucao;
    }

    public void setUrl_foto(String novo_Url){
        this.url_recurso = novo_Url;
    }

    @Override
    public String toString() {
        return url_recurso;
    }
}
