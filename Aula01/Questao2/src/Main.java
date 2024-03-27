// Elabore um programa que verifique se uma variável é maior, menor ou
// igual a outra e exiba esta informação na tela e exiba.

public class Main {
    public static void main(String[] args) {
        int var1 = 2;
            System.out.println(var1);
        int var2 = 15;
            System.out.println(var2);

        if (var1 > var2) {
            System.out.println(var1 +" é maior que "+ var2);
        } else if (var1 == var2){
            System.out.println(var1 +" é igual a "+ var2);
        } else {
            System.out.println(var2 +" é maior que "+ var1);
        }
    }
}