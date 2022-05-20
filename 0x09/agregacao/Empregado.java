
public class Empregado {
	String nome;
	int codigo;
	Endereco endereco;
	
	public String getNome(){
		return nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public int getCodigo(){
		return codigo;
	}
	public void setCodigo(int codigo){
		this.codigo = codigo;
	}
	public Endereco getEndereco(){
		return endereco;
	}
	public void setEndereco(Endereco endereco){
	}
	
	public Empregado(String nome, int codigo, Endereco endereco){
		this.nome = nome;
		this.codigo = codigo;
		this.endereco = endereco;
	}
	
	public void apresentar(int codigo, String nome,Endereco endereco){
	System.out.print("Codigo: " + codigo);
	System.out.print("Nome: " + nome);
	System.out.print("Bairro: " + endereco.bairro);
	System.out.print("Cidade: " + endereco.cidade);
	System.out.print("Pais: " + endereco.pais);
 }
}