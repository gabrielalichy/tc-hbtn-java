import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public abstract class Armazem<T> implements Armazenavel<T>{

	public HashMap<String, T> map = new HashMap<>();
	
	public Armazem(){};


	@Override
	public Object obterDoInventario(String nome) {
		
		for (Entry<String, T> telefone : map.entrySet()) {
			if (nome.equals("Switch")) {
				Object obj = telefone.getValue();
				return obj;
			}else {
				Object obj = telefone.getValue();
				return obj;
			}
		}
		return null;


		}

	@Override
	public void adicionarAoInventario(String nome, T adicionar) {
		map.put(nome, adicionar);
		
	}
		
	


}