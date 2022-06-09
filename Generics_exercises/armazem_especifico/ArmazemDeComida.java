public class ArmazemDeComida extends Armazem<Object>{

	@Override
	public void adicionarAoInventario(String nome, Object adicionar) {
		super.adicionarAoInventario(nome, adicionar);
	}

	
	@Override
	public Comida obterDoInventario(String nome) {
		Object comida = super.obterDoInventario(nome);
		return (Comida) comida; 
	}
}
