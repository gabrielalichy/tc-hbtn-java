
public interface Armazenavel<T> {

	public void adicionarAoInventario(String nome, T adicionar);
	
	public Object obterDoInventario(String nome);
	
}