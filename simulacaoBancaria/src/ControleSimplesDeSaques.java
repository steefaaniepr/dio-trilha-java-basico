import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar o limite diário de saque
        System.out.println("Informe o limite diário de saque:");
        double limiteDiario = scanner.nextDouble();
        double saldo = limiteDiario;

        // Loop para iterar sobre os saques
        for (int i = 1; ; i++) {
            // Solicitar o valor do saque
            System.out.println("Informe o valor do saque:");
            double valorSaque = scanner.nextDouble();

            if (valorSaque == 0) {
                System.out.println("Transações encerradas.");
                break; // Encerra o loop
            } else if (valorSaque > saldo) {
                System.out.println("Limite diário de saque atingido. Transações encerradas.");
                break; // Encerra o loop
            } else {
                // Atualizar o saldo e imprimir a saída no formato dos exemplos
                saldo -= valorSaque;
                System.out.println("Saque realizado. Limite restante: " + saldo);
                break;
            }
        }

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
