package entities;

public class Funcionarios {
	private Integer id;
	private String name;
	private Double salario;
	
	public Funcionarios(Integer id, String name, Double salario) {
		this.id = id;
		this.name = name;
		this.salario = salario;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public Double getSalario() {
		return salario;
	}
	public void aumentaSalario (double porcento) {
		salario+=salario *(porcento/100); 
	}
	
	//Override
	
	public String toString() {
		return id + ", " + name + ", " + String.format("%.2f", salario);
	}
	
	
	
	
	
	
}
