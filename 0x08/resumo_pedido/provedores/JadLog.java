package provedores;

public class JadLog implements ProvedorFrete{

	public double valorF;
	
	@Override
	public Frete calcularFrete(double peso, double valor) {
	Frete frete = new Frete();
		
		if (peso > 2) {
			valorF = (valor * 7)/100; 
			frete.setValor(valor);
		} else {
			valorF = (valor * 4)/100; 
			frete.setValor(valor);

		}
		frete.setTipoProvedorFrete(TipoProvedorFrete.JADLOG);
		return frete;
	}

	@Override
	public TipoProvedorFrete obterTipoProvedorFrete() {
		// TODO Auto-generated method stub
		return null;
	}

}
