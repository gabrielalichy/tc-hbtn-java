
public class Tarefa {

	public String descricao;
	public boolean estahFeita;
	public int identificador;
	
	public Tarefa(String descricao, int identificador) {
		this.descricao = descricao;
		this.identificador = identificador;
		modificarDescricao();
	}

	public void modificarDescricao() {
		if(this.descricao == null || this.descricao.isEmpty()) {
			throw new IllegalArgumentException("Descricao de tarefa invalida");
		}
		
	}
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isEstahFeita() {
		return estahFeita;
	}

	public void setEstahFeita(boolean estahFeita) {
		this.estahFeita = estahFeita;
	}

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identicador) {
		this.identificador = identicador;
	}
	
}
