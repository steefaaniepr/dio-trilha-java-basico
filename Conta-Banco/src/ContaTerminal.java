import java.util.Scanner;
public class ContaTerminal {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
                   
        System.out.println("Por favor, digite o número: ");
        int conta = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Por favor, digite o número da Agência ");
        String agencia = scanner.nextLine();
        System.out.println("Por favor, digite seu nome: ");
        String nome_cliente = scanner.nextLine();
        System.out.println("Por favor, digite seu saldo:  ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome_cliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta: " + conta + " e o seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }

    @Override
    public String toString() {
        return "ContaTerminal []";
    }
    }
