import java.util.ArrayList;

public class Agencia {

	public String nome;
	private ArrayList<Cliente> clientes;
	
	
	public Agencia(String nome) {
		this.nome = nome;
		this.clientes = new ArrayList<Cliente>();
	}
	
	public boolean novoCliente(String nomeCliente, double valorInicial) {
		return false;
	}
	
	public boolean adicionarTransacaoCliente(String nomeCliente, double valorTransacao) {
		return false;
	}
	
	public boolean buscarCliente(String nomeCliente) {
		for (Cliente cliente : clientes) {
			if (cliente.getNome().equals(nomeCliente)) {
				return true;
			}
		}
		return false;
	}
	
	


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public ArrayList<Cliente> getClientes() {
		return clientes;
	}


	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	
	
}
