
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
		return String.format("[" +nome +"] " + calorias  + " R$ %.6f", preco);
	}
	
	
	
}