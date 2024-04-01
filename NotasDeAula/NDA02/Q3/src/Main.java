import java.util.Scanner;
public class Main {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        Triangulo tr = new Triangulo();

        System.out.println("Dígite o valor do primeiro lado: ");
        tr.setLado1(sc.nextDouble());

        System.out.println("Dígite o valor do segundo lado: ");
        tr.setLado2(sc.nextDouble());

        System.out.println("Dígite o valor do terceiro lado: ");
        tr.setLado3(sc.nextDouble());

        tr.Metodo_Triangulo();

    }
}