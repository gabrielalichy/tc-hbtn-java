package provedores;

public class Sedex implements ProvedorFrete{

	public double valorF;
	
	public Frete calcularFrete(double peso, double valor) {
		Frete frete = new Frete();
		
		if (peso > 1) {
			valorF = (valor * 10)/100; 
			frete.setValor(valorF);
		} else {
			valorF = (valor * 5)/100; 
			frete.setValor(valorF);

		}
		frete.setTipoProvedorFrete(TipoProvedorFrete.SEDEX);
		return frete;
	}

	public TipoProvedorFrete obterTipoProvedorFrete() {
		TipoProvedorFrete tipo = TipoProvedorFrete.SEDEX;
		return tipo;
	}

	
	
}