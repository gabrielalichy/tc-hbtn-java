import provedores.Frete;
import provedores.JadLog;
import provedores.ProvedorFrete;
import provedores.Sedex;
import provedores.TipoProvedorFrete;

public class ProcessadorPedido {
	
	public ProvedorFrete provedor;
	
	public TipoProvedorFrete tipoFrete;
	
	public Pedido pedido;
	
	public double peso;
	
	public double total;
	public Frete f;
	
	public Frete processar(Pedido pedido) {
		this.peso = pedido.peso/1000; 
		if (tipoFrete.equals(TipoProvedorFrete.SEDEX)) {
			f = this.provedor.calcularFrete(this.peso,pedido.getTotal());
		}
		if (tipoFrete.equals(TipoProvedorFrete.JADLOG)) {
			f = this.provedor.calcularFrete(this.peso,pedido.getTotal());
		}
		if (tipoFrete.equals(TipoProvedorFrete.LOGGI)) {
			f = this.provedor.calcularFrete(this.peso,pedido.getTotal());
		}
		
		pedido.setFrete(f);
		return f;
		
	}
	
	public ProcessadorPedido(ProvedorFrete provedorFrete) {
		this.provedor = provedorFrete;
		this.tipoFrete = provedorFrete.obterTipoProvedorFrete();

		
	}
	



}



