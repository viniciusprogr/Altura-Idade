package alturas;

import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantas pessoas serao digitadas:");
		int n = sc.nextInt();

		String[] nome = new String[n];
		int[] idade = new int[n];
		double[] altura = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.println("dados da " + (i + 1) + "a pessoa:");
			System.out.println("nome: ");
			nome[i] = sc.next();
			System.out.println("idade: ");
			idade[i] = sc.nextInt();
			System.out.println("altura:");
			altura[i] = sc.nextDouble();
		}

		double soma = 0.0;
		for (int i = 0; i < n; i++) {
			soma += altura[i];
		}
		double mediaAltura = soma / n;
		System.out.println("autura media: " + mediaAltura);

		int cont = 0;
		for (int i = 0; i < n; i++) {
			if (idade[i] < 16) {
				cont = cont + 1;
			}
		}
		double porcentagem = cont * 100.0 / n;
		System.out.printf("pessoas com menos de 16 anos: %.1f" , porcentagem ,"%" );
		
		for (int i = 0; i < n; i++) {
			if (idade[i] < 16) {
				System.out.println("");
				System.out.println(nome[i]);
			}
		}
		
		sc.close();
	}

}
