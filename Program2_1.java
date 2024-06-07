package main;

import java.util.Scanner;

public class Program2_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 3
		int lower = 0;
		int upper = 0;
		int age;

		System.out.print("Digite uma idade: ");
		age = sc.nextInt();

		while (age >= 0) {
			if (age < 21) {
				lower = lower + 1;
			} else if (age > 50) {
				upper = upper + 1;
			}
			System.out.print("Digite outra idade: ");
			age = sc.nextInt();
		}
		System.out.println("O total de pessoas menores de '21' é " + lower + " e de maiores de 50 é " + upper);
		
		//4
		
		int age2;
		float age3 = 0;
		int gender;
		int dev;
		int all = 0;
		int allBack = 0;
		int mtFront = 0;
		int htMob = 0;
		int nbFull = 0;
		int reset = 1;
		int next;

		while (reset == 1) {
			all = all + 1;

			System.out.print("Qual sua idade? ");
			age2 = sc.nextInt();
			System.out.println("Qual seu genero? (escolha de 1 à 5)");
			System.out.println("1. Mulher Cis");
			System.out.println("2. Homem Cis");
			System.out.println("3. Não binário");
			System.out.println("4. Mulher Trans");
			System.out.println("5. Homem Trans");
			gender = sc.nextInt();
			System.out.println("Qual tipo de Dev voce é? (escolha de 1 à 4)");
			System.out.println("1. BackEnd");
			System.out.println("2. FrontEnd");
			System.out.println("3. Mobile");
			System.out.println("4. FullStack");
			dev = sc.nextInt();

			age3 = (age3 + age2) / all;

			if (dev == 1) {
				allBack = allBack + 1;
			} else if ((gender == 1 || gender == 4) && (dev == 2)) {
				mtFront = mtFront + 1;
			} else if ((gender == 2 || gender == 5) && (dev == 3) && (age2 > 40)) {
				htMob = htMob + 1;
			} else if ((gender == 3) && (dev == 4) && (age2 < 30)) {
				nbFull = nbFull + 1;
			}

			System.out.print("Deseja saber as informações? (1 = Sim / 2 = Não): ");
			next = sc.nextInt();

			switch (next) {

			case 1: {
				System.out.println("O total de Dev's BackEnd é: " + allBack);
				System.out.println("O total de mulher cis e tras FrontEnd é: " + mtFront);
				System.out.println("O total de homem cis e trans, dev Mobile, acima do 40 é: " + htMob);
				System.out.println("O total de pessoas não-binarias, dev FullStack é: " + nbFull);
				System.out.println("O total de respostas a essa pesquisa é: " + all);
				System.out.println("A média de idade dos participantes é: " + age3);
				System.out.println("O total de participantes é: "+all);
				System.out.println("\n Obrigado pela participação");
				break;
			}
			case 2: {
				System.out.println("Obrigado pela participação");
				break;
			}default:
				System.out.println("ERROR! Opção invalida!");
			}
			System.out.print("Deseja continuar a pesquisa? (1 = Sim / 2 = Não): ");
			reset = sc.nextInt();
		}
		System.out.println("O total de Dev's BackEnd é: " + allBack);
		System.out.println("O total de mulher cis e tras FrontEnd é: " + mtFront);
		System.out.println("O total de homem cis e trans, dev Mobile, acima do 40 é: " + htMob);
		System.out.println("O total de pessoas não-binarias, dev FullStack é: " + nbFull);
		System.out.println("O total de respostas a essa pesquisa é: " + all);
		System.out.println("A média de idade dos participantes é: " + age3);
		System.out.println("O total de pessoas que participaram é: "+all);
		System.out.println("Obrigado pela participação");
	

		sc.close();
	}

}
