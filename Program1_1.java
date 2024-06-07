package main;

import java.util.Scanner;

public class Program1_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 5

		int code;
		int amount;
		float value;
		float price;

		System.out.println("1. Cachorro Quente - R$ = 10,00");
		System.out.println("2. X-Salada - R$ = 15,00 ");
		System.out.println("3. X-Bacon  - R$ = 18,00 ");
		System.out.println("4. Bauru  - R$ = 12,00 ");
		System.out.println("5. Refrigerante  - R$ = 8,00 ");
		System.out.println("6. Suco de Laranja  - R$ = 13,00 \n");

		System.out.print("DIgite o codigo do produto que você deseja: ");
		code = sc.nextInt();
		System.out.print("DIgite a quantidade desse produto: ");
		amount = sc.nextInt();

		switch (code) {
		case 1: {
			price = 10.00f;
			value = price * amount;
			System.out.printf("O valor total é R$: %.2f o(s) Cachorro(s) Quente", value);
			break;
		}
		case 2: {
			price = 15.00f;
			value = price * amount;
			System.out.printf("O valor total é R$: %.2f o(s) X-Salada(s)", value);
			break;
		}
		case 3: {
			price = 18.00f;
			value = price * amount;
			System.out.printf("O valor total é R$: %.2f o(s) X-Bacon(s)", value);
			break;
		}
		case 4: {
			price = 12.00f;
			value = price * amount;
			System.out.printf("O valor total é R$: %.2f o(s) Bauru(s)", value);
			break;
		}
		case 5: {
			price = 8.00f;
			value = price * amount;
			System.out.printf("O valor total é R$: %.2f o(s) Refrigerante(s)", value);
			break;
		}
		case 6: {
			price = 13.00f;
			value = price * amount;
			System.out.printf(" O valor total é R$: %.2f o(s) Suco(s) de Laranja", value);
			break;
		}
		default:
			System.out.println("Codigo " + code + " inválido ");
		}

		// 6

		String name;
		int function;
		float money;
		float helper;

		System.out.print("\nDigite seu nome: ");
		name = sc.next();
		System.out.println("Qual o seu cargo? (Escolha de 1 à 6)");
		System.out.println("1. Gerente");
		System.out.println("2. Vendedor");
		System.out.println("3. Supervisor");
		System.out.println("4. Motorista");
		System.out.println("5. Estoquista");
		System.out.println("6. Tecnico de TI");
		function = sc.nextInt();
		System.out.print("Digite seu salário: ");
		money = sc.nextFloat();

		switch (function) {

		case 1: {
			helper = (10 * money) / 100;
			money = money + helper;
			System.out.printf(name + ", Gerente, novo salário: %.2f", money);
			break;
		}
		case 2: {
			helper = (7 * money) / 100;
			money = money + helper;
			System.out.printf(name + ", Vendedor, novo salário: %.2f", money);
			break;
		}
		case 3: {
			helper = (9 * money) / 100;
			money = money + helper;
			System.out.printf(name + ", Supervisor, novo salário: %.2f", money);
			break;
		}
		case 4: {
			helper = (6 * money) / 100;
			money = money + helper;
			System.out.printf(name + ", Motorista, novo salário: %.2f", money);
			break;
		}
		case 5: {
			helper = (5 * money) / 100;
			money = money + helper;
			System.out.printf(name + ", Estoquista, novo salário: %.2f", money);
			break;
		}
		case 6: {
			helper = (8 * money) / 100;
			money = money + helper;
			System.out.printf(name + ", Tecnico de TI, novo salário: %.2f", money);
			break;
		}
		default:
			System.out.println("ERROR!! escolha uma profissão valida");
		}

		// 7

		float number1;
		float number2;
		int operation;
		float helper2;

		System.out.print("\nDigite um valor: ");
		number1 = sc.nextFloat();
		System.out.print("Digite outro valor: ");
		number2 = sc.nextFloat();

		System.out.println("Qual operação irá realizar? (escolha de 1 à 4)");
		System.out.println("1. Adição");
		System.out.println("2. Subtração");
		System.out.println("3. Multiplicação");
		System.out.println("4. Divisão");
		operation = sc.nextInt();

		switch (operation) {

		case 1: {
			helper2 = number1 + number2;
			System.out.printf("O resultado da operação é %.3f", helper2);
			break;
		}
		case 2: {
			helper2 = number1 - number2;
			System.out.printf("O resultado da operação é %.3f", helper2);
			break;
		}
		case 3: {
			helper2 = number1 * number2;
			System.out.printf("O resultado da operação é %.3f", helper2);
			break;
		}
		case 4: {
			helper2 = number1 / number2;
			System.out.printf("O resultado da operação é %.3f", helper2);
			break;
		}
		default:
			System.out.println("Digite uma operação valida!");
		}

		// 8

		float helper3;
		float balance = 1000.00f;
		int operation2;
		int end = 1;


		while (end == 1) {
			
			System.out.println("\nQual opção você deseja? (Escolha de 1 à 3)");
			System.out.println("1. Mostrar saldo");
			System.out.println("2. Realizar saque");
			System.out.println("3. Realizar depósito");
			operation2 = sc.nextInt();


			switch (operation2) {

			case 1: {
				System.out.printf("Seu saldo atual é: %.2f", balance);
				break;
			}
			case 2: {
				System.out.print("Quanto você deseja sacar? ");
				helper3 = sc.nextFloat();
				balance = balance - helper3;
				if (balance < 0) {
					System.out.println("Saldo insuficiente");
				}else {
					System.out.printf("Seu novo saldo é: %.2f", balance);
				}
				break;
			}
			case 3: {
				System.out.print("Quanto deseja depositar? ");
				helper3 = sc.nextFloat();
				balance = balance + helper3;
				System.out.printf("Seu novo saldo é: %.2f", balance);
				break;
			}
			default:
				System.out.println("Operação inválida!");
			}

			System.out.print("\nDeseja continuar? (Escolha 1 = Sim / 2 = Não): ");
			end = sc.nextInt();
		}

		sc.close();
	}

}
