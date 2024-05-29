package InteracaoUsuario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import entidade.Cachorro;
import entidade.Cobra;

public class Menu {
	
	public void menuInicial() {
		
		CadastroAnimal cadastroAnimal = new CadastroAnimal();
		Cobra cobraParaAddNaLista = new Cobra();
		Cachorro cachorroParaAddNaLista = new Cachorro();
		List<Cobra> cobraLista = new ArrayList<Cobra>();
		List<Cachorro> cachorroLista = new ArrayList<Cachorro>();
		
		int opcao;
		
		boolean menuResultado = true;
		
		while(menuResultado) {
			
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para Cobra " + "\n"
							+ "Digite 2 para Cachorro"	+ "\n"
							+ "Digite 3 para Listar as Cobras"	+ "\n"
							+ "Digite 4 para Listar os Cachorros"	+ "\n"
							+ "Digite 5 para Encerrar"	+ "\n"
						));
			
			switch (opcao) {
			
			case 1: {
				cobraParaAddNaLista = cadastroAnimal.cadastroCobra();
				cobraLista.add(cobraParaAddNaLista);
				break;
			}
			
			case 2 : {
				cachorroParaAddNaLista = cadastroAnimal.cadastroCachorro();
				cachorroLista.add(cachorroParaAddNaLista);
				break;
			}
			
			case 3 : {
				cadastroAnimal.imprimirCobra(cobraLista);
				break;
			}
			
			case 4 : {
				cadastroAnimal.imprimirCachorro(cachorroLista);
				break;
			}
			case 5 : {
				System.exit(0);
				break;
			}
			default: 
				JOptionPane.showMessageDialog(null, "Insira 1, 2 ,3, 4 ou 5");
				break;
			}
		}

		
	}

}
