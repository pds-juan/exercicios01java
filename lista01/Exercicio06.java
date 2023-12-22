package lista01;

import java.util.Scanner;

public class Exercicio06 {

	/*
	 * 6) Troca de Valores:
	 * 
	 * Implemente um m�todo chamado trocarValores que recebe dois inteiros como
	 * par�metros e troca os valores entre eles.
	 */

	public static int[] trocarValores(int numeros[]) {
		int valorA = numeros[0];
		int valorB = numeros[1];

		int trocarValor = valorA;

		numeros[0] = valorB;
		numeros[1] = trocarValor;

		return numeros;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		int valor01 = sc.nextInt();
		System.out.println("Digite outro n�mero: ");
		int valor02 = sc.nextInt();
		
		int[] numeros = { valor01, valor02 };
		sc.close();
		trocarValores(numeros);

		System.out.println("Os valores agora s�o " + numeros[0] + " e " + numeros[1] + ".");
	}
}
