public class Foto extends Recurso{
    private String resolucao;
    public Foto(String url_recurso, String resolucao) {
        super(url_recurso);
        this.resolucao = resolucao;
    }

    @Override
    public boolean validaUrlRecurso(String url) {
        return url.toLowerCase().matches(".+\\.(jpg|png|bpm)$");
    }

    public String getResolucao() {
        return resolucao;
    }
}
