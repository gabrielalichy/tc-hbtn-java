

public class ItemPedido {

	public int quantidade;
	public Produto produtos;
	public double precoBruto;

	public double getPrecoBruto() {
		precoBruto = produtos.getPrecoBruto();
		return precoBruto;
	}

	public void setPrecoBruto(double precoBruto) {
		this.precoBruto = precoBruto;
	}

	public ItemPedido(Produto produtos, int quantidade) {
		this.quantidade = quantidade;
		this.produtos = produtos;
		this.precoBruto = produtos.getPrecoBruto();
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Produto getProdutos() {
		return produtos;
	}

	public void setProdutos(Produto produtos) {
		this.produtos = produtos;
	}



}