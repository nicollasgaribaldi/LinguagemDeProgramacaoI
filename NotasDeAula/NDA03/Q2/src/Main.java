import java.util.Scanner;
public class Main {
    public static void main(String [] args){

        Scanner sc = new Scanner(System. in);
        Smartphone sm = new Smartphone();
        Televisao tlv = new Televisao();

        System.out.println("Dígite o modelo do Smartphone: ");
        sm.setNome(sc.next());

        System.out.println("Informe a quantidade em estoque: ");
        sm.setEstoque(sc.nextInt());

        System.out.println("Informe o preço unitario: ");
        sm.setPreco(sc.nextDouble());

        sm.Exibir_Celular();

        System.out.println("_______________________________________________________________");

        System.out.println("Informe o modelo da Televisão: ");
        tlv.setNome(sc.next());

        System.out.println("informe a quantidade em estque: ");
        tlv.setEstoque(sc.nextInt());

        System.out.println("Informe o preço unitario: ");
        tlv.setPreco(sc.nextDouble());

        tlv.Exibir_Televisao();
    }
}