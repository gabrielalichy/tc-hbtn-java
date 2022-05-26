package produtos;

public class Dvd extends Produto{

		public String diretor;
		public String genero;
		public int duracao;



	public Dvd(String titulo, int ano, String pais, double precoBruto, String diretor, String genero, int duracao) {
		super(titulo, ano, pais, precoBruto);
		this.titulo = titulo;
		this.ano = ano;
		this.pais = pais;
		this.precoBruto = precoBruto;
		this.diretor = diretor;
		this.genero = genero;
		this.duracao = duracao;
	}

	@Override
	public double obterPrecoLiquido() {
		double percentualDesconto = precoBruto*20/100;
		return this.precoBruto + percentualDesconto;
	}
}