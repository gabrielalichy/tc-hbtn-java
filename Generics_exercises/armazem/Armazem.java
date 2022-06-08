import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Armazem<T> implements Armazenavel<Object>{

	public HashMap<String, Object> map = new HashMap<String, Object>();
	
	public Armazem(){};


	@Override
	public T obterDoInventario(String nome) {
		
		for (Entry<String, Object> telefone : map.entrySet()) {
			T value = (T) telefone.getValue();
			if (nome.equals("Switch")) {
				
				T eletronico2 = value;
				return eletronico2;
			}else {
				T comida = value;
				return comida;
			}
		}
		return null;


		}

	@Override
	public void adicionarAoInventario(String nome, Object adicionar) {
		map.put(nome, adicionar);
		
	}
		
	


}