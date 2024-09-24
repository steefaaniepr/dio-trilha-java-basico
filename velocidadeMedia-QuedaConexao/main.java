import java.util.Scanner;

public class main {

    // Função para calcular a velocidade média de conexão de internet
    public static double calcularVelocidadeMedia(String[] velocidades) {
        int total = 0;
        for (String velocidade : velocidades) {
            total += Integer.parseInt(velocidade.trim());
        }

        // TODO: Some todas as velocidades registradas e calcule a média
        return (double) total / velocidades.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário a lista de velocidades de conexão registradas a cada hora
        String input = scanner.nextLine();

        // Convertendo a entrada em uma lista de strings
        String[] velocidades = input.split(",");

        // Calculando a velocidade média de conexão
        double velocidadeMedia = calcularVelocidadeMedia(velocidades);

        // Exibindo a velocidade média de conexão
        System.out.println((int)velocidadeMedia + " Mbps");

        scanner.close();
    }
}

// Explicação do Código
// Entrada do Usuário:

// O programa solicita ao usuário para inserir as velocidades de conexão separadas por vírgula.
// Divisão dos Valores:

// A entrada do usuário é convertida em um array de strings usando split(",").
// Cálculo da Média:

// A função calcularVelocidadeMedia percorre o array, somando todas as velocidades.
// Calcula a média dividindo a soma pelo número de velocidades.
// Exibição do Resultado:

// O resultado final é exibido em Mbps como um número inteiro.