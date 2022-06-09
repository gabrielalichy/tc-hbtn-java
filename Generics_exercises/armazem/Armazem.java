import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Armazem<T> implements Armazenavel<T>{

	public HashMap<String, T> map = new HashMap<>();
	
	public Armazem(){};

	public T obterDoInventario(String nome) {
			
			for (Entry<String, T> telefone : map.entrySet()) {
				if (nome.equals("Switch")) {
					
					T eletronico2 = (T) telefone.getValue();
					return eletronico2;
				}else {
					T comida = (T) telefone.getValue();
					return comida;
				}
			}
			return null;
	
	
			}

	@Override
	public void adicionarAoInventario(String nome, T adicionar) {
		map.put(nome, adicionar);
		
	}
		
	


}