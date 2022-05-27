import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Pedido {

	public double percentualDesconto;
	public ItemPedido[] itens;

	public Pedido(int percentualDesconto, ItemPedido[] itens) {
		this.itens = itens;
		this.percentualDesconto = percentualDesconto;
	}
	
	public void apresentarResumoPedido() {
		double total = 0;
		double totalDesconto = 0;
		DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
		System.out.println("------- RESUMO PEDIDO -------");
		for (int i = 0; i < this.itens.length; i++) {

		double valor = itens[i].getProdutos().obterPrecoLiquido();
		double percentual = (itens[i].getProdutos().obterPrecoLiquido()*this.percentualDesconto)/100;
		total = total +  ( valor * itens[i].getQuantidade()) - ( percentual * itens[i].getQuantidade());
		totalDesconto =totalDesconto + (percentual * itens[i].getQuantidade());
		System.out.println("Tipo: "+ itens[i].getProdutos().getClass().getSimpleName()  +  " " + "Titulo: "  + (itens[i].getProdutos().getTitulo()) + " Preco:  " +  manterCasas( itens[i].getProdutos().obterPrecoLiquido(),2) + " " +  "Quant: " + (itens[i].getQuantidade() + " Total: " +  manterCasas( itens[i].getProdutos().obterPrecoLiquido(),2)));
		
		}	
		System.out.println("----------------------------");
		double valorTotal =  total +  totalDesconto;
		    System.out.println("DESCONTO: " + decimalFormat.format(totalDesconto));
			System.out.println("TOTAL PRODUTO: "+  decimalFormat.format(valorTotal));
			System.out.println("----------------------------");
			System.out.println("TOTAL PEDIDO:: " +manterCasas( total,2));
			System.out.println("----------------------------");
	}
	static double manterCasas(double valor, int qtdCasas) {
		double fator = (double) Math.pow(10, qtdCasas);
	    return (double) (Math.floor(valor * fator) / fator);
	}

	public double calcularTotal() {
		double total = 0;
		for (int i = 0; i < this.itens.length; i++) {
			
			DecimalFormat decimalFormat = new DecimalFormat("#,##0.000");
	        decimalFormat.setRoundingMode(RoundingMode.DOWN);
	        String valor = decimalFormat.format(itens[i].getProdutos().obterPrecoLiquido());
	        String percentual = decimalFormat.format((itens[i].getProdutos().obterPrecoLiquido()*this.percentualDesconto)/100);
			total = total +  ( Double.parseDouble(valor.replaceAll( "," , "." )) * itens[i].getQuantidade()) - ( Double.parseDouble(percentual.replaceAll( "," , "." )) * itens[i].getQuantidade());
			  
		}
		return total ;

	}

}

