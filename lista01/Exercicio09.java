package lista01;

import java.util.Scanner;

public class Exercicio09 {

	/*
	 * 9) Verificação de Palíndromo:
	 * 
	 * Crie um método chamado ehPalindromo que recebe uma string como parâmetro e
	 * retorna true se ela for um palíndromo e false caso contrário.
	 */

	public static boolean ehPalindromo(String palavra) {

		String textoMinusculo = palavra.toLowerCase();

		char[] caracteres = textoMinusculo.toCharArray();

		for (int letra = 0; letra < caracteres.length / 2; letra++) {
			char guardarCaracteres = caracteres[letra];
			caracteres[letra] = caracteres[caracteres.length - 1 - letra];
			caracteres[caracteres.length - 1 - letra] = guardarCaracteres;
		}

		String caracteresParaString = new String(caracteres);
		return textoMinusculo.equals(caracteresParaString);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a palavra a descobrir se é um palíndromo ou não: ");
		String palavra = sc.nextLine();
		sc.close();
		
		System.out.println(ehPalindromo(palavra));
	}
}
