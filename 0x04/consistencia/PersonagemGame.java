public class PersonagemGame {
	
	private int saudeAtual;
	public String nome;
	private String status;
		
	public PersonagemGame(int saudeAtual, String nome) {
		this.nome = nome;
		setSaudeAtual(saudeAtual);
	}
	
	public int getSaudeAtual() {
		return saudeAtual;
	}
	public void setSaudeAtual(int saudeAtual) {
		this.saudeAtual = saudeAtual;
		if (saudeAtual > 0) {
			status = "vivo";
		} else {
			status = "morto";
		}
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome != null && !nome.equals("")) {
			this.nome = nome;

		}
	}
	
	public void tomarDano(int quantidadeDeDano) {
	saudeAtual = saudeAtual - quantidadeDeDano;
	setSaudeAtual (saudeAtual);
	if(saudeAtual <= 0) {
		saudeAtual = 0;
	}
	}
	
			
	public void receberCura(int quantidadeDeCura){
		saudeAtual = saudeAtual + quantidadeDeCura; 
		setSaudeAtual(saudeAtual);
		if(saudeAtual >100) {
			saudeAtual = 100;
		}
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}