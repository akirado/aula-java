package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionarios;

public class List_Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Funcionarios> func = new ArrayList<>();
		
		System.out.println("Digite a quantidade de funcionarios: ");
		int reg = sc.nextInt();
		
		for (int i = 0; i < reg; i++) {
			System.out.println("Digite o ID do funcionario: ");
			int id = sc.nextInt();
			System.out.println("Digite o nome do funcionario: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Digite o salario: ");
			double salario = sc.nextDouble();
			func.add(new Funcionarios(id, name, salario));
		}
		
		System.out.println();
		System.out.println("Digite o ID do funcionario que recebera aumento: ");
		int id = sc.nextInt();
		
		Funcionarios aux = func.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		if (aux == null) {
			System.out.println("Funcionario inexistente!!!!!!! ");
		}
		else {
			System.out.println("Digite a porcentagem de aumento: ");
			double porcento = sc.nextDouble();
			aux.aumentaSalario(porcento);
		}
		
		System.out.println();
		System.out.println("Lista de Empregados: ");
		for (Funcionarios obj : func) {
			System.out.println(obj);
		}
		sc.close();
	}

}
