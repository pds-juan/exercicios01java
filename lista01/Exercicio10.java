package lista01;

public class Exercicio10 {

	/*
	 * 10) Ordenação Crescente:
	 * 
	 * Implemente um método chamado ordenarCrescente que recebe um array de inteiros
	 * como parâmetro e o ordena em ordem crescente.
	 */

	public static void ordenarCrescente(int[] numeros) {

		for (int ordem = 0; ordem < numeros.length - 1; ordem++) {

			for (int numero = 0; numero < numeros.length - 1 - ordem; numero++) {

				if (numeros[numero] > numeros[numero + 1]) {
					int guardarValor = numeros[numero];
					numeros[numero] = numeros[numero + 1];
					numeros[numero + 1] = guardarValor;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] numeros = { 70, 43, 4, 12, 1, 15 };

		ordenarCrescente(numeros);

		for (int numero = 0; numero < numeros.length; numero++) {
			System.out.println(numeros[numero]);
		}
	}
}
