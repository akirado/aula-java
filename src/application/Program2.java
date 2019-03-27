package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluguel;

public class Program2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		int room, qtd;
		String name, email;
		Aluguel[] vet = new Aluguel [10];
		
		System.out.println("Digite o numero do quartos que voce deseja reservar: ");
		qtd = sc.nextInt();
		
		for (int i = 0; i < qtd; i++) {
			System.out.println("Digite o numero do quarto que deseja hospedar: ");
			room = sc.nextInt();
			sc.nextLine();
			System.out.println("Digite o nome: ");
			name = sc.nextLine();
			System.out.println("Digite o email:");
			email = sc.nextLine();
			
			vet[room] = new Aluguel(name, email, room);
			
		}
		
		System.out.printf("%n%nQuartos ocupados: %n%n");
		
		for(int i=0; i<vet.length; i++) {
			if (vet[i] != null) {
				System.out.println(vet[i]);
			}
			else continue;
		}
		
		sc.close();
	}

}
