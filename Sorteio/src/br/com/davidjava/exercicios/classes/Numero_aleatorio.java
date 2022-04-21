package br.com.davidjava.exercicios.classes;

public class Numero_aleatorio {
	public int sortear_numero(int n) {
		int gerar_random = (int) (Math.random() * n);
		return gerar_random;
	}
}
