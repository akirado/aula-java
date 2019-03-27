package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		int aux;
		aux = menu2();
		if (aux == 1) {
		System.out.println("Digite o numero da conta: ");
		int num = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite o nome do titular: ");
		String name = sc.nextLine();
		System.out.println("Digite o valor do deposito inicial: ");
		double val = sc.nextDouble();		
		Conta conta = new Conta(num, name, val);
		
		do {
		aux = menu1();
		if (aux == 1) {
			System.out.println("Saldo: " + conta.getValor());
		}
		
		if (aux == 2) {
			System.out.println("Digite o valor que deseja sacar: ");
			double valor = sc.nextDouble();
			conta.saque(valor);
			System.out.println(conta);
		}
		if (aux == 3) {
			System.out.println("Digite o valor do deposito: ");
			double valor = sc.nextDouble();
			conta.deposito(valor);
			System.out.println(conta);
		}
		
		if (aux == 4) {
			System.out.println("Digite o novo nome: ");
			String name2 = sc.next();
			conta.setNome(name2);			
		}
		
			}while(aux != 0);
				
		}
		
		sc.close();

	}
	
	public static int menu2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite 1 para abrir uma nova conta ou 0 para sair..");
		int aux = sc.nextInt();
		sc.close();
		return aux;		
	}

	public static int menu1() {
		Scanner sc = new Scanner(System.in);
		System.out.printf(
				"Digite:\n 1 - Consultar saldo \n 2 - Realizar um saque \n 3 - Realizar um deposito \n 4 - Trocar de nome \n ou 0 para sair..");
		int aux = sc.nextInt();
		sc.close();
		return aux;
	}

}
