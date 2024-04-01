public class Arara extends Animal{
    protected int qtd_ovos;

    public int getQtd_ovos() {
        return qtd_ovos;
    }

    public void setQtd_ovos(int qtd_ovos) {
        this.qtd_ovos = qtd_ovos;
    }

    public Arara(String classe, String locomoção, int qtd_ovos){
        super(classe, locomoção);
        this.qtd_ovos = qtd_ovos;
    }
}