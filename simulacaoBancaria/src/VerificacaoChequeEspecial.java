import java.util.Scanner;

public class VerificacaoChequeEspecial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o saldo e o valor a ser sacado
        System.out.println("Digite o saldo:");
        double saldo = scanner.nextDouble();
        System.out.println("Digite o valor do saque:");
        double saque = scanner.nextDouble();

        double limiteChequeEspecial = 500;

        // Verifica se a transação pode ser realizada com o saldo disponível
        if (saque <= saldo) {
            System.out.println("Transação realizada com sucesso.");
        } 
        // Verifica se a transação pode ser realizada utilizando o cheque especial
        else if (saque <= saldo + limiteChequeEspecial) {
            System.out.println("Transação realizada com sucesso utilizando o cheque especial.");
        } 
        // Caso a transação não possa ser realizada
        else {
            System.out.println("Transação não realizada. Limite do cheque especial excedido.");
        }

        // Fecha o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
