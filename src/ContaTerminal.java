import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Nome;
        String Agencia;
        int Saque;
        int Operacao;
        int Deposito;
        double Saldo = 25.00;
        double Resultado;
        double NovoSaque;

        System.out.print("Digite o seu Nome: ");
        Nome = sc.nextLine();

        System.out.println("Digite sua Agencia: ");
        Agencia = sc.nextLine();

        System.out.println("Operações Disponiveis: 1 - Saque, " +
                            "2 - Deposito  " +
                            "3 - Saldo" +
                            " 4 - Sair");

        System.out.println("Digite a operação desejada:");
        Operacao = sc.nextInt();

        if (Operacao == 1) {
            System.out.println("Qual seria o valor desejado?");
            Saque = sc.nextInt();

            if (Saque > Saldo) {
                System.out.println("Saldo insuficiente!");
            } else {
                Resultado = Saldo - Saque;
                NovoSaque = Resultado;

                System.out.println("Operação Realizada com sucesso!");
                System.out.println("O seu novo saldo é: " + NovoSaque);
            }
        }

        if (Operacao == 2) {
            System.out.println("Qual é o valor para depósito?");
            Deposito = sc.nextInt();

            Resultado = Saldo + Deposito;
            NovoSaque = Resultado;

            System.out.println("Operação Realizada com sucesso!");
            System.out.println("O seu novo saldo é: " + NovoSaque);
        }

        if (Operacao == 3) {
            System.out.println("Olá " + Nome + ", o seu saldo atual é: " + Saldo);
        }

        if (Operacao < 0 || Operacao > 5) {
            System.out.println("Operação Inválida!!");
        }

        if (Operacao == 4) {
            System.out.println("Obrigado por utilizar o nosso Banco :D");
        }
    }
}
