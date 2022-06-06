import java.util.ArrayList;
import java.util.HashMap;

public class ListaTelefonica {

	HashMap<String, Telefone> pessoas;
	ArrayList<Telefone> telefone;
	private HashMap nome;

	public ListaTelefonica() {
		this.nome = nome;
		pessoas = new HashMap<String, Telefone>();

	}

	public void adicionarTelefone(String nome, Telefone telefone1) {
		pessoas.put(nome, telefone1);

	}

	public ArrayList<Telefone> buscar(String nome) {
		ArrayList<Telefone> buscaTelefone = new ArrayList<Telefone>();
		for (String telefone : pessoas.keySet()) {
			System.out.println(telefone);
		}

		return telefone;
	}

	public HashMap<String, Telefone> getPessoas() {
		return pessoas;
	}

	public void setPessoas(HashMap<String, Telefone> pessoas) {
		this.pessoas = pessoas;
	}

	public ArrayList<Telefone> getTelefone() {
		return telefone;
	}

	public void setTelefone(ArrayList<Telefone> telefone) {
		this.telefone = telefone;
	}

	public HashMap getNome() {
		return nome;
	}

	public void setNome(HashMap nome) {
		this.nome = nome;
	}

}
