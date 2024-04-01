public class Main {
    public static void main(String [] args){
        Produto p1 = new Produto("Boné", 149.99, "New Era");
        Produto p2 =  new Produto("Relógio", 13099.99, "Omega Speedmaster");

        p1.ExibirPeoduto();
        System.out.println("");
        p2.ExibirPeoduto();
    }
}
