public class Animal {
    protected String classe, locomoção;

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getLocomoção() {
        return locomoção;
    }

    public void setLocomoção(String locomoção) {
        this.locomoção = locomoção;
    }

    public Animal (String classe, String locomoção){
        this.classe = classe;
        this.locomoção = locomoção;
    }
}