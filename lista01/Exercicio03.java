package lista01;

public class Exercicio03 {

	/*
	 * 3) M�dia de uma Lista de N�meros:
	 * 
	 * Crie um m�todo chamado calcularMedia que recebe um array de n�meros como
	 * par�metro e retorna a m�dia deles.
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
