import provedores.Frete;

public class Pedido {

	public int codigo;
	public int peso;
	public double total;
	public 	Frete frete;
	
	public Pedido() {
		
	}
	
	public Pedido(int codigo, int peso, double total) {
		this.codigo = codigo;
		this.peso = peso;
		this.total = total;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public Frete getFrete() {
		return frete;
	}

	public void setFrete(Frete frete) {
		this.frete = frete;
	}
	
	
	


	
}
