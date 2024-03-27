// Crie um programa em Java que recebe três comprimentos de lados e determina
// se esses comprimentos podem formar um triângulo. Caso positivo, o programa deve
// indicar o tipo de triângulo formado (equilátero, isósceles ou escaleno).

public class Main {
    public static void main(String[] args) {
        double ladoA = 10;
        double ladoB = 20;
        double ladoC = 30;

        if (ladoA == ladoB && ladoA == ladoC) {
            System.out.println("O triângulo é Equilátero.");
        } else if (ladoA != ladoB && ladoA == ladoC || ladoA == ladoB && ladoA != ladoC || ladoA != ladoB && ladoA != ladoC) {
            System.out.println("O triângulo é Isósceles.");
        }else {
            System.out.println("O triângulo é Escaleno.");
        }
    }
}