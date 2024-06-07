package main;

import java.util.Scanner;

public class Program2_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//5
		int positive = 0;
		int number;
		int assist;
		

		do {
			System.out.print("Digite um numero inteiro qualquer ou digite '0' para parar: ");
			number = sc.nextInt();
			if(number > 0) {
				assist = number + positive;
				positive = assist;
			}
		}while(number != 0);
		
		System.out.println("A soma dos numeros positivos é: "+positive);
		
		//6
		int number2;
		float average = 0f;
		int multiple = 0;
		int all = 0;
		
		do {
			System.out.print("Digite um numero inteiro qualquer, ou o '0' para parar: ");
			number2 = sc.nextInt();
			all = all + 1;
			
			average = (average + number2) / all;
			
			if(number2 % 3 == 0) {
				multiple = multiple + 1; 
			}
			System.out.println("A média de todos o numeros é "+average);
			System.out.println("Dentre eles existem "+multiple+" de '3'");
			
		}while(number2 != 0);
		
		sc.close();
	}

}
