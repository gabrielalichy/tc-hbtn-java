
public class Eletronico {

	public String descricao;
	public Object valor;
	
	
	public Eletronico(String descricao, Object valor) {
		super();
		this.descricao = descricao;
		this.valor = valor;
	}

	@Override
	public String toString() {
		return  "[" +descricao +"] "  + "R$" + valor +",000000";
	}
	
	
	
	
	
}
