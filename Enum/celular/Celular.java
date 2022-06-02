import java.util.ArrayList;

public class Celular {

	private ArrayList<Contato> contatos = new ArrayList();
	private boolean jaexiste = false;

	private Integer obterPosicaoContato(String nomeContato) {
		for (int i = 0; i < contatos.size(); i++) {
			if (contatos.get(i).getNome().equals(nomeContato)) {
				return i;
			}
		}
		return -1;
	}

	public void adicionarContato(Contato addContato) {

		Integer retorno = obterPosicaoContato(addContato.getNome());

		if (retorno > -1) {
			throw new IllegalArgumentException(
					"Nao foi possivel adicionar contato. Contato jah existente com esse nome.");
		} else {
			this.contatos.add(addContato);
		}
	}

	public void atualizarContato(Contato contatoAntigo, Contato novoContato) {
		
		Integer retorno = obterPosicaoContato(contatoAntigo.getNome());
		Integer retornoNovo = obterPosicaoContato(novoContato.getNome());
		if (retorno <= -1) {
			jaexiste = true;
			throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato nao existe.");
			
		}
		if (retornoNovo > -1 && jaexiste == true) {
			throw new IllegalArgumentException(
					"Nao foi possivel modificar contato. Contato jah existente com esse nome.");
		}

		if (retorno > -1) {
			for (int i = 0; i < this.contatos.size(); i++) {
				if (contatos.get(i).nome.equals(novoContato.getNome())) {
					contatos.set(i, novoContato);

				}
			}
		}
		
	}

	public void removerContato(Contato contato) {

		Integer retorno = obterPosicaoContato(contato.getNome());

		if (retorno <= -1) {
			throw new IllegalArgumentException("Nao foi possivel remover contato. Contato nao existe.");
		} else {
			for (int i = 0; i < this.contatos.size(); i++) {
				this.contatos.remove(i);
			}
		}

	}

	public void listarContatos() {
		for (Contato contato2 : this.contatos) {
			System.out.println(contato2.getNome() + " -> " + contato2.getNumero() + "(" + contato2.getTipo() + ")");
		}

	}
}