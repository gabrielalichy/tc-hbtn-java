public class Autor implements Comparable<Autor>{

	public String nome;
	public String sobrenome;

	public Autor(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	
	public Autor() {
	}


	@Override
	public String toString() {
		return   this.nome + " " +  this.sobrenome ;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}


	@Override
	 public int compareTo(Autor person) {
        return this.nome.compareTo(person.getNome());
    }


}
