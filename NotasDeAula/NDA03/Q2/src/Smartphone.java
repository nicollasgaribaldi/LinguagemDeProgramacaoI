public class Smartphone extends Produto {
    public void Ligação (){
        System.out.println("Número de emergencia: \n" +
                "100 – Secretaria dos Direitos Humanos.\n" +
                "180 – Delegacia da Mulher.\n" +
                "181 – Disque-Denúncia.\n" +
                "190 – Polícia Militar.\n" +
                "191 – Polícia Rodoviária Federal.\n" +
                "192 – SAMU.\n" +
                "193 – Corpo de Bombeiros.\n" +
                "194 – Polícia Federal.");
    }

    public void Exibir_Celular (){
        super.Exibir();
        Ligação();
    }
}