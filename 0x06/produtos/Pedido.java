package produtos;

public class Pedido {

	public double percentualDesconto;
	public ItemPedido[] itens;
	
	public Pedido(int percentualDesconto, ItemPedido[] itens) {
		this.itens = itens;
		this.percentualDesconto = percentualDesconto;
	}

	public double calcularTotal() {
		double total = 0;
		for (int i = 0; i < this.itens.length; i++) {
			total = total + itens[i].getQuantidade() + percentualDesconto + itens[i].getPrecoBruto();
	
		}
		return total;
	
	}
	
}
