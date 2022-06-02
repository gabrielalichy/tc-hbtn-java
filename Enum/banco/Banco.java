import java.util.ArrayList;

public class Banco {

	public String nome;
	private ArrayList<Agencia> agencias;

	public Banco(String nome) {
		this.nome = nome;
		this.agencias = new ArrayList<Agencia>();

	}

	public Agencia buscarAgencia(String nomeAgencia) {
		for (Agencia agencia : agencias) {
			if (agencia.getNome().equals(nomeAgencia)) {
				return agencia;
			}
		}
		return null;
	}

	public boolean adicionarAgencia(String nomeAgencia) {

		Agencia retorno = buscarAgencia(nomeAgencia);
		if (retorno != null) {
			return false;
		}
		Agencia a = new Agencia(nomeAgencia);
		this.agencias.add(a);
		return true;

	}

	public boolean adicionarCliente(String nomeAgencia, String nomeCliente, double valorInicial) {

		Agencia retorno = buscarAgencia(nomeAgencia);
		boolean busca = retorno.buscarCliente(nomeCliente);

		if (busca == true) {
			return false;
		}
		Cliente c = new Cliente(nomeCliente, valorInicial);
		retorno.getClientes().add(c);
		return true;
	}

	public boolean adicionarTransacaoCliente(String nomeAgencia, String nomeCliente, double valorTransacao) {
		boolean busca = this.agencias.get(0).buscarCliente(nomeCliente);
		if (busca != true) {
			return false;
		} else {
			for (int i = 0; i < this.agencias.get(0).getClientes().size(); i++) {
				if (this.agencias.get(0).getClientes().get(i).getNome().equals(nomeCliente)) {
					this.agencias.get(0).getClientes().get(i).getTransacoes().add(valorTransacao);
				}
				
			}
			return true;
		}

	}

	public boolean listarClientes(String nomeAgencia, boolean imprimeTransacao) {

		Agencia retorno = buscarAgencia(nomeAgencia);
		if (retorno != null) {
			int b = 0;
			for (int i = 0; i < retorno.getClientes().size(); i++) {
				b = b + 1;
					System.out.println("Cliente: " + retorno.getClientes().get(i).getNome() + " [" + b + "]");
					int a = 0;
					for (int j = 0; j < retorno.getClientes().get(i).getTransacoes().size(); j++) {
						a =		a +1;
						System.out.println("[" + a + "] " + "valor " + retorno.getClientes().get(i).getTransacoes().get(j) );
					}
			}
			return true;
		}

		return false;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Agencia> getAgencias() {
		return agencias;
	}

	public void setAgencias(ArrayList<Agencia> agencias) {
		this.agencias = agencias;
	}
}