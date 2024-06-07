package main;
import java.util.Scanner;
public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		
	 float wage;
	 float allowance;
	 float newWage;
	 
	 System.out.println("Digite o salário");
	 wage = sc.nextFloat();
	 System.out.println("Digite o abono");
	 allowance = sc.nextFloat();
	 
	 newWage = wage + allowance;
	 
	 System.out.println("Novo salário: " + newWage);
	 
	 
		float note1;
		float note2;
		float note3;
		float note4;
		float average;
		
		System.out.println("Digite a primeira nota");
		note1 = sc.nextFloat();
		System.out.println("Digite a segunda nota");
		note2 = sc.nextFloat();
		System.out.println("Digite a terceira nota");
		note3 = sc.nextFloat();
		System.out.println("Digite a quarta nota");
		note4 = sc.nextFloat();
		
		average = (note1 + note2 + note3 + note4) / 4;
		
		System.out.println("Sua média é: " + average);
		
	 
		
		float grossSalary;
		float netSalary;
		float discount;
		float extraHour;
		float nightTime;
		
		System.out.println("Digite o valor do salário bruto");
		grossSalary = sc.nextFloat();
		System.out.println("Digite o valor do adicional noturno");
		nightTime = sc.nextFloat();
		System.out.println("Digite o valor dos descontos");
		discount = sc.nextFloat();
		System.out.println("Digie o valor das horas extras");
		extraHour = sc.nextFloat();
		
		netSalary = (grossSalary + nightTime + (extraHour * 5)) - discount;
		
		System.out.println("O salário liquido é: " + netSalary);
		
	 
		 	float n1;
		 	float n2;
		 	float n3;
		 	float n4;
		 	float difference;
		 	
		 	System.out.println("DIgite o valor de 'n1' ");
		 	n1 = sc.nextFloat();
		 	System.out.println("Digite o valor de 'n2' ");
		 	n2 = sc.nextFloat();
		 	System.out.println("Digite o valor de 'n3'");
		 	n3 = sc.nextFloat();
		 	System.out.println("Digite o valor de 'n4'");
		 	n4 = sc.nextFloat();
		 	
		 	difference = ((n1*n2)-(n3 * n4));
		 	
		 	System.out.println("A differença é: " + difference);
		
	 sc.close();
	}

}
