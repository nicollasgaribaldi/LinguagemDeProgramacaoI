public class Leao extends Animal{
    private String pelo;

    public String getPelo() {
        return pelo;
    }

    public void setPelo(String pelo) {
        this.pelo = pelo;
    }

    public Leao(String classe, String locomoção, String pelo){
        super(classe, locomoção);
        this.pelo = pelo;
    }

    public void Exibir_Leao(){
        System.out.println("Classe: " + classe);
        System.out.println("Locomoção: " + locomoção);
        System.out.println("Pelo: " + pelo);
    }
}