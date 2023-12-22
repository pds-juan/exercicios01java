package lista01;

import java.util.Scanner;

public class Exercicio02 {

	/*
	 * 2) Verifica��o de N�mero Primo:
	 * 
	 * Implemente um m�todo chamado ehPrimo que recebe um n�mero como par�metro e
	 * retorna true se ele for primo e false caso contr�rio.
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
		
		System.out.println("Digite um n�mero: ");
		int valor = sc.nextInt();
		
		System.out.println(ehPrimo(valor));
		sc.close();

	}

}
