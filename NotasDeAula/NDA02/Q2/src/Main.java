import java.util.Scanner;
public class Main {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        Estoque etq = new Estoque();

        System.out.println("Dígite a Quantidade Atual do estoque: ");
        etq.setQtd_atual(sc.nextInt());

        System.out.println("Dígite a Quantidade Maxíma do estoque: ");
        etq.setQtd_maxima(sc.nextInt());

        System.out.println("Digite a Quantidade Mínima do estoque: ");
        etq.setQtd_minima(sc.nextInt());

        etq.qtd_media();

        if(etq.getQtd_atual() >= etq.getMedia()) {
            System.out.println("Não efetuar compra!");
        }
        else {
            System.out.println("Efetuar compra!");
        }
    }
}