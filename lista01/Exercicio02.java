package lista01;

import java.util.Scanner;

public class Exercicio02 {

	/*
	 * 2) Verificação de Número Primo:
	 * 
	 * Implemente um método chamado ehPrimo que recebe um número como parâmetro e
	 * retorna true se ele for primo e false caso contrário.
	 */

	public static boolean ehPrimo(int valor) {
		int divisores = 0;

		if (valor <= 1) {
			return false;
		} else {
			for (int contador = 1; contador <= valor; contador++) {
				
				if (valor % contador == 0) {
					divisores++;
				}
			}

			if (divisores == 2) {
				return true;
			} else {
				return false;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int valor = sc.nextInt();
		
		System.out.println(ehPrimo(valor));
		sc.close();

	}

}
