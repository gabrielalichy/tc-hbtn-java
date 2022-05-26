


public class Livro extends Produto{

	public int paginas;
	public String autor;
	public int edicao;
	public double preco;


	public Livro(String titulo, int ano, String pais, double precoBruto, int paginas, String autor, int edicao) {
		super(titulo, ano, pais, precoBruto);
		this.titulo = titulo;
		this.ano = ano;
		this.pais = pais;
		
		this.precoBruto = precoBruto;
		this.paginas = paginas;
		this.autor = autor;
		this.edicao = edicao;
		this.preco = precoBruto;
	}

	@Override
	public double obterPrecoLiquido() {
		double percentualDesconto = preco*15/100;
		return precoBruto + percentualDesconto;
	}


}