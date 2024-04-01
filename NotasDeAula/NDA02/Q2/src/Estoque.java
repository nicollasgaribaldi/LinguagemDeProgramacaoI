public class Estoque {
    private int qtd_atual;
    private int qtd_maxima;
    private int qtd_minima;
    private int media;

    public int getQtd_atual() {
        return qtd_atual;
    }

    public void setQtd_atual(int qtd_atual) {
        this.qtd_atual = qtd_atual;
    }

    public int getQtd_maxima() {
        return qtd_maxima;
    }

    public void setQtd_maxima(int qtd_maxima) {
        this.qtd_maxima = qtd_maxima;
    }

    public int getQtd_minima() {
        return qtd_minima;
    }

    public void setQtd_minima(int qtd_minima) {
        this.qtd_minima = qtd_minima;
    }
    public int getMedia() {
        return media;
    }

    public void setMedia(int media) {
        this.media = media;
    }
    public void qtd_media(){
        media = (qtd_maxima + qtd_minima) / 2;
    }
}