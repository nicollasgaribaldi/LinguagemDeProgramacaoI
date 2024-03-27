// As maçãs custam 1,30 cada, se forem compradas menos de uma dúzia, e 1,00 se
// forem compradas pelo menos 12. Escreva um programa que leia o número de maçãs
// compradas, calcule e escreva o custo total da compra.

public class Main {
    public static void main(String[] args) {
        double macas1 = 1.30;
        double macas2 = 1.00;
        int quantidade = 5;
        double custo;

        if (quantidade>=12) {
            custo = (quantidade*macas2);
            System.out.println("Você comprou "+quantidade+" maçãs e deverá pagar R$"+custo+".");
        } else {
            custo = (quantidade*macas1);
            System.out.println("Você comprou "+quantidade+" maçãs e deverá pagar R$"+custo+".");
        }
    }
}