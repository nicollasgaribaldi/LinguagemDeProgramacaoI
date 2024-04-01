import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Banco b = new Banco();
        contaCorrente cc = new contaCorrente();
        contaPoupanca cp = new contaPoupanca();
        int select_tipo_conta;
        int select_operacao;
        boolean repetir = true;

        System.out.println("Digite seu nome: ");
        b.setNome(sc.next());
        System.out.println("Deseja acessar: [1 = Conta Corrente] [2 = Conta Poupança]");
        select_tipo_conta = sc.nextInt();

        switch (select_tipo_conta) {
            case 1:
                do {
                    System.out.println("O que deseja fazer em sua conta corrente: [1 = Depositar] [2 = Sacar] " +
                            "[3 = Tentativa de Cheque Especial] [4 = Exibir dados da conta]");
                    select_operacao = sc.nextInt();

                    switch (select_operacao) {
                        case 1:
                            System.out.println("Digite o valor que deseja Depositar: ");
                            b.setValor_deposito(sc.nextInt());
                            b.Depositar();
                            break;

                        case 2:
                            System.out.println("Digite o valor que deseja Sacar: ");
                            b.setValor_saque(sc.nextInt());
                            b.sacar();
                            break;

                        case 3:
                            System.out.println("Digite o valor que deseja sacar com cheque especial: ");
                            int valorSaque = sc.nextInt();
                            cc.ChequeEspecial(valorSaque);
                            break;

                        case 4:
                            b.ExibirDados();
                            break;

                        default:
                            System.out.println("Opção inválida.");
                            break;
                    }

                    System.out.println("Deseja repetir uma operação? [1 = Sim / 2 = Não]");
                    int repetirOpcao = sc.nextInt();
                    if (repetirOpcao != 1) {
                        repetir = false;
                    }
                } while (repetir);
                break;

            case 2:
                do {
                    System.out.println("O que deseja fazer em sua conta poupança: [1 = Depositar] [2 = Sacar] " +
                            "[3 = Rendimento] [4 = Exibir dados da conta]");
                    select_operacao = sc.nextInt();

                    switch (select_operacao) {
                        case 1:
                            System.out.println("Digite o valor que deseja Depositar: ");
                            b.setValor_deposito(sc.nextInt());
                            b.Depositar();
                            break;

                        case 2:
                            System.out.println("Digite o valor que deseja Sacar: ");
                            b.setValor_saque(sc.nextInt());
                            b.sacar();
                            break;

                        case 3:
                            cp.rendimento();
                            break;

                        case 4:
                            b.ExibirDados();
                            break;

                        default:
                            System.out.println("Opção inválida.");
                            break;
                    }

                    System.out.println("Deseja repetir uma operação? [1 = Sim / 2 = Não]");
                    int repetirOpcao = sc.nextInt();
                    if (repetirOpcao != 1) {
                        repetir = false;
                    }
                } while (repetir);
                break;

            default:
                System.out.println("Opção de conta inválida.");
                break;
        }
    }
}