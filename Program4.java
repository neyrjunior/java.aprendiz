package main;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class Program4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		double number2;
		ArrayList<Double> number = new ArrayList<Double>();
		
		Double y = Double.valueOf(9);
		
		number.add(y);
		number.add(2.0);
		number.add(5.0);
		number.add(1.0);
		number.add(3.0);
		number.add(4.0);
		number.add(9.0);
		number.add(7.0);
		number.add(8.0);
		number.add(10.0);
		number.add(6.0);
		
		System.out.print("Digite o numero que voce deseja encontra: ");
		number2 = sc.nextDouble();
		
		boolean aux = number.contains(number2);
		
		if(aux == true) {
			System.out.println("O numero "+number2+" está na posição: "+ number.indexOf(number2));
		}else {
			System.out.println("O numero "+number2+" não foi encontrado");
		}
		
		ArrayList<String> color = new ArrayList<String>();
		
		String s = String.valueOf("");
		
		
		for(int i = 0; i < 5; i++) {
			System.out.print("Digite uma cor: ");
			String auxi = sc.next();
			color.add(auxi);
		}
		System.out.print(color);
		
		System.out.println();
		
		Collections.sort(color);
		StringBuilder resultColor = new StringBuilder();
		
		for(String obj: color) {
			resultColor.append(obj).append("\n");
		}
		System.out.println(resultColor.toString());
		
		//3
		
		Set<Double> setNumber = new  HashSet<Double>();
		
		for(int i = 0; i < 10; i++) {
			System.out.print("Digite um numro: ");
			double assist = sc.nextDouble();
			if(setNumber.contains(assist)) {
				System.out.print("Digite um numero que já não tenha sido inserido: ");
				assist = sc.nextDouble();
			}
			setNumber.add(assist);
		}
		
		System.out.println(setNumber);
		
		//4
		
		Set<Double> setNumber2 = new HashSet<Double>();
		
		setNumber2.add(1.0);
		setNumber2.add(2.0);
		setNumber2.add(3.0);
		setNumber2.add(4.0);
		setNumber2.add(5.0);
		setNumber2.add(6.0);
		setNumber2.add(7.0);
		setNumber2.add(8.0);
		setNumber2.add(9.0);
		setNumber2.add(10.0);
		
		System.out.print("Digite o numero que deseja encontrar: ");
		double auxi = sc.nextDouble();
		
		
		
		if(setNumber2.contains(auxi)) {
			System.out.println("Numero encontrado!");
		}else {
			System.out.println("Numero não encontrado!");
		}
		
		
		sc.close();
	}

}
