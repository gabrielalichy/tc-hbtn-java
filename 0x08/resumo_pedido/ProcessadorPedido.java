import provedores.Frete;
import provedores.ProvedorFrete;

public class ProcessadorPedido {

	public ProvedorFrete provedor;
	public Frete frete = new Frete();
	
	public ProcessadorPedido(ProvedorFrete provedorFrete) {
			
	}
	
	public void processar(Pedido pedido) {
		 pedido.setFrete(frete);
	}
}


