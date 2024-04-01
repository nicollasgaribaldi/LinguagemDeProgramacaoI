public class Funcionario {
    protected String nome;
    protected Double salario;
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void exibir(){
        System.out.println("Nome: " + nome);
        System.out.println("Salário: " + salario);
    }
}