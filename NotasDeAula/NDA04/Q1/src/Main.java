public class Main {
    public static void  main(String [] args){
        Professor pr = new Professor("Fulano", 35, 5000.00);
        Aluno al = new Aluno("Beltrano",20,"20232123");

        pr.exibirInformacoesProfessor();
        System.out.println("");
        al.ExibirInformacoesAluno();

    }
}