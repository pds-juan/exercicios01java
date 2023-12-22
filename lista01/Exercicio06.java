package lista01;

import java.util.Scanner;

public class Exercicio06 {

	/*
	 * 6) Troca de Valores:
	 * 
	 * Implemente um método chamado trocarValores que recebe dois inteiros como
	 * parâmetros e troca os valores entre eles.
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
		
		System.out.println("Digite um número: ");
		int valor01 = sc.nextInt();
		System.out.println("Digite outro número: ");
		int valor02 = sc.nextInt();
		
		int[] numeros = { valor01, valor02 };
		sc.close();
		trocarValores(numeros);

		System.out.println("Os valores agora são " + numeros[0] + " e " + numeros[1] + ".");
	}
}
