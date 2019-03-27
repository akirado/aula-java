package aulas;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {
		
		List<String> obj = new ArrayList<>();
		
		obj.add("Jorge");
		obj.add("Maruticio");
		obj.add("James");
		obj.add("Maria");
		obj.add("Keito");
		
		for(String x : obj) {
			System.out.println(x);
		}
		
		System.out.println("____________________________");
		
		obj.remove("Jorge");
		for(String x : obj) {
			System.out.println(x);
		}
		
		System.out.println(obj.size());		
		System.out.println(obj.indexOf("Keito"));
		
		
	}

}
