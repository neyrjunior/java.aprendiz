package main;
import java.util.Stack;
import java.util.Scanner;

public class Program4_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<String> book = new Stack<>();
		int next;
		
		while(true) {
			System.out.println();
			System.out.println("1. Adicionar livro");
			System.out.println("2. listar livros");
			System.out.println("3. Retirar livro da pilha");
			System.out.println("0. Sair");
			System.out.println();
			System.out.print("Digite a opção desejada: ");
			next = sc.nextInt();
			sc.nextLine();
			
			if(next == 1) {
				System.out.print("Digite o nome do livro: ");
				String name = sc.nextLine();
				book.push(name);
				System.out.println(name+" foi adicionado");
				continue;
			}
			if(next == 2) {
				if(book.isEmpty()) {
					System.out.println("A pilha ta vazia");
				}else {
					System.out.println("A pilha é "+book);
				}
			}
			if(next == 3) {
				if(book.isEmpty()) {
					System.out.println("A pilha está vazia");
				}else {
					book.pop();
				}
			}
			if(next == 0) {
				sc.close();
				return;
			}
		}

		
	
	}

}
