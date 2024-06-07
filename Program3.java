package main;

import java.util.Scanner;
import java.util.Arrays;

public class Program3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//1
			
		int[] array = {2,5,1,3,4,9,7,8,10,6};
		int number;

		System.out.print("Digite o numero que deseja encontrar: ");
		number = sc.nextInt();
		
		for(int i = 0; i < 10; i++) {
			if(array[i] == number) {
				System.out.printf("O numero %d esta localizado na posição %d",number,i);
			}
		}
		
		
		//2
		int[] array2 = {2,5,1,3,4,9,7,8,10,6};
		int pair = 0;
		int odd = 0;
		int sum = 0;
		
		for(int i = 0; i < array2.length; i++) {
			sum += array2[i];
		}
		sum = sum / 10;
		System.out.println("A média é: "+sum);
		
		
		
		

		sc.close();
	
	}

}
