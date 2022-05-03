package FACENS;

import java.util.Scanner;

public class CalculoMedia {

	public static void main(String[] args) {
		// Declarando scanner para receber
		Scanner sc = new Scanner(System.in);
		// variáveis
		double no1, no2, no3, no4, med;

		// perguntando e recebendo notas
		System.out.println("Digite a nota da AC1: ");
		no1 = sc.nextDouble();
		System.out.println("Digite a nota da AC2: ");
		no2 = sc.nextDouble();
		System.out.println("Digite a nota da AC3: ");
		no3 = sc.nextDouble();
		System.out.println("Digite a nota da AC4: ");
		no4 = sc.nextDouble();
		// Calculando a o valor real de cada prova
		no1 = no1 * 1.5;
		no2 = no2 * 3.0;
		no3 = no3 * 1.0;
		no4 = no4 * 4.5;
		med = (no1 + no2 + no3 + no4) / 10;

		if (med >= 5) {
			// se for maior ou igual a 5, aprovado!
			System.out.printf("Parabéns, você foi aprovado(a)! \nMédia %.1f", med);
		} else {
			// se for menor, reprovado!
			System.out.println("Reprovado!");
		}

		sc.close();
	}

}
