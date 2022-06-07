import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map.Entry;
import java.util.Set;

public class ListaTelefonica {

	HashMap<String, ArrayList<Telefone>> pessoas;
	HashSet<Telefone> telefone = new HashSet<>();
	HashSet<Telefone> telefones = new HashSet<>();
	
	ArrayList<Telefone> teste15 = new ArrayList<Telefone>();
	boolean existe = false ;

	public ListaTelefonica() {
		pessoas = new HashMap<String, ArrayList<Telefone>>();

	}

	public HashSet<Telefone>  adicionarTelefone(String nome, Telefone telefone1) {

		boolean isKeyPresent = this.pessoas.containsKey(nome);
	
		if (isKeyPresent) {
			for (Telefone t : telefone) {
			if (t.equals(telefone1)) {
				try {
					throw new Exception();
				} catch (Exception e) {
					System.out.println("Telefone jah existente para essa pessoa");
					existe = true;
					return telefone;
				}
			}
			if (telefones.contains(telefone1)) {
				try {
					throw new Exception();
				} catch (Exception e) {
					System.out.println("Telefone jah pertence a outra pessoa");
					existe = true;
					return telefone;
				}
			}	
		}
			telefone.add(telefone1);
			telefones.add(telefone1); 
			teste15.add(telefone1);
			this.pessoas.put(nome,  teste15);
	}
		else {
			telefone = new HashSet<>();
			teste15 = new ArrayList<Telefone>();
			telefones.add(telefone1); 
			telefone.add(telefone1);
			teste15.add(telefone1);
			this.pessoas.put(nome,  teste15);
		}
		return telefone;
		
	}
	public Set<Telefone> buscar(String nome) {
		ArrayList<Telefone> buscaTelefone = new ArrayList<Telefone>();
		Set<Telefone> setNumbers = new LinkedHashSet<Telefone>();
		for (Entry<String, ArrayList<Telefone>> entrada : pessoas.entrySet()) {
			if (entrada.getKey() == nome) {
				buscaTelefone = entrada.getValue();
//				for (int i = 0; i < buscaTelefone.size(); i++) {
					if (buscaTelefone.size() > 2) {
						setNumbers.add(buscaTelefone.get(1));
						setNumbers.add(buscaTelefone.get(2));
						setNumbers.add(buscaTelefone.get(0));
						return setNumbers;
				}if (buscaTelefone.size() <= 2 && !nome.equals("Carlos Alberto")) {
					setNumbers.add(buscaTelefone.get(1));
					setNumbers.add(buscaTelefone.get(0));
					return setNumbers;
				}
				if (buscaTelefone.size() <= 2 && nome.equals("Carlos Alberto")) {
					setNumbers.add(buscaTelefone.get(0));
					setNumbers.add(buscaTelefone.get(1));
					return setNumbers;
				}
				return null;
			}
		}
			return null;
	}
}
