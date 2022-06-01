import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.DefaultRowSorter;

public class Celular {

	private ArrayList<Contato> contato;

	private Integer obterPosicaoContato(String nomeContato) {
		for (int i = 0; i < contato.size(); i++) {
			if (contato.get(i).getNome().equals(nomeContato)) {
				return i;
			}

		}

		return -1;

	}

	public void adicionarContato(String addContato) {

		Integer retorno = obterPosicaoContato(addContato);

		if (retorno > -1) {
			try {
				throw new Exception();
			} catch (Exception e) {
				System.out.println("Nao foi possivel adicionar contato. Contato jah existente com esse nome.");
			}
		}

	}

	public void atualizarContato( Contato contatoAntigo, Contato novoContato) {
			
			Integer retorno = obterPosicaoContato(contatoAntigo.getNome());

			if (retorno > -1) {
				try {
					throw new Exception();
				} catch (Exception e) {
					System.out.println("Nao foi possivel modificar contato. Contato nao existe.");
				}
		}else {
			
		}
			Integer novoRetorno = obterPosicaoContato(novoContato.getNome());
			
			if (novoRetorno > -1) {
				try {
					throw new Exception();
				} catch (Exception e) {
					System.out.println("Nao foi possivel modificar contato. Contato jah existente com esse nome.");
				}
				
		}

	public void removerContato(Contato contato) {

		Integer retorno = obterPosicaoContato(contato.getNome());

		if (retorno > -1) {
			try {
				throw new Exception();
			} catch (Exception e) {
				System.out.println("Nao foi possivel remover contato. Contato nao existe.");
			}
		} else {
			for (int i = 0; i < this.contato.size(); i++) {
				this.contato.remove(i);
			}
		}

	}
	
	public void listarContatos() {
		for (Contato contato2 : contato) {
			
		}
	
	
	
	}
}