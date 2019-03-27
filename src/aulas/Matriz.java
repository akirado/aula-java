package aulas;

import java.util.Random;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int n = sc.nextInt();
		int [][] mat = new int[n][n];
		Random r = new Random();
		int aux=0;
		
		for (int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				mat[i][j] = r.nextInt((50) - 10);
				System.out.print(mat[i][j]+ "       ");
			}
			System.out.println();
		}
		
		System.out.println("_____________________________________________");
		
		for (int i = 0; i < n ; i++) {
			System.out.println(mat[i][aux]);
			aux++;
		}
		
		sc.close();
	}

}
