package lista01;

import java.util.Scanner;

public class Exercicio05 {

	/*
	 * 5) Contagem de Vogais:
	 * 
	 * Crie um método chamado contarVogais que recebe uma string como parâmetro e
	 * retorna o número de vogais nela.
	 */

	public static int contarVogais(String palavra) {

		String textoMinusculo = palavra.toLowerCase();

		char[] caracteres = textoMinusculo.toCharArray();

		int quantidadeVogais = 0;

		for (int letra = 0; letra < caracteres.length; letra++) {

			if (caracteres[letra] == 'a' || caracteres[letra] == 'e' || caracteres[letra] == 'i'
					|| caracteres[letra] == 'o' || caracteres[letra] == 'u') {
				quantidadeVogais++;
			}
		}
		
		return quantidadeVogais;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Escreva um palavra: ");
		String palavra = sc.nextLine();

		sc.close();
		System.out.println("Essa palavra tem " + contarVogais(palavra) + " vogais.");
	}
}
