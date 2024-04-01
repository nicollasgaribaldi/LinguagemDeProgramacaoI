public class Produto {
    private String peca, descricao;
    private double valor;

    public Produto(String peca, double valor, String descricao){
        this.peca = peca;
        this.valor = valor;
        this.descricao = descricao;
    }

    public void ExibirPeoduto(){
        System.out.println("Peça: " + peca);
        System.out.println("Valor: " + valor);
        System.out.println("Descrição: " + descricao);
    }
}