public class Televisao extends Produto{

    public void Acesar_canais(){
        System.out.println("Canal assistido no momento é: 0.7 - Globo Rural (SEGURA PEEEEÂO00000)");
    }

    public void Exibir_Televisao (){
        super.Exibir();
        Acesar_canais();
    }
}