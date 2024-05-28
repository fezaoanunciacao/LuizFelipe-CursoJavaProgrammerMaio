package InteracaoUsuario;

import javax.swing.JOptionPane;

import entidade.Cobra;

public class CadastroAnimal {
	
	public void cadastroCobra() {	
		
		Cobra animalCobra = new Cobra();
		
		animalCobra.setNome(JOptionPane.showInputDialog("Digite o Nome: ")); 
		animalCobra.setIdade(Integer.parseInt( JOptionPane.showInputDialog("Digite a Idade: ")));
		animalCobra.setQtdPeso(Double.parseDouble(JOptionPane.showInputDialog("Digite o Peso: "))) ;
		animalCobra.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Digite o Preco: "))) ;
		animalCobra.setTipoVeneno(JOptionPane.showInputDialog("Digite o Tipo de Veneno: "));
		
		
		System.out.println("Nome: " + animalCobra.getNome());
		System.out.println("Idade: " + animalCobra.getIdade());
		System.out.println("Peso: " + animalCobra.getQtdPeso());
		System.out.println("Preco: " + animalCobra.getPreco());
		System.out.println("Tipo de Veneno: " + animalCobra.getTipoVeneno());
		
	}

}
