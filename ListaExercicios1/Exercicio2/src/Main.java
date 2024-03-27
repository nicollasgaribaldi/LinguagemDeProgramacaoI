// Faça um algoritmo para receber de forma fixa (definida pelo programador) a
// quantidade atual em estoque, quantidade máxima em estoque e quantidade mínima em
// estoque de um produto. O sistema deve calcular e exibir a quantidade média usando a
// seguinte fórmula: quantidade média = (quantidade máxima + quantidade mínima)/2.
// Se a quantidade em estoque for maior ou igual a quantidade média, escrever a mensagem
// 'Não efetuar compra', senão escrever a mensagem 'Efetuar compra'.

public class Main {
    public static void main(String[] args) {
        int qtdAtual = 1699;
        int qtdMaxima = 3000;
        int qtdMinima = 400;
        int qtdMedia = (qtdMaxima + qtdMinima)/2;

        if (qtdAtual>=qtdMedia) {
            System.out.println("Não efetuar compra.");
        } else {
            System.out.println("Efetuar compra.");
        }
    }
}