import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		final Scanner scanner = new Scanner(System.in);
		
		
		try {
			System.out.println("Digite o primeiro numero");
		    int parametroUm = scanner.nextInt();

            System.out.println("Digite o segundo parâmetro");
		    int parametroDois = scanner.nextInt();

			contar(parametroUm, parametroDois);
		
		} catch (ParametrosInvalidosException e) {
			System.err.println(e.getMessage());
		}
		
	}

	private static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
		
		int contagem = parametroDois - parametroUm;
		
        for(int i = 1; i<= contagem; i++){
            System.out.println("Imprimindo o numero " + i);
        }
	}
}