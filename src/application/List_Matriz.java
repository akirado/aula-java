package application;

import java.util.Locale;
import java.util.Scanner;

public class List_Matriz {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a quantidade de linhas da matriz: ");
		int m = sc.nextInt();
		System.out.print("Digite a quantidade de colunas: ");
		int n = sc.nextInt();
		
		int [][] mat = new int[m][n];
		
		for (int i = 0; i<m; i++) {
			for (int j = 0; j<n; j++) {
				mat [i][j] = sc.nextInt();
			}
		}
		
		System.out.print("Digite o numero que deseja verificar: ");
		for (int i = 0; i<m; i++) {
			for(int j = 0; j<n; j++) {
				System.out.println("Position " + i + "," + j + ":");

				if (j > 0) {

					System.out.println("Left: " + mat[i][j-1]);

				}

				if (i > 0) {

					System.out.println("Up: " + mat[i-1][j]);

				}

				if (j < mat[i].length-1) {

					System.out.println("Right: " + mat[i][j+1]);

				}

				if (i < mat.length-1) {

					System.out.println("Down: " + mat[i+1][j]);

				}
			}
		}
		sc.close();
		

	}

}
