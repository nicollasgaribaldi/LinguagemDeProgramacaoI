public class Produto {
    protected String nome;
    protected int estoque;
    protected double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void Exibir(){
        System.out.println("Modelo: " + nome);
        System.out.println("Quantidade em Estoque: " + estoque);
        System.out.println("Preço: " + preco);
    }
}