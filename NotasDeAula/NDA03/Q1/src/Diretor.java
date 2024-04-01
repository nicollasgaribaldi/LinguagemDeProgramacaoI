public class Diretor extends Funcionario {
    private int acoes;

    public int getAcoes() {
        return acoes;
    }

    public void setAcoes(int acoes) {
        this.acoes = acoes;
    }

    public void ExibitDiretor(){
        super.exibir();
        System.out.println("Ações: " + acoes);
    }
}