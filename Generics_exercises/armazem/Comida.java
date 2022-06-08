
public class Comida {

	public String nome;
	public int calorias;
	public Object preco;
	
	
	public Comida(String nome, int string, Object object) {
		this.nome = nome;
		this.calorias = string;
		this.preco = object;
	}


	@Override
	public String toString() {
		return  "[" +nome +"] " + calorias+",000000"  + " R$" + String.format("%f", preco);
	}
	
	
	
}