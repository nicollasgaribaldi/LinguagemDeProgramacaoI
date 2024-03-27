// Elabore um programa que receba 3 notas (informadas pela pessoa desenvolvedora).
// Em seguida, calcule a média e verifique se o aluno está aprovado, reprovado ou na final.
public class Main {
    public static void main(String[] args) {
        double nota1 = 8;
        double nota2 = 9;
        double nota3 = 10;
        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("A média do Aluno é: "+ media);

        if (media>7.0) {
            System.out.println("Aprovado");
        } else if (media<4.0){
            System.out.println("Reprovado");
        } else {
            System.out.println("Está na final");
        }
    }
}