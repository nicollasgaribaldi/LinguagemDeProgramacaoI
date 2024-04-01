public class Banco {

    protected String nome;
    protected int saldo, valor_deposito, valor_saque, sacar;

    public int getSacar() {
        return sacar;
    }

    public void setSacar(int sacar) {
        this.sacar = sacar;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }



    // functions abaixo:

    public void Depositar() {

        saldo = saldo + valor_deposito;
        System.out.println("Seu novo saldo: "+saldo);
    }

    public void sacar() {
        saldo = saldo - valor_saque;
        System.out.println("Seu novo saldo: " +saldo);
    }

    public int getValor_deposito() {
        return valor_deposito;
    }

    public void setValor_deposito(int valor_deposito) {
        this.valor_deposito = valor_deposito;
    }

    public int getValor_saque() {
        return valor_saque;
    }

    public void setValor_saque(int valor_saque) {
        this.valor_saque = valor_saque;
    }

    public void ExibirDados() {
        System.out.println("Nome do Cliente: "+nome);
        System.out.println("Saldo: "+saldo);
    }
}