import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Armazem<T> implements Armazenavel<Object>{

	public HashMap<String, Object> map = new HashMap<>();
	
	public Armazem(){};


	@Override
	public T obterDoInventario(String nome) {
		
		for (Entry<String, Object> telefone : map.entrySet()) {
			if (nome.equals("Switch")) {
				
				T value = extracted(telefone);
				T eletronico2 = value;
				return eletronico2;
			}else {
				T comida = extracted(telefone);
				return comida;
			}
		}
		return null;


		}


	private T extracted(Entry<String, Object> telefone) {
		return (T) telefone.getValue();
	}

	@Override
	public void adicionarAoInventario(String nome, Object adicionar) {
		map.put(nome, adicionar);
		
	}
		
	


}