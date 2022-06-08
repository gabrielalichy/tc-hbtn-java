
public class Midia {
	public String nome;

	public Midia(String livro) {
		this.nome = livro;
	}

	@Override
	public String toString() {
		return String.format("Tipo: %s - Nome: %s", this.getClass().getName(), getNome());
	}

	public String getNome() {
		return nome;
	}
}
