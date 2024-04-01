public class Triangulo {
    private double lado1, lado2, lado3;

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    public void Metodo_Triangulo(){
        if (lado1 + lado2 > lado3 || lado2 + lado3 > lado1 || lado3 + lado1 > lado2 ){

            if (lado1 == lado2 && lado2 == lado3 && lado3 == lado1){
                System.out.println("Triângulo EQUILATERO!");

            } else if (lado1 == lado2 || lado2 == lado3 || lado3 == lado1){
                System.out.println("Tringulo ISÓSILES!");

            } else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
                System.out.println("Triângulo ESCALENO!");
            }
        }
        else{
            System.out.println("Valor inválido, não é possivel formar um Triângulo");
        }
    }
}