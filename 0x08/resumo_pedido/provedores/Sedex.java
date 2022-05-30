package provedores;

public class Sedex implements ProvedorFrete{

	public double valorF;
	
	@Override
	public Frete calcularFrete(double peso, double valor) {
		Frete frete = new Frete();
		
		if (peso > 1) {
			valorF = (valor * 10)/100; 
			frete.setValor(valor);
		} else {
			valorF = (valor * 5)/100; 
			frete.setValor(valor);

		}
		frete.setTipoProvedorFrete(TipoProvedorFrete.SEDEX);
		return frete;
	}

	@Override
	public TipoProvedorFrete obterTipoProvedorFrete() {
		return null;
	}

}
