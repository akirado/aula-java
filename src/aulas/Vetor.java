package aulas;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Vetor {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);		
		Scanner sc = new Scanner (System.in);		
		int n = sc.nextInt();
		
		Product[] product = new Product[n];
		
		for (int i=0; i<product.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();			
			product[i] = new Product(name, price);
		}
		
		double soma = 0;
		
		for (int i = 0; i <product.length; i++) {
			soma += product[i].getPrice();
		}
		
		double media = soma/product.length;
		
		System.out.printf("Media do preço: %.2f", media);
		
		
		sc.close();

	}

}
