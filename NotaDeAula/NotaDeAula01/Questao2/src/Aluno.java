public class Aluno {
    String nome;
    double nota_1;
    double nota_2;
    double nota_3;
    double media;

    public void calcular_media(){
        media = (nota_1+nota_2+nota_3) / 3;
    }
}
