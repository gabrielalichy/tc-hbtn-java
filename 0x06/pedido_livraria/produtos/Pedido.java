package produtos;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Pedido {

	public double percentualDesconto;
	public ItemPedido[] itens;

	public Pedido(int percentualDesconto, ItemPedido[] itens) {
		this.itens = itens;
		this.percentualDesconto = percentualDesconto;
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