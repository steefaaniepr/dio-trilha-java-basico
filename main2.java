import java.util.Scanner;

public class main2 {
    // Função para verificar queda de conexão
    public static String verificarQuedaConexao(String[] velocidades) {
        for (String velocidade : velocidades) {
            if (Integer.parseInt(velocidade.trim()) == 0) {
                return "Queda de Conexao";
            }
        }
        return "Sem Quedas";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário a lista de velocidades de conexão registradas a cada hora
        System.out.println("Digite as velocidades de conexão registradas separadas por vírgula:");
        String input = scanner.nextLine();

        // Convertendo a entrada em uma lista de strings
        String[] velocidades = input.split(",");

        // Verificando se houve queda de conexão
        String resultado = verificarQuedaConexao(velocidades);

        // Exibindo o resultado da verificação
        System.out.println(resultado);

        scanner.close();
    }
}


// Explicação do Código:
// Função verificarQuedaConexao:
// Percorre o array velocidades.
// Verifica se algum valor é 0. Se encontrar, retorna a mensagem "Houve queda de conexão durante o dia."
// Se não encontrar nenhum 0, retorna "Não houve queda de conexão durante o dia."
// Este programa verificará a entrada para qualquer velocidade de 0 Mbps e retornará "Queda de Conexao" se houver ao menos um registro com 0, ou "Sem Quedas" caso contrário.