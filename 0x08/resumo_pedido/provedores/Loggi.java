package provedores;

public class Loggi implements ProvedorFrete {

	public double valorF;
	
	public Frete calcularFrete(double peso, double valor) {
	Frete frete = new Frete();
		
		if (peso > 5) {
			valorF = (valor * 12)/100; 
			frete.setValor(valorF);
		} else {
			valorF = (valor * 4)/100; 
			frete.setValor(valorF);

		}
		frete.setTipoProvedorFrete(TipoProvedorFrete.LOGGI);
		return frete;
	}

	public TipoProvedorFrete obterTipoProvedorFrete() {
		TipoProvedorFrete tipo = TipoProvedorFrete.LOGGI;
		return tipo;
	}
}