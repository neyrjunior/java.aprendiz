package main;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Program4_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Queue<String> people = new LinkedList<String>();
		int next = 1;

		while (next != 0) {
			System.out.println();
			System.out.println("1. Adicionar cliente");
			System.out.println("2. Listar todos os clientes");
			System.out.println("3. Retirar cliente da fila");
			System.out.println("0. Sair");
			System.out.print("Digite a opção desejada: ");
			next = sc.nextInt();
			System.out.println();

			if (next == 1) {
				System.out.print("Digite o nome do cliente: ");
				String aux = sc.next();
				people.add(aux);
			} else if (next == 2) {
				if (people.isEmpty()) {
					System.out.println("A lista está vazia!");
				} else {
					System.out.println(people);
				}
			} else if (next == 3) {
				if (people.isEmpty()) {
					System.out.println("A lista está vazia!");
				} else {
					System.out.println("Retirando " + people.poll() + " 3..2..1.. ");
					System.out.println("Pronto!");
				}
			}

		}

		sc.close();
	}

}
