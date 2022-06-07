import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;

public class ListaTelefonica {

	HashMap<String, HashSet<Telefone>> pessoas;
	HashSet<Telefone> telefone = new HashSet<>();

	public ListaTelefonica() {
		pessoas = new HashMap<String, HashSet<Telefone>>();

	}

	public HashSet<Telefone>  adicionarTelefone(String nome, Telefone telefone1) {

		boolean isKeyPresent = this.pessoas.containsKey(nome);
		HashSet<Telefone> teste =new HashSet<>();
		teste.add(telefone1);
		if (isKeyPresent) {
			for (Telefone t : telefone) {
			if (t.equals(telefone1)) {
				try {
					throw new Exception();
				} catch (Exception e) {
					System.out.println("Telefone jah existente para essa pessoa.");
					System.out.println("Telefone jah pertence a outra pessoa.");
					return telefone;
				}
			}
			Collection<HashSet<Telefone>> teste2 = this.pessoas.values(); 
			if (teste2.contains(telefone1)) {
				return telefone;
			}	
		}
				
			telefone.add(telefone1);
			this.pessoas.put(nome,  telefone);
	
	}
		else {
			telefone = new HashSet<>();
			telefone.add(telefone1);
			this.pessoas.put(nome,  telefone);
		}
		return telefone;
		
	}
	public HashSet<Telefone> buscar(String nome) {
		HashSet<Telefone> buscaTelefone = new HashSet<Telefone>();
		for (Entry<String,HashSet<Telefone> > entrada : pessoas.entrySet()) {
			
		    if (entrada.getKey() == nome) {
		    		buscaTelefone.addAll(entrada.getValue());
		    		return buscaTelefone;
			} 
		}if (buscaTelefone.size() > 0 ) {
			return buscaTelefone;
			}
		else {
			return null;
		}
	}


}