import java.util.function.Consumer;
import java.util.function.Supplier;

public class Produto {

	public String nome;
	public double preco, percentualMarkup;
	
	public Produto(double preco, String nome) {
		this.nome = nome;
		this.preco = preco;
		this.percentualMarkup =10;
		
		}
	
	Supplier<Double> precoComMarkup = () -> (Double) this.getPreco()*(1 + this.percentualMarkup/100);
	Consumer<Double> atualizarMarkup = (novoValor) -> this.percentualMarkup = novoValor;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getPercentualMarkup() {
		return percentualMarkup;
	}

	public void setPercentualMarkup(double percentualMarkup) {
		this.percentualMarkup = percentualMarkup;
	}
	
	
}
