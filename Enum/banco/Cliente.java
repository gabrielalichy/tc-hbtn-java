import java.util.ArrayList;

public class Cliente {

	public String nome;
	ArrayList<Double> transacoes;
	
	public Cliente(String nome, double valorInicial) {
		this.nome = nome;
		this.transacoes = new ArrayList<Double>();
		adicionarTransacao(valorInicial);
	}
	
	public void adicionarTransacao(double valorTransacao) {
		transacoes.add(valorTransacao);
	}
	
	
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Double> getTransacoes() {
		return transacoes;
	}

	public void setTransacoes(ArrayList<Double> transacoes) {
		this.transacoes = transacoes;
	}
	
	
	
	
}