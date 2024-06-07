package main;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 1

		int valueA;
		int valueB;
		int valueC;
		int sum;

		System.out.println("Digite um valor para 'A'");
		valueA = sc.nextInt();
		System.out.println("Digite um valor para 'B'");
		valueB = sc.nextInt();
		System.out.println("Digite um valor para 'C'");
		valueC = sc.nextInt();

		sum = valueA + valueB;

		if (sum > valueC) {
			System.out.println("A soma de 'A' e 'B' é maior que 'C'");
		} else if (sum == valueC) {
			System.out.println("A soma de 'A' e 'B' é igual a 'C'");
		} else {
			System.out.println("A soma de 'A' e 'B' é menor que 'C'");
		}

		// - 2

		int number;

		System.out.print("Digite um numero: ");
		number = sc.nextInt();

		if (number % 2 == 0) {
			System.out.println("O valor " + number + " é par");
		} else {
			System.out.println("O valor " + number + " impar");
		}
		if (number >= 0) {
			System.out.println("O valor é positivo");
		} else {
			System.out.println("O valor é negativo");
		}

		// - 3
		String name;
		int age;
		boolean first;

		System.out.print("Digite seu nome: ");
		name = sc.next();
		System.out.print("Digite sua idade: ");
		age = sc.nextInt();
		System.out.print("Primeira doação? (true/false)");
		first = sc.nextBoolean();

		if ((age >= 60) && (age <= 65) && (first == false)) {
			System.out.println("Olá " + name + ", você está apto a ser um doador");
		} else if ((age >= 60) && (age <= 65) && (first == true)) {
			System.out.println("Olá " + name + ", infelizmente você não está apto a ser um doador");
		} else if ((age >= 18) && (age <= 59)) {
			System.out.println("Olá " + name + ", você está apto a ser um doador");
		} else {
			System.out.println("Olá " + name + ", infelizmente você não esta apto a ser um doador");
		}

		// -4

		String type1;
		String type2;
		String type3;

		System.out.println("Escolha a primeira caracteristica: ");
		System.out.print("Vertebrado ou invertebrado: ");
		type1 = sc.next();

		if (type1.equalsIgnoreCase("vertebrado")) {
			System.out.print("Ave ou Mamifero: ");
			type2 = sc.next();
			if (type2.equalsIgnoreCase("ave")) {
				System.out.print("Carnivoro ou Onivoro: ");
				type3 = sc.next();
				if (type3.equalsIgnoreCase("carnivoro")) {
					System.out.println("Águia");
				} else if (type3.equalsIgnoreCase("onivoro")) {
					System.out.println("Pomba");
				}
			} else if (type2.equalsIgnoreCase("mamifero")) {
				System.out.print("Onivoro ou Herbivoro: ");
				type3 = sc.next();
				if (type3.equalsIgnoreCase("onivoro")) {
					System.out.println("Humano");
				} else if (type3.equalsIgnoreCase("herbivoro")) {
					System.out.println("Vaca");
				}
			}
		}
		if (type1.equalsIgnoreCase("invertebrado")) {
			System.out.print("Inseto ou Anelideo: ");
			type2 = sc.next();
			if (type2.equalsIgnoreCase("inseto")) {
				System.out.print("Hematofago ou Herbivoro: ");
				type3 = sc.next();
				if (type3.equalsIgnoreCase("hematofago")) {
					System.out.println("Pulga");
				} else if (type3.equalsIgnoreCase("herbivoro")) {
					System.out.println("Lagarta");
				}
			} else if (type2.equalsIgnoreCase("anelideo")) {
				System.out.print("Hematofago ou Onivoro: ");
				type3 = sc.next();

				if (type3.equalsIgnoreCase("hematofago")) {
					System.out.println("Sanguesuga");
				} else if (type3.equalsIgnoreCase("onivoro")) {
					System.out.println("Minhoca");
				}
			}
		}

		sc.close();
	}

}
