package provedores;

public class JadLog implements ProvedorFrete{

	public double valorF;
	


	public TipoProvedorFrete obterTipoProvedorFrete() {
		TipoProvedorFrete tipo = TipoProvedorFrete.JADLOG;
		return tipo;
	}



	public Frete calcularFrete(double peso, double valor) {
	Frete frete = new Frete();
		
		if (peso > 2) {
			valorF = (valor * 7)/100; 
			frete.setValor(valorF);
		} else {
			valorF = (valor * 4.5)/100; 
			frete.setValor(valorF);

		}
		frete.setTipoProvedorFrete(TipoProvedorFrete.JADLOG);
		return frete;
	}

}