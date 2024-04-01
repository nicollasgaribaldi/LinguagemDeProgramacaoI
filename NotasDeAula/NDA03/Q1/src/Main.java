import java.util.Scanner;
public class Main {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        Funcionario fc = new Funcionario();
        Diretor dr = new Diretor();
        Gerente gr = new Gerente();

        System.out.println("Dígite o nome do gerente: ");
        gr.setNome(sc.next());

        System.out.println("Dígite o sálario do gerente ");
        gr.setSalario(sc.nextDouble());

        System.out.println("Dígite o departamento do gerente: ");
        gr.setDepartamento(sc.next());

        gr.exibirGerente();
        gr.Calcular_Bonus();

        System.out.println("____________________________________________________________");

        System.out.println(" Dígite o nome do Diretor: ");
        dr.setNome(sc.next());

        System.out.println("Dígite o salario do Diretor: ");
        dr.setSalario(sc.nextDouble());

        System.out.println("Dígite o número de ações do Diretor: ");
        dr.setAcoes(sc.nextInt());

        dr.ExibitDiretor();
    }
}