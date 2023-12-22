package lista01;

import java.util.Scanner;

public class Exercicio01 {

	/*
	 * 1) Soma de Dois Números:
	 * 
	 * Crie um método chamado soma que recebe dois números como parâmetros e retorna
	 * a soma deles.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o primeiro número: ");
		double numero1 = sc.nextDouble();
		System.out.print("Digite o segundo número: ");
		double numero2 = sc.nextDouble();

		System.out.println("A soma dos número é " + soma(numero1, numero2));

		sc.close();
	}

	public static double soma(double numero1, double numero2) {
		return numero1 + numero2;
	}
}
