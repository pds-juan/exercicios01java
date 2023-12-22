package lista01;

import java.util.Scanner;

public class Exercicio07 {

	/*
	 * 7) Conversão de Temperatura:
	 * 
	 * Crie um método chamado converterCelsiusParaFahrenheit que recebe uma
	 * temperatura em graus Celsius como parâmetro e retorna a temperatura
	 * equivalente em Fahrenheit.
	 */

	public static double converterCelsiusParaFahrenheit(double celsius) {
		return celsius = (celsius * 9 / 5) + 32;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a temperatura em graus Celsius: ");
		double celsius = sc.nextDouble();
		sc.close();

		System.out.println(converterCelsiusParaFahrenheit(celsius));
	}
}
