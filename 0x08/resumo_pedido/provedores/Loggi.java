package provedores;

public class Loggi implements ProvedorFrete {

	public double valorF;
	
	@Override
	public Frete calcularFrete(double peso, double valor) {
	Frete frete = new Frete();
		
		if (peso > 5) {
			valorF = (valor * 12)/100; 
			frete.setValor(valor);
		} else {
			valorF = (valor * 4)/100; 
			frete.setValor(valor);

		}
		frete.setTipoProvedorFrete(TipoProvedorFrete.LOGGI);
		return frete;
	}

	@Override
	public TipoProvedorFrete obterTipoProvedorFrete() {
		// TODO Auto-generated method stub
		return null;
	}
}
