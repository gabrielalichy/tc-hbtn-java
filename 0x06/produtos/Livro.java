package produtos;

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
		this.precoBruto = (precoBruto * 100)/obterPrecoLiquido();
		this.paginas = paginas;
		this.autor = autor;
		this.edicao = edicao;
		this.preco = precoBruto;
	}

	@Override
	public double obterPrecoLiquido() {
		System.out.println(this.preco);
		
		double percentualDesconto = (preco*15)/100;
		System.out.println(percentualDesconto);

		return precoBruto + percentualDesconto;
	}
	
	
}
