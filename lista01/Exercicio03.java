package lista01;

public class Exercicio03 {

	/*
	 * 3) Média de uma Lista de Números:
	 * 
	 * Crie um método chamado calcularMedia que recebe um array de números como
	 * parâmetro e retorna a média deles.
	 */

	public static int calcularMedia(int numeros[]) {
		int soma = 0;
		int media = 0;

		for (int numero : numeros) {
			soma += numero;
		}
		
		media = (soma / numeros.length);
		return media;
	}

	public static void main(String[] args) {
		int[] numeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		System.out.println(calcularMedia(numeros));
	}
}
