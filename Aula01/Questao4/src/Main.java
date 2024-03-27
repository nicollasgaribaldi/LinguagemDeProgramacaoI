// Faça um programa para o cálculo de uma folha de pagamento. Para isso, o sistema
// deve saber o valor do salário. Com base na descrição abaixo, exiba os descontos do IR:
//• Salário até R$900,00 (inclusive) – Isento;
//• Salário de R$901,00 até R$ 1500, 00 (inclusive) – desconto de 5%;
//• Salario de1501,00 até R$ 2500,00 (Inclusive) – desconto de 10%;
//• Salário acima de 2500 – Desconto de 20%.

public class Main {
    public static void main(String[] args) {
        double salario = 800;
        double imposto;

        if (salario<=900) {
            System.out.println("Você recebe R$"+salario+" e está ISENTO de desconto.");
        } else if (salario>=901 && salario<=1500) {
            imposto = (salario*5/100);
            System.out.println("Você recebe R$"+salario+" e sofrerá desconto de 5%, o imposto é "+imposto+".");
        } else if (salario>=1501 && salario<=2500) {            imposto = (salario*5/100);
            System.out.println("Você recebe R$"+salario+" e sofrerá desconto de 10%, o imposto é "+imposto+".");
        } else {
            imposto = (salario*5/100);
            System.out.println("Você recebe R$"+salario+" e sofrerá desconto de 20%, o imposto é "+imposto+".");
        }
    }
}