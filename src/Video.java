public class Video extends Recurso{
    private int frame_rate;
    private int duracao;

    public Video(){
        setUrl_video("");
    }
    public Video(String url_recurso,int frame_rate,int duracao) {
        super(url_recurso);
        if (!this.validaUrlRecurso(url_recurso)){
            setUrl_video("Erro: Tipo de arquivo inválido.");
        }
        this.duracao = duracao;
        this.frame_rate = frame_rate;
    }


    @Override
    public boolean validaUrlRecurso(String url) {
        return url.toLowerCase().matches(".+\\.(mp4|mov|wmv)$");
    }

    public int getDuracao() {
        return duracao;
    }

    public int getFrame_rate() {
        return frame_rate;
    }

    public void setUrl_video(String novo_Url){
        this.url_recurso = novo_Url;
    }

}
