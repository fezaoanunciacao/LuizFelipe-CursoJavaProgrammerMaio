package cadastroAnimall;

import java.util.Scanner;

import entidade.Animal;

public class CadastroAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal objetoAnimal = new Animal(); // cria objeto
		Scanner entradaDados = new Scanner(System.in);
		System.out.println("Infome o nome do Animal");
		objetoAnimal.nome = entradaDados.next();
		System.out.println("Infome a idade do Animal");
		objetoAnimal.idade = Integer.parseInt (entradaDados.next());
		System.out.println("Infome o peso do Animal");
		objetoAnimal.qtdPeso = Integer.parseInt (entradaDados.next());
		
		objetoAnimal.preco = calcularPreco(objetoAnimal.qtdPeso);
		
		imprimirResultadoNoConsole(objetoAnimal);
	}
	
	public static void imprimirResultadoNoConsole(Animal animal) {
		System.out.println("Nome do Animal"  + animal.nome);
		System.out.println("Idade Animal"  + animal.idade);
		System.out.println("Peso Animal"  + animal.qtdPeso);
		System.out.println("Preco Animal"  + animal.preco);
		
	}
	
	public static Double calcularPreco(double qtdPeso){
		double preco = qtdPeso * 50;
		return preco ;
	}

}
