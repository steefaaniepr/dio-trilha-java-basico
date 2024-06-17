import java.text.DecimalFormat;
import java.util.Scanner;

public class SimulacaoBancaria {

    // Variável para armazenar o saldo da conta
    private static double saldo = 0;
    
    // Objeto para formatar o saldo com uma casa decimal
    private static final DecimalFormat df = new DecimalFormat("0.0");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner para ler a entrada do usuário

        // Loop infinito para exibir o menu até o usuário escolher sair
        while (true) {
            // Exibir opções do menu
            System.out.println("Escolha uma opção:");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Mostrar saldo");
            System.out.println("0. Sair");

            // Ler a opção escolhida pelo usuário
            int opcao = scanner.nextInt();

            // Executar a ação correspondente à opção escolhida
            switch (opcao) {
                case 1:
                    // Caso o usuário escolha depositarnbv 
                    System.out.println("Digite o valor a ser depositado:");
                    double valorDeposito = scanner.nextDouble();
                    saldo += valorDeposito;
                    System.out.println("Saldo atual: " + df.format(saldo));
                    break;
                case 2:
                    // Caso o usuário escolha sacar
                    System.out.println("Digite o valor a ser sacado:");
                    double valorSaque = scanner.nextDouble();
                    System.out.println("Saldo atual: " + df.format(saldo));
                    if (valorSaque > saldo) {
                        System.out.println("Saldo insuficiente.");
                    } else {
                        saldo -= valorSaque;
                        System.out.println("Saque de " + valorSaque + " realizado com sucesso.");
                        System.out.println("Saldo atual: " + df.format(saldo));
                        System.out.println("Programa encerrado.");
                    }
                    break;
                case 3:
                    // Caso o usuário escolha mostrar saldo
                    System.out.println("Saldo atual: " + df.format(saldo));
                    System.out.println("Programa encerrado.");
                    break;
                case 0:
                    // Caso o usuário escolha sair
                    System.out.println("Programa encerrado.");
                    scanner.close();
                    return;
                default:
                    // Caso o usuário escolha uma opção inválida
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
}

