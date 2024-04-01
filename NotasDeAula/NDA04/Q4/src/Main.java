public class Main {
    public static void main (String []  args){
        Leao leao = new Leao("Mamifero", "patas", "Juba");
        Arara arara =  new Arara("Oviparo", "Asas", 5);

        System.out.println("Informações do Leão: ");
        leao.Exibir_Leao();

        System.out.println("");

        System.out.println("Informações da Arara: ");
        System.out.println("Classe: " + arara.getClasse());
        System.out.println("Locomoção: " + arara.getLocomoção());
        System.out.println("Quantidade de Ovos: " + arara.getQtd_ovos());
    }
}