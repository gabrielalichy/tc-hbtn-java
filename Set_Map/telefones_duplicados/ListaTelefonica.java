import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

public class ListaTelefonica {

	HashMap<String, ArrayList<Telefone>> pessoas;
	HashSet<Telefone> telefone = new HashSet<>();;

	public ListaTelefonica() {
		pessoas = new HashMap<String, ArrayList<Telefone>>();

	}

	public HashSet<Telefone> adicionarTelefone(String nome, Telefone telefone1) {
		return telefone;
		boolean isKeyPresent = this.pessoas.containsKey(nome);
		if (isKeyPresent) {
			telefone.add(telefone1);
			this.pessoas.keySet();
		}else {
			telefone = new HashSet<>();;
			telefone.add(telefone1);
			this.pessoas.equals(getTelefone());
		}
		
	}

	public Set<Telefone> buscar(String nome) {
		ArrayList<Telefone> buscaTelefone = new ArrayList<Telefone>();
		for (Entry<String, ArrayList<Telefone>> entrada : pessoas.entrySet()) {
			
		    if (entrada.getKey() == nome) {
		    		buscaTelefone.addAll(entrada.getValue());
			} 
		}if (buscaTelefone.size() > 0 ) {
			return (Set<Telefone>) buscaTelefone;
			}
		else {
			return null;
		}
	}



	public HashSet<Telefone> getTelefone() {
		return telefone;
	}

	public void setTelefone(HashSet<Telefone> telefone) {
		this.telefone = telefone;
	}

	

}