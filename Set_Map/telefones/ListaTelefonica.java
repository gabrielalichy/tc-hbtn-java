import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class ListaTelefonica {

	HashMap<String, ArrayList<Telefone>> pessoas;
	ArrayList<Telefone> telefone = new ArrayList<>();;

	public ListaTelefonica() {
		pessoas = new HashMap<String, ArrayList<Telefone>>();

	}

	public void adicionarTelefone(String nome, Telefone telefone1) {

		boolean isKeyPresent = this.pessoas.containsKey(nome);
		if (isKeyPresent) {
			telefone.add(telefone1);
			this.pessoas.put(nome,  telefone);
		}else {
			telefone = new ArrayList<>();;
			telefone.add(telefone1);
			this.pessoas.put(nome,  telefone);
		}
		
	}

	public ArrayList<Telefone> buscar(String nome) {
		ArrayList<Telefone> buscaTelefone = new ArrayList<Telefone>();
		for (Entry<String, ArrayList<Telefone>> entrada : pessoas.entrySet()) {
			
		    if (entrada.getKey() == nome) {
		    		buscaTelefone.addAll(entrada.getValue());
			} 
		}if (buscaTelefone.size() > 0 ) {
			return buscaTelefone;
			}
		else {
			return null;
		}
	}



	public ArrayList<Telefone> getTelefone() {
		return telefone;
	}

	public void setTelefone(ArrayList<Telefone> telefone) {
		this.telefone = telefone;
	}

	

}