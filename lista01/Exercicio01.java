package lista01;

import java.util.Scanner;

public class Exercicio01 {

	/*
	 * 1) Soma de Dois N�meros:
	 * 
	 * Crie um m�todo chamado soma que recebe dois n�meros como par�metros e retorna
	 * a soma deles.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o primeiro n�mero: ");
		double numero1 = sc.nextDouble();
		System.out.print("Digite o segundo n�mero: ");
		double numero2 = sc.nextDouble();

		System.out.println("A soma dos n�mero � " + soma(numero1, numero2));

		sc.close();
	}

	public static double soma(double numero1, double numero2) {
		return numero1 + numero2;
	}
}
