package main;

public class Program3_1 {

	public static void main(String[] args) {
		int[][] matriz = {{1,2,3},{4,5,6},{7,8,9}};
		int sum = 0;
		for(int row = 0; row < matriz.length; row++ ) {
			for(int collum = 0; collum < matriz.length; collum++) {
				System.out.print(matriz[row][collum]+" ");
				sum = sum + matriz[row][collum];
			}
		}
		System.out.println("\n Diagonal principal: "+matriz[0][0]+" "+matriz[1][1]+" "+matriz[2][2]);
		System.out.println("Diagonal secundaria: "+matriz[0][2]+" "+matriz[1][1]+" "+matriz[2][1]);
		System.out.println("A soma de todos é: "+sum);
	}

}
