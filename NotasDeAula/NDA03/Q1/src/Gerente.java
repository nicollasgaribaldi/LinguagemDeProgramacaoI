public class Gerente extends Funcionario {
    private String departamento;

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double Calcular_Bonus () {
        super.salario = salario * 0.1;
        System.out.println("Bônus:" + salario);
        return salario;

    }

    public void exibirGerente() {
        super.exibir();
        System.out.println("Departamento: " + departamento);
    }
}