package main;
import java.util.Iterator;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//1
		int number1;
		int number2;
		
		System.out.print("Digite o primeiro valor: ");
		number1 =  sc.nextInt();
		System.out.print("Digite o segundo numero: ");
		number2 = sc.nextInt();
		
		if(number1 < number2) {
			System.out.println("Ok vamos lá");
			for(int i = number1; i <= number2; i++) {
				if((i % 3 == 0) && (i % 5 == 0)) {
					System.out.println("O valor " + i + " é multiplo de '3' e '5'" );
				}
			}
			
		}else {
			System.out.println("ERROR!! O primeiro numero deve ser menor que o segundo ");
		}
		//2
		int pair = 0;
		int odd = 0;
		int helper;
		
		for(int i = 0; i < 10; i++) {
			System.out.print("Digite um numero inteiro qualquer: ");
			helper = sc.nextInt();
			if(helper % 2 == 0) {
				pair = pair + 1; 
			}else {
				odd = odd + 1;
			}
		}
		System.out.print("Dos numeros digitados, " + pair + " são pares e, " + odd + " são impares");

		
		sc.close();
	}

}
