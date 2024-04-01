public class contaPoupanca extends Banco {

    private double selic = 8.5;
    private double rendimento;

    public double getSelic() {
        return selic;
    }

    public void setSelic(double selic) {
        this.selic = selic;
    }

    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }

    public double rendimento() {
        if (selic > 8.5) {
            rendimento = 0.005 * saldo;
            System.out.println("Rendimento anual da sua conta: " + rendimento);
            return rendimento;
        } else {
            rendimento = 0.007 * selic * saldo;
            System.out.println("Rendimento anual da sua conta: " + rendimento);
            return rendimento;
        }


    }
}