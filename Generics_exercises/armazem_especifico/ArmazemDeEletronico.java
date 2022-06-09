public class ArmazemDeEletronico extends Armazem<Object>{

	@Override
	public void adicionarAoInventario(String nome, Object adicionar) {
		super.adicionarAoInventario(nome, adicionar);
	}
	
	@Override
	public Eletronico obterDoInventario(String nome) {
		Object ele = super.obterDoInventario(nome);
		return (Eletronico) ele; 
	}
}
