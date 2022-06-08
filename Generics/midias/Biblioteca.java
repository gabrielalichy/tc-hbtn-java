import java.util.ArrayList;
import java.util.List;

public class Biblioteca<T> {
	
	List<Object> listaGenerica = (List<Object>) new ArrayList<>();

	public void adicionarMidia(Object pilha) {
		listaGenerica.add(pilha);
	}
	
	public List<Object> obterListaMidias() {
		return this.listaGenerica;
	}
}
