package lista01;

public class Exercicio08 {

	/*
	 * 8) Maior Elemento em uma Matriz:
	 * 
	 * Implemente um método chamado encontrarMaiorElemento que recebe uma matriz de
	 * inteiros como parâmetro e retorna o maior elemento presente nela.
	 */

	public static int encontrarMaiorElemento(int[][] matriz) {
		int maiorElemento = matriz[0][0];

		for (int numero = 0; numero < matriz.length; numero++) {
			for (int segundo = 0; segundo < matriz[numero].length; segundo++) {
				if (matriz[numero][segundo] > maiorElemento) {
					maiorElemento = matriz[numero][segundo];
				}
			}
		}

		return maiorElemento;
	}

	public static void main(String[] args) {
		int[][] numeros = { { 10, 9, 5, 3 }, { 75, 54, 73, 82 }, { 91, 4, 7, 15 } };

		int maiorElemento = encontrarMaiorElemento(numeros);
		System.out.println(maiorElemento);
	}
}
