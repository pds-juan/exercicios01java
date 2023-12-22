package lista01;

import java.util.Scanner;

public class Exercicio04 {

	/*
	 * 4) Fatorial de um Número:
	 * 
	 * Implemente um método chamado fatorial que calcula o fatorial de um número
	 * passado como parâmetro.
	 */

	public static int fatorial(int numero01, int numero02) {
		if (numero01 < numero02) {
			return numero02 * fatorial(numero01, numero02 - 1);
		} else {
			return numero02;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero = sc.nextInt();
		sc.close();
		
		int resultado = fatorial(1, numero);
		System.out.println(resultado);
	}
}
