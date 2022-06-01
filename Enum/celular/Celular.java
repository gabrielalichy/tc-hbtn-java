import java.util.ArrayList;

public class Celular {

	private ArrayList<Contato> contato = new ArrayList<Contato>();
	
	private boolean jaexiste = false;

	private Integer obterPosicaoContato(String nomeContato) {
		for (int i = 0; i < contato.size(); i++) {
			if (contato.get(i).getNome().equals(nomeContato)) {
				return i;
			}
		}
		return -1;
	}

	public void adicionarContato(Contato addContato) {

		Integer retorno = obterPosicaoContato(addContato.getNome());

		if (retorno > -1) {
			throw new IllegalArgumentException(
					"Nao foi possivel adicionar contato. Contato jah existente com esse nome");
		} else {
			this.contato.add(addContato);
		}
	}

	public void atualizarContato(Contato contatoAntigo, Contato novoContato) {
		
		Integer retorno = obterPosicaoContato(contatoAntigo.getNome());
		Integer retornoNovo = obterPosicaoContato(novoContato.getNome());
		if (retorno <= -1) {
			jaexiste = true;
			throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato nao existe");
			
		}
		if (retornoNovo > -1 && jaexiste == true) {
			throw new IllegalArgumentException(
					"Nao foi possivel adicionar contato. Contato jah existente com esse nome");
		}

		if (retorno > -1) {
			for (int i = 0; i < this.contato.size(); i++) {
				if (contato.get(i).nome.equals(novoContato.getNome())) {
					contato.set(i, novoContato);

				}
			}
		}
		
	}

	public void removerContato(Contato contato) {

		Integer retorno = obterPosicaoContato(contato.getNome());

		if (retorno <= -1) {
			throw new IllegalArgumentException("Nao foi possivel remover contato. Contato nao existe");
		} else {
			for (int i = 0; i < this.contato.size(); i++) {
				this.contato.remove(i);
			}
		}

	}

	public void listarContatos() {
		for (Contato contato2 : this.contato) {
			System.out.println(contato2.getNome() + " -> " + contato2.getNumero() + " (" + contato2.getTipo() + ")");
		}

	}
}