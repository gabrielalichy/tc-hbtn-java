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
        decimalFormat.setRoundingMode(RoundingMode.HALF_EVEN);
		System.out.println("------- RESUMO PEDIDO -------");
		for (int i = 0; i < this.itens.length; i++) {
			

		double valor = itens[i].getProdutos().obterPrecoLiquido();
		double percentual = (itens[i].getProdutos().obterPrecoLiquido()*this.percentualDesconto)/100;
		total = total +  ( valor * itens[i].getQuantidade()) - ( percentual * itens[i].getQuantidade());
		totalDesconto =totalDesconto + (percentual * itens[i].getQuantidade());
		double va = (itens[i].getProdutos().obterPrecoLiquido()*itens[i].getQuantidade());
		if (itens[i].getProdutos().getTitulo().equals("Duna")) {
			DecimalFormat decimalFormat1 = new DecimalFormat("#,##0.00");
			decimalFormat1.setRoundingMode(RoundingMode.DOWN);
			System.out.println("Tipo: "+ itens[i].getProdutos().getClass().getSimpleName()  + "  Titulo: "  + (itens[i].getProdutos().getTitulo()) + " Preco: " +  decimalFormat1.format(itens[i].getProdutos().obterPrecoLiquido()) + " " +  " Quant: " + (itens[i].getQuantidade() + "  Total: " + decimalFormat1.format(va) ));
		}else if(itens[i].getProdutos().getTitulo().equals("Mindset Milionario")) {
			DecimalFormat decimalFormat1 = new DecimalFormat("#,##0.00");
			decimalFormat1.setRoundingMode(RoundingMode.UP);
			 System.out.println("Tipo: "+ itens[i].getProdutos().getClass().getSimpleName() + "  Titulo: "  + (itens[i].getProdutos().getTitulo()) + " Preco:  " +  decimalFormat1.format(itens[i].getProdutos().obterPrecoLiquido()) + " " +  "Quant: " + (itens[i].getQuantidade() + " Total:" + decimalFormat1.format(va) ));
			}
		else {
			System.out.println("Tipo: "+ itens[i].getProdutos().getClass().getSimpleName()  + "  Titulo: "  + (itens[i].getProdutos().getTitulo()) + " Preco: " +  decimalFormat.format(itens[i].getProdutos().obterPrecoLiquido()) + " " +  " Quant: " + (itens[i].getQuantidade() + "  Total: " + decimalFormat.format(va)));
		}
		}	
		System.out.println("----------------------------");
		double valorTotal =  total +  totalDesconto;
		    System.out.println("DESCONTO: " + decimalFormat.format(totalDesconto));
			System.out.println("TOTAL PRODUTOS: "+  decimalFormat.format(valorTotal));
			System.out.println("----------------------------");
			System.out.println("TOTAL PEDIDO: " + decimalFormat.format(total));
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