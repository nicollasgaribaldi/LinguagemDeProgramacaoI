// Faça um programa que calcule o salário de um funcionário com base no valor da hora
// trabalhada de R$ 15.00 e na quantidade de 40 horas trabalhadas e exiba o salário.

public class Main {
    public static void main(String[] args) {
        int valorHora = 15;
        int horasTrabalhadas = 40;
        int salario = valorHora * horasTrabalhadas;

        System.out.println("Funcionário recebe R$15 por hora e trabalhou 40 horas, então receberá "+salario +" reais de salário.");
    }
}