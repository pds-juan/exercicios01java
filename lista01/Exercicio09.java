package lista01;

import java.util.Scanner;

public class Exercicio09 {

	/*
	 * 9) Verifica��o de Pal�ndromo:
	 * 
	 * Crie um m�todo chamado ehPalindromo que recebe uma string como par�metro e
	 * retorna true se ela for um pal�ndromo e false caso contr�rio.
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
		
		System.out.println("Digite a palavra a descobrir se � um pal�ndromo ou n�o: ");
		String palavra = sc.nextLine();
		sc.close();
		
		System.out.println(ehPalindromo(palavra));
	}
}
