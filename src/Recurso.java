public abstract class Recurso {
    protected int ID;
    protected String url_recurso;
    protected static int prox_ID = 1;

    public Recurso(String url_recurso){
            this.ID = prox_ID++;
            this.url_recurso = url_recurso;
    }

    public abstract boolean validaUrlRecurso(String url);

    public int getID() {
        return ID;
    }
    public String getUrl_recurso() {
        return url_recurso;
    }
}
