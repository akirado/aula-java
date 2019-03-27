package entities;

public class Conta {
	private int nConta;
	private String nome;
	private double valor;

	public Conta(int nConta, String nome, double valorInicial) {
		this.nConta = nConta;
		this.nome = nome;
		deposito(valorInicial);
	}

	public Conta(int nConta, String nome) {
		this.nConta = nConta;
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public int getnConta() {
		return nConta;
	}

	public void deposito(double valor) {
		this.valor += valor;
	}

	public void saque(double valor) {
		this.valor = this.valor - valor - 5.00;
	}

	public String toString() {
		return "Dados da Conta: " + "Conta: " + nConta + ", " + "Nome: " + nome + ", " + "Saldo: " + "$" + valor;
	}
}
