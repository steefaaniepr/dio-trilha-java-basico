package br.com.stefaniepaes.controlefluxo;
import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		try {
            //chamando o método contendo a lógica de contagem
            System.out.println("Digite o primeiro parâmetro");
            int parametroUm = scanner.nextInt();

            System.out.println("Digite o segundo parâmetro");
            int parametroDois = scanner.nextInt();

			contar(parametroUm, parametroDois);
            
		}catch (ParametrosInvalidosException e) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
		}
		
	}


	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if(parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
		
		int contagem = parametroDois - parametroUm;
		//realizar o for para imprimir os números com base na variável contagem
        for(int n = 1; n<= contagem; n++){
            System.out.println("Imprimindo o numero " + n);
        }
	}
}