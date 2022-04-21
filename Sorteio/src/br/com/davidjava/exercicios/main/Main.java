package br.com.davidjava.exercicios.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int tentativa = 1;
		System.out.println("Seja bem-vindo ao palpite!\n\nVamos começar? ");
		int sortear_numero = (int) (Math.random() * 100);
		System.out.println("O número foi gerado, vamos tentar descobrir qual é? ");
		System.out.println("Digite seu palpite: ");
		int palpite = scan.nextInt();
		if (palpite == sortear_numero) {
			System.out.println(String.format("Parabéns!, você acertou com apenas 1 tentativas. O número sorteado é %d.",
					sortear_numero));
		} else {
			while (palpite != sortear_numero) {
				tentativa += 1;
				System.out.println("Digite seu palpite novamente: ");
				int novo_palpite = scan.nextInt();
				if (novo_palpite == sortear_numero) {
					System.out.println(String.format(
							"Parabéns, seu palpite foi certo, custou %d tentativas para seu acerto.\nNúmero sorteado: %d.",
							tentativa, novo_palpite));
					break;
				} else if (novo_palpite > sortear_numero) {
					System.out.println("Passou em, seu número foi maior que o sorteado. Tente novamente!");
				} else if (novo_palpite < sortear_numero) {
					System.out.println("Falta muito em, seu número foi menor que o sorteado. Tente novamente!");
				}
				palpite = novo_palpite;
			}
		}

		scan.close();

	}

}
