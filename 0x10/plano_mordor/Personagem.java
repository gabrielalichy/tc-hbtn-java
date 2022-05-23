import comida.Comida;
import humor.Feliz;
import humor.Humor;
import humor.Irritado;
import humor.MuitoFeliz;
import humor.Triste;

public class Personagem {
	private int pontosDeFelicidade;

	public int getPontosDeFelicidade() {
		return pontosDeFelicidade;
	}

	public void setPontosDeFelicidade(int pontosDeFelicidade) {
		this.pontosDeFelicidade = pontosDeFelicidade;
	}

	public Humor obterHumorAtual(){
		Humor humor;
		if(getPontosDeFelicidade()< -5) {
			humor = new Irritado();
					} else if(getPontosDeFelicidade() >= -5 && getPontosDeFelicidade() <= 0) {
						humor = new Triste();
					 
					} else if(getPontosDeFelicidade() >= 1 && getPontosDeFelicidade() <= 15) {
						humor = new Feliz();
						
					} else {
						humor = new MuitoFeliz();
					}
		
		return humor;		
		
	}
	
	public void comer(Comida[] comidas) {
	
		for(Comida comida:comidas){
			int pontos = getPontosDeFelicidade();
			
			setPontosDeFelicidade(pontos += comida.getPontosDeFelicidade());
		}
		
	}

	@Override
	public String toString() {
		return pontosDeFelicidade + " - " + obterHumorAtual().getClass().getSimpleName();
	}

}	
