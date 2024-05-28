package entidade;

public abstract class Animal {
	
	private String nome;
	private int idade;
	private double qtdPeso;
	private double preco;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getQtdPeso() {
		return qtdPeso;
	}
	public void setQtdPeso(double qtdPeso) {
		this.qtdPeso = qtdPeso;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public Animal() {
	}

}