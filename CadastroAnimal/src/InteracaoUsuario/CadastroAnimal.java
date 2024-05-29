package InteracaoUsuario;

import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import entidade.Cachorro;
import entidade.Cobra;

public class CadastroAnimal {

	public Cobra cadastroCobra() {

		Cobra animalCobra = new Cobra();

		animalCobra.setNome(JOptionPane.showInputDialog("Digite o Nome: "));
		animalCobra.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a Idade: ")));
		animalCobra.setQtdPeso(Double.parseDouble(JOptionPane.showInputDialog("Digite o Peso: ")));
		animalCobra.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Digite o Preco: ")));
		animalCobra.setTipoVeneno(JOptionPane.showInputDialog("Digite o Tipo de Veneno: "));
		
		return animalCobra;
	}

	public Cachorro cadastroCachorro() {

		Cachorro animalCachorro = new Cachorro();

		animalCachorro.setNome(JOptionPane.showInputDialog("Digite o Nome: "));
		animalCachorro.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a Idade: ")));
		animalCachorro.setQtdPeso(Double.parseDouble(JOptionPane.showInputDialog("Digite o Peso: ")));
		animalCachorro.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Digite o Preco: ")));
		animalCachorro.setCorPelo(JOptionPane.showInputDialog("Digite a Cor de Pelo: "));

		return animalCachorro;

	}

	public void imprimirCobra(List<Cobra> listaCobras) {

		StringBuilder impressaoCobraString = new StringBuilder();

		for (Cobra cobraItemLista : listaCobras) {
			impressaoCobraString.append("Nome: ").append(cobraItemLista.getNome()).append("\n").append("Idade: ")
								.append(cobraItemLista.getIdade()).append("\n").append("Peso: ").append(cobraItemLista.getQtdPeso())
								.append("\n").append("Preco: ").append(cobraItemLista.getPreco()).append("\n")
								.append("Tipo de Veneno: ").append(cobraItemLista.getTipoVeneno()).append("\n");

		}
		JOptionPane.showMessageDialog(null, impressaoCobraString.toString());
	}

	public void imprimirCachorro(List<Cachorro> listaCachorro) {

		StringBuilder impressaoCachorroString = new StringBuilder();
		{

			for (Cachorro cachorroItemLista : listaCachorro) {
				impressaoCachorroString.append("Nome: ").append(cachorroItemLista.getNome()).append("\n")
						.append("Idade: ").append(cachorroItemLista.getIdade()).append("\n").append("Peso: ")
						.append(cachorroItemLista.getQtdPeso()).append("\n").append("Preco: ")
						.append(cachorroItemLista.getPreco()).append("\n").append("Tipo de Veneno: ")
						.append(cachorroItemLista.getCorPelo()).append("\n");
			}
			JOptionPane.showMessageDialog(null, impressaoCachorroString.toString());
		}

	}
}
